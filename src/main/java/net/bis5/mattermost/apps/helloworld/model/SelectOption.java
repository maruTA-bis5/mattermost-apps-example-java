package net.bis5.mattermost.apps.helloworld.model;

public class SelectOption implements MattermostAppsModel {

    private String label;
    private String value;
    private String iconData;

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getIconData() {
        return iconData;
    }
    public void setIconData(String iconData) {
        this.iconData = iconData;
    }

}
