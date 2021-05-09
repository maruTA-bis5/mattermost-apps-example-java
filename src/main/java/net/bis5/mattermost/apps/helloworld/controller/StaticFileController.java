package net.bis5.mattermost.apps.helloworld.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/static")
@Singleton
public class StaticFileController {

    @GET
    @Path("/icon.png")
    @Produces("image/png")
    public Response getIcon() throws IOException {
        java.nio.file.Path imageFile = Files.createTempFile("icon", ".png");
        Files.copy(getClass().getResourceAsStream("/icon.png"), imageFile, StandardCopyOption.REPLACE_EXISTING);
        var response = Response.ok(Files.newInputStream(imageFile, StandardOpenOption.DELETE_ON_CLOSE));
        response.header("Content-Disposition", "attachment; filename=icon.png");
        return response.build();
    }
}
