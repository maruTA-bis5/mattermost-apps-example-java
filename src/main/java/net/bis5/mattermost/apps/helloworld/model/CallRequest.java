package net.bis5.mattermost.apps.helloworld.model;

import java.util.Map;

public class CallRequest implements MattermostAppsModel {

    private String path;
    private Expand expand;
    private Object state;
    private Map<String, String> values;
    private Context context;
    private String rawCommand;
    private String selectedField;
    private String query;

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
    public Map<String, String> getValues() {
        return values != null ? values : Map.of();
    }
    public void setValues(Map<String, String> values) {
        this.values = values;
    }
    public Context getContext() {
        return context;
    }
    public void setContext(Context context) {
        this.context = context;
    }
    public String getRawCommand() {
        return rawCommand;
    }
    public void setRawCommand(String rawCommand) {
        this.rawCommand = rawCommand;
    }
    public String getSelectedField() {
        return selectedField;
    }
    public void setSelectedField(String selectedField) {
        this.selectedField = selectedField;
    }
    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }
}
