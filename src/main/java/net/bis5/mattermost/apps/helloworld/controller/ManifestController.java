package net.bis5.mattermost.apps.helloworld.controller;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.bis5.mattermost.apps.helloworld.model.Manifest;

@Path("/manifest.json")
@Singleton
public class ManifestController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Manifest getManifest() {
        var manifest = new Manifest();
        manifest.setAppId("hello-world");
        manifest.setAppType("http");
        manifest.setDisplayName("Hello, world!");
        manifest.setRootUrl("http://localhost:8080");
        manifest.setRequestedPermissions("act_as_bot");
        manifest.setRequestedLocations("/channel_header", "/command");
        return manifest;
    }
}
