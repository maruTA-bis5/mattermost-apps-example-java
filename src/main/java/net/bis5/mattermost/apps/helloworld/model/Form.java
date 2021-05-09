package net.bis5.mattermost.apps.helloworld.model;

import java.util.ArrayList;
import java.util.List;

public class Form implements MattermostAppsModel {

    private String title;
    private String header;
    private String footer;
    private String icon;
    private Call call;
    private String submitButtons;
    private boolean cancelButton;
    private boolean submitOnCancel;
    private List<Field> fields = new ArrayList<>();

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    public String getFooter() {
        return footer;
    }
    public void setFooter(String footer) {
        this.footer = footer;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Call getCall() {
        return call;
    }
    public void setCall(Call call) {
        this.call = call;
    }
    public String getSubmitButtons() {
        return submitButtons;
    }
    public void setSubmitButtons(String submitButtons) {
        this.submitButtons = submitButtons;
    }
    public boolean isCancelButton() {
        return cancelButton;
    }
    public void setCancelButton(boolean cancelButton) {
        this.cancelButton = cancelButton;
    }
    public boolean isSubmitOnCancel() {
        return submitOnCancel;
    }
    public void setSubmitOnCancel(boolean submitOnCancel) {
        this.submitOnCancel = submitOnCancel;
    }
    public List<Field> getFields() {
        return fields;
    }
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

}
