package net.bis5.mattermost.apps.helloworld.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Field implements MattermostAppsModel {

    public enum FieldType {
        TEXT("text"), STATIC_SELECT("static_select"), BOOL("bool"), USER("user"), CHANNEL("channel");
        private final String code;
        FieldType(String code) {
            this.code = code;
        }
        @Override
        public String toString() {
            return code;
        }
    }
    public enum TextFieldSubtype {
        INPUT("input"), TEXTAREA("textarea"), NUMBER("number"), EMAIL("email"), TELEPHONE("tel"), URL("url"), PASSWORD("password");
        private final String code;
        TextFieldSubtype(String code) {
            this.code = code;
        }
        @Override
        public String toString() {
            return code;
        }
    }
    private String name;
    private FieldType type;
    @JsonProperty("is_required")
    private boolean required;
    private boolean readonly;
    private Object value;
    private String description;
    private String label;
    @JsonProperty("hint")
    private String autocompleteHint;
    @JsonProperty("position")
    private int autocompletePosition;
    private String modalLabel;
    @JsonProperty("multiselect")
    private boolean selectIsMulti;
    @JsonProperty("refresh")
    private boolean selectRefresh;
    private List<SelectOption> selectStaticOptions = new ArrayList<>();
    @JsonProperty("subtype")
    private TextFieldSubtype textSubtype;
    @JsonProperty("min_length")
    private int textMinLength;
    @JsonProperty("max_length")
    private int textMaxLength;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public FieldType getType() {
        return type;
    }
    public void setType(FieldType type) {
        this.type = type;
    }
    public boolean isRequired() {
        return required;
    }
    public void setRequired(boolean required) {
        this.required = required;
    }
    public boolean isReadonly() {
        return readonly;
    }
    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getAutocompleteHint() {
        return autocompleteHint;
    }
    public void setAutocompleteHint(String autocompleteHint) {
        this.autocompleteHint = autocompleteHint;
    }
    public int getAutocompletePosition() {
        return autocompletePosition;
    }
    public void setAutocompletePosition(int autocompletePosition) {
        this.autocompletePosition = autocompletePosition;
    }
    public String getModalLabel() {
        return modalLabel;
    }
    public void setModalLabel(String modalLabel) {
        this.modalLabel = modalLabel;
    }
    public boolean isSelectIsMulti() {
        return selectIsMulti;
    }
    public void setSelectIsMulti(boolean selectIsMulti) {
        this.selectIsMulti = selectIsMulti;
    }
    public boolean isSelectRefresh() {
        return selectRefresh;
    }
    public void setSelectRefresh(boolean selectRefresh) {
        this.selectRefresh = selectRefresh;
    }
    public List<SelectOption> getSelectStaticOptions() {
        return selectStaticOptions;
    }
    public void setSelectStaticOptions(List<SelectOption> selectStaticOptions) {
        this.selectStaticOptions = selectStaticOptions;
    }
    public TextFieldSubtype getTextSubtype() {
        return textSubtype;
    }
    public void setTextSubtype(TextFieldSubtype textSubtype) {
        this.textSubtype = textSubtype;
    }
    public int getTextMinLength() {
        return textMinLength;
    }
    public void setTextMinLength(int textMinLength) {
        this.textMinLength = textMinLength;
    }
    public int getTextMaxLength() {
        return textMaxLength;
    }
    public void setTextMaxLength(int textMaxLength) {
        this.textMaxLength = textMaxLength;
    }

}
