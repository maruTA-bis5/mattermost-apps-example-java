package net.bis5.mattermost.apps.helloworld.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallResponse<T> implements MattermostAppsModel {

    public enum CallResponseType {
        OK("ok"), ERROR("error"), FORM("form"), CALL("call"), NAVIGATE("navigate");
        private final String code;
        CallResponseType(String code) {
            this.code = code;
        }
        @Override
        public String toString() {
            return code;
        }
    }

    public static <T> CallResponse<T> ok(T data) {
        return withType(CallResponseType.OK, data);
    }

    public static <T> CallResponse<T> withType(CallResponseType type, T data) {
        var response = new CallResponse<T>();
        response.setType(type);
        response.setData(data);
        return response;
    }

    public static CallResponse<Void> form(Form form) {
        var response = new CallResponse<Void>();
        response.setType(CallResponseType.FORM);
        response.setForm(form);
        return response;
    }

    private CallResponseType type;
    private String markdown;
    private T data;
    @JsonProperty("error")
    private String errorText;
    private String navigateToUrl;
    private boolean useExternalBrowser;
    private Call call;
    private Form form;

    public CallResponseType getType() {
        return type;
    }

    public void setType(CallResponseType type) {
        this.type = type;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public String getNavigateToUrl() {
        return navigateToUrl;
    }

    public void setNavigateToUrl(String navigateToUrl) {
        this.navigateToUrl = navigateToUrl;
    }

    public boolean isUseExternalBrowser() {
        return useExternalBrowser;
    }

    public void setUseExternalBrowser(boolean useExternalBrowser) {
        this.useExternalBrowser = useExternalBrowser;
    }

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }
}
