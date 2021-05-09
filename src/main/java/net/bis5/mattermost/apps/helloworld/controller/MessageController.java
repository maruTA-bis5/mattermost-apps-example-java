package net.bis5.mattermost.apps.helloworld.controller;

import javax.inject.Singleton;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.bis5.mattermost.apps.helloworld.model.CallRequest;
import net.bis5.mattermost.apps.helloworld.model.CallResponse;

@Path("/message")
@Singleton
public class MessageController {
    
    @POST 
    @Path("/submit")
    public CallResponse<Void> receiveMessage(CallRequest request) {
        String message = "Hello, world!";
        if (request.getValues().containsKey("message")) {
            message += String.format(" ... and %s!", request.getValues().get("message"));
        }
        CallResponse<Void> response = CallResponse.ok(null);
        response.setMarkdown(message);

        return response;
    }
}
