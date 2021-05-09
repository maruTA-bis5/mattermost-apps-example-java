package net.bis5.mattermost.apps.helloworld.model;

public class Manifest implements MattermostAppsModel {

    private String appId;
    private String appType;
    private String version;
    private String homepageUrl;
    private String displayName;
    private String description;
    private Call bindings;
    private Call onInstall;
    private Call onVersionChanged;
    private Call onUninstall;
    private Call onDisable;
    private Call onEnable;
    private Call getOauth2ConnectUrl;
    private Call onOauth2Complete;
    private String[] requestedPermissions;
    private String[] requestedLocations;
    private String rootUrl;
    private AwsLambdaFunction[] awsLambda;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }
    public String getAppType() {
        return appType;
    }
    public void setAppType(String appType) {
        this.appType = appType;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getHomepageUrl() {
        return homepageUrl;
    }
    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Call getBindings() {
        return bindings;
    }
    public void setBindings(Call bindings) {
        this.bindings = bindings;
    }
    public Call getOnInstall() {
        return onInstall;
    }
    public void setOnInstall(Call onInstall) {
        this.onInstall = onInstall;
    }
    public Call getOnVersionChanged() {
        return onVersionChanged;
    }
    public void setOnVersionChanged(Call onVersionChanged) {
        this.onVersionChanged = onVersionChanged;
    }
    public Call getOnUninstall() {
        return onUninstall;
    }
    public void setOnUninstall(Call onUninstall) {
        this.onUninstall = onUninstall;
    }
    public Call getOnDisable() {
        return onDisable;
    }
    public void setOnDisable(Call onDisable) {
        this.onDisable = onDisable;
    }
    public Call getOnEnable() {
        return onEnable;
    }
    public void setOnEnable(Call onEnable) {
        this.onEnable = onEnable;
    }
    public Call getGetOauth2ConnectUrl() {
        return getOauth2ConnectUrl;
    }
    public void setGetOauth2ConnectUrl(Call getOauth2ConnectUrl) {
        this.getOauth2ConnectUrl = getOauth2ConnectUrl;
    }
    public Call getOnOauth2Complete() {
        return onOauth2Complete;
    }
    public void setOnOauth2Complete(Call onOauth2Complete) {
        this.onOauth2Complete = onOauth2Complete;
    }
    public String[] getRequestedPermissions() {
        return requestedPermissions;
    }
    public void setRequestedPermissions(String... requestedPermissions) {
        this.requestedPermissions = requestedPermissions;
    }
    public String[] getRequestedLocations() {
        return requestedLocations;
    }
    public void setRequestedLocations(String... requestedLocations) {
        this.requestedLocations = requestedLocations;
    }
    public String getRootUrl() {
        return rootUrl;
    }
    public void setRootUrl(String rootUrl) {
        this.rootUrl = rootUrl;
    }
    public AwsLambdaFunction[] getAwsLambda() {
        return awsLambda;
    }
    public void setAwsLambda(AwsLambdaFunction[] awsLambda) {
        this.awsLambda = awsLambda;
    }
}
