package net.bis5.mattermost.apps.helloworld.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Context implements MattermostAppsModel {

    private String subject;
    private String botUserId;
    private String actingUserId;
    private String userId;
    private String mattermostSiteUrl;
    private String appPath;

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getBotUserId() {
        return botUserId;
    }
    public void setBotUserId(String botUserId) {
        this.botUserId = botUserId;
    }
    public String getActingUserId() {
        return actingUserId;
    }
    public void setActingUserId(String actingUserId) {
        this.actingUserId = actingUserId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getMattermostSiteUrl() {
        return mattermostSiteUrl;
    }
    public void setMattermostSiteUrl(String mattermostSiteUrl) {
        this.mattermostSiteUrl = mattermostSiteUrl;
    }
    public String getAppPath() {
        return appPath;
    }
    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    // UserAgentContext

    private String teamId;
    private String channelId;
    private String postId;
    private String rootPostId;
    private String appId;
    private String location;
    private String userAgent;

    public String getTeamId() {
        return teamId;
    }
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
    public String getChannelId() {
        return channelId;
    }
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
    public String getPostId() {
        return postId;
    }
    public void setPostId(String postId) {
        this.postId = postId;
    }
    public String getRootPostId() {
        return rootPostId;
    }
    public void setRootPostId(String rootPostId) {
        this.rootPostId = rootPostId;
    }
    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getUserAgent() {
        return userAgent;
    }
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    // ExpandedContext

    private String botAccessToken;
    private Map<String, Object> actingUser; /* *model.User */
    private String actingUserAccessToken;
    private String adminAccessToken;
    @JsonProperty("oauth2")
    private OAuth2Context oauth2Context;
    private Map<String, Object> app; /* *App */
    private Map<String, Object> channel; /* *model.Channel */
    private List<Map<String, Object>> mentioned; /* *model.User[] */
    private Map<String, Object> post; /* *model.Post */
    private Map<String, Object> rootPost; /* *model.Post */
    private Map<String, Object> team; /* *model.Team */

    private Map<String, Object> user; /* *model.User */

    public String getBotAccessToken() {
        return botAccessToken;
    }
    public void setBotAccessToken(String botAccessToken) {
        this.botAccessToken = botAccessToken;
    }
    public Map<String, Object> getActingUser() {
        return actingUser;
    }
    public void setActingUser(Map<String, Object> actingUser) {
        this.actingUser = actingUser;
    }
    public String getActingUserAccessToken() {
        return actingUserAccessToken;
    }
    public void setActingUserAccessToken(String actingUserAccessToken) {
        this.actingUserAccessToken = actingUserAccessToken;
    }
    public String getAdminAccessToken() {
        return adminAccessToken;
    }
    public void setAdminAccessToken(String adminAccessToken) {
        this.adminAccessToken = adminAccessToken;
    }
    public OAuth2Context getOauth2Context() {
        return oauth2Context;
    }
    public void setOauth2Context(OAuth2Context oauth2Context) {
        this.oauth2Context = oauth2Context;
    }
    public Map<String, Object> getApp() {
        return app;
    }
    public void setApp(Map<String, Object> app) {
        this.app = app;
    }
    public Map<String, Object> getChannel() {
        return channel;
    }
    public void setChannel(Map<String, Object> channel) {
        this.channel = channel;
    }
    public List<Map<String, Object>> getMentioned() {
        return mentioned;
    }
    public void setMentioned(List<Map<String, Object>> mentioned) {
        this.mentioned = mentioned;
    }
    public Map<String, Object> getPost() {
        return post;
    }
    public void setPost(Map<String, Object> post) {
        this.post = post;
    }
    public Map<String, Object> getRootPost() {
        return rootPost;
    }
    public void setRootPost(Map<String, Object> rootPost) {
        this.rootPost = rootPost;
    }
    public Map<String, Object> getTeam() {
        return team;
    }
    public void setTeam(Map<String, Object> team) {
        this.team = team;
    }
    public Map<String, Object> getUser() {
        return user;
    }
    public void setUser(Map<String, Object> user) {
        this.user = user;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class OAuth2Context implements MattermostAppsModel {

        // TODO
    }

}
