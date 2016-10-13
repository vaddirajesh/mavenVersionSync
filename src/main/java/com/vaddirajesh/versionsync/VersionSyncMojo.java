package com.vaddirajesh.versionsync;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

/**
 * Created by rajesh.vaddi on 10/13/16.
 */
@Mojo(name = "versionSync")
public class VersionSyncMojo extends AbstractMojo {

    @Parameter(property = "versionSync.projects")
    private List<String> projectList;

    @Parameter(property = "versionSync.scm")
    private String sourceControl;

    @Parameter(property = "versionSync.profileId")
    private String profileId;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("this is my first mojo");
        getLog().info("going to get information f");
    }
}
