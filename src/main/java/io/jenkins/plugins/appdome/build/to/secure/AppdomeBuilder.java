package io.jenkins.plugins.appdome.build.to.secure;

import hudson.*;
import hudson.model.AbstractProject;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import hudson.util.Secret;
import io.jenkins.plugins.appdome.build.to.secure.platform.Platform;
import jenkins.tasks.SimpleBuildStep;
import org.kohsuke.stapler.DataBoundConstructor;

public class AppdomeBuilder extends Builder implements SimpleBuildStep {

    private final Secret token;
    private final String teamId;
    private final Platform platform;

    @DataBoundConstructor
    public AppdomeBuilder(Secret token, String teamId, Platform platform) {
        this.teamId = teamId;
        this.token = token;
        this.platform = platform;

    }


    public void perform(Run<?, ?> run, FilePath workspace, EnvVars env, Launcher launcher, TaskListener listener) {

    }

    public Platform getPlatform() {
        return platform;
    }


    @Extension
    public static final class DescriptorImpl extends BuildStepDescriptor<Builder> {


        @Override
        public boolean isApplicable(Class<? extends AbstractProject> aClass) {
            return true;
        }

        @Override
        public String getDisplayName() {
            return "Appdome Build-2secure";
        }

    }

}
