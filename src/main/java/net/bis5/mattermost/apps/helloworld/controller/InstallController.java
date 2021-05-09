package net.bis5.mattermost.apps.helloworld.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.bis5.mattermost.apps.helloworld.model.CallResponse;

@Path("/install")
public class InstallController {

    @POST
    public CallResponse<Void> install() {
        CallResponse<Void> response = CallResponse.ok(null);
        response.setMarkdown("test");
        return response;
    }
}
