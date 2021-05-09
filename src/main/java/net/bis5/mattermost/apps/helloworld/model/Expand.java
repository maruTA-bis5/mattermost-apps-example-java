package net.bis5.mattermost.apps.helloworld.model;

public class Expand implements MattermostAppsModel {

    public enum ExpandLevel {
        DEFAULT(""), NONE("none"), ALL("all"), SUMMARY("summary");
        private final String code;
        ExpandLevel(String code) {
            this.code = code;
        }
        @Override
        public String toString() {
            return code;
        }
    }

    private ExpandLevel app;
    private ExpandLevel actingUser;
    private ExpandLevel actingUserAccessToken;
    private ExpandLevel adminAccessToken;
    private ExpandLevel channel;
    private ExpandLevel Mentioned;
    private ExpandLevel Post;
    private ExpandLevel RootPost;
    private ExpandLevel team;
    private ExpandLevel user;
    private ExpandLevel oauth2App;
    private ExpandLevel oauth2User;

    public ExpandLevel getApp() {
        return app;
    }
    public void setApp(ExpandLevel app) {
        this.app = app;
    }
    public ExpandLevel getActingUser() {
        return actingUser;
    }
    public void setActingUser(ExpandLevel actingUser) {
        this.actingUser = actingUser;
    }
    public ExpandLevel getActingUserAccessToken() {
        return actingUserAccessToken;
    }
    public void setActingUserAccessToken(ExpandLevel actingUserAccessToken) {
        this.actingUserAccessToken = actingUserAccessToken;
    }
    public ExpandLevel getAdminAccessToken() {
        return adminAccessToken;
    }
    public void setAdminAccessToken(ExpandLevel adminAccessToken) {
        this.adminAccessToken = adminAccessToken;
    }
    public ExpandLevel getChannel() {
        return channel;
    }
    public void setChannel(ExpandLevel channel) {
        this.channel = channel;
    }
    public ExpandLevel getMentioned() {
        return Mentioned;
    }
    public void setMentioned(ExpandLevel mentioned) {
        Mentioned = mentioned;
    }
    public ExpandLevel getPost() {
        return Post;
    }
    public void setPost(ExpandLevel post) {
        Post = post;
    }
    public ExpandLevel getRootPost() {
        return RootPost;
    }
    public void setRootPost(ExpandLevel rootPost) {
        RootPost = rootPost;
    }
    public ExpandLevel getTeam() {
        return team;
    }
    public void setTeam(ExpandLevel team) {
        this.team = team;
    }
    public ExpandLevel getUser() {
        return user;
    }
    public void setUser(ExpandLevel user) {
        this.user = user;
    }
    public ExpandLevel getOauth2App() {
        return oauth2App;
    }
    public void setOauth2App(ExpandLevel oauth2App) {
        this.oauth2App = oauth2App;
    }
    public ExpandLevel getOauth2User() {
        return oauth2User;
    }
    public void setOauth2User(ExpandLevel oauth2User) {
        this.oauth2User = oauth2User;
    }

}
