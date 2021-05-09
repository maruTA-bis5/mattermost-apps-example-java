package net.bis5.mattermost.apps.helloworld.model;

import java.util.ArrayList;
import java.util.List;

public class Binding implements MattermostAppsModel {

    private String location;
    private String icon;
    private String label;
    private String hint;
    private String description;
    private String roleId;
    private boolean dependsOnTeam;
    private boolean dependsOnChannel;
    private boolean dependsOnUser;
    private boolean dependsOnPost;
    private Call call;
    private List<Binding> bindings = new ArrayList<>();
    private Form form;

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getHint() {
        return hint;
    }
    public void setHint(String hint) {
        this.hint = hint;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getRoleId() {
        return roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    public boolean isDependsOnTeam() {
        return dependsOnTeam;
    }
    public void setDependsOnTeam(boolean dependsOnTeam) {
        this.dependsOnTeam = dependsOnTeam;
    }
    public boolean isDependsOnChannel() {
        return dependsOnChannel;
    }
    public void setDependsOnChannel(boolean dependsOnChannel) {
        this.dependsOnChannel = dependsOnChannel;
    }
    public boolean isDependsOnUser() {
        return dependsOnUser;
    }
    public void setDependsOnUser(boolean dependsOnUser) {
        this.dependsOnUser = dependsOnUser;
    }
    public boolean isDependsOnPost() {
        return dependsOnPost;
    }
    public void setDependsOnPost(boolean dependsOnPost) {
        this.dependsOnPost = dependsOnPost;
    }
    public Call getCall() {
        return call;
    }
    public void setCall(Call call) {
        this.call = call;
    }
    public List<Binding> getBindings() {
        return bindings;
    }
    public void setBindings(List<Binding> bindings) {
        this.bindings = bindings;
    }
    public Form getForm() {
        return form;
    }
    public void setForm(Form form) {
        this.form = form;
    }

}
