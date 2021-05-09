package net.bis5.mattermost.apps.helloworld.controller;

import javax.inject.Singleton;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import net.bis5.mattermost.apps.helloworld.model.Call;
import net.bis5.mattermost.apps.helloworld.model.CallResponse;
import net.bis5.mattermost.apps.helloworld.model.Field;
import net.bis5.mattermost.apps.helloworld.model.Form;
import net.bis5.mattermost.apps.helloworld.model.Field.FieldType;

@Path("/send")
@Singleton
public class SendFormController {

    @POST
    @Path("/modal/submit")
    public CallResponse<Void> getForm() {
        return CallResponse.form(createForm());
    }

    private Form createForm() {
        var form = new Form();
        form.setTitle("Hello, world!");
        form.setIcon("http://localhost:8080/static/icon.png");
        var submitCall = new Call();
        submitCall.setPath("/message");
        form.setCall(submitCall);
        var field = new Field();
        field.setType(FieldType.TEXT);
        field.setName("message");
        field.setLabel("message");
        form.getFields().add(field);

        return form;
    }

    @POST
    @Path("/form")
    public CallResponse<Void> getCommandForm() {
        return CallResponse.form(createForm());
    }
}
