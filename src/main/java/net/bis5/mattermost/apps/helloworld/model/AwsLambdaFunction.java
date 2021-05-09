package net.bis5.mattermost.apps.helloworld.model;

public class AwsLambdaFunction implements MattermostAppsModel {

    private String path;
    private String name;
    private String handler;
    private String runtime;

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHandler() {
        return handler;
    }
    public void setHandler(String handler) {
        this.handler = handler;
    }
    public String getRuntime() {
        return runtime;
    }
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

}
