package net.bis5.mattermost.apps.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.bis5.mattermost.apps.helloworld.model.Binding;
import net.bis5.mattermost.apps.helloworld.model.Call;
import net.bis5.mattermost.apps.helloworld.model.CallResponse;

@Path("/bindings")
@Singleton
public class BindingsController {

    @POST
    public CallResponse<List<Binding>> getBindings() {
        List<Binding> bindings = new ArrayList<>();
        var headerBinding = new Binding();
        headerBinding.setLocation("/channel_header");
        var headerSendButtonBinding = new Binding();
        headerSendButtonBinding.setLocation("send-button");
        headerSendButtonBinding.setIcon("http://localhost:8080/static/icon.png");
        headerSendButtonBinding.setLabel("send hello message");
        var headerSendCall = new Call();
        headerSendCall.setPath("/send/modal");
        headerSendButtonBinding.setCall(headerSendCall);
        headerBinding.getBindings().add(headerSendButtonBinding);
        bindings.add(headerBinding);

        var commandBinding = new Binding();
        commandBinding.setLocation("/command");
        var commandActionBinding = new Binding();
        commandActionBinding.setIcon("http://localhost:8080/static/icon.png");
        commandActionBinding.setLabel("helloworld");
        commandActionBinding.setDescription("Hello world app");
        commandActionBinding.setHint("[send]");
        var commandSendBinding = new Binding();
        commandSendBinding.setLocation("send");
        commandSendBinding.setLabel("send");
        var commandSendCall = new Call();
        commandSendCall.setPath("/send");
        commandSendBinding.setCall(commandSendCall);
        commandActionBinding.getBindings().add(commandSendBinding);
        commandBinding.getBindings().add(commandActionBinding);
        bindings.add(commandBinding);

        return CallResponse.ok(bindings);
    }
}
