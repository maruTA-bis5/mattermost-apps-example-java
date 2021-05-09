package net.bis5.mattermost.apps.helloworld.model;

public class Call implements MattermostAppsModel {

    private String path;
    private Expand expand;
    private Object state;

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public Expand getExpand() {
        return expand;
    }
    public void setExpand(Expand expand) {
        this.expand = expand;
    }
    public Object getState() {
        return state;
    }
    public void setState(Object state) {
        this.state = state;
    }

}
