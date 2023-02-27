package io.jenkins.plugins.appdome.build.to.secure.platform;

import hudson.ExtensionPoint;
import hudson.model.Describable;
import hudson.model.Descriptor;
import jenkins.model.Jenkins;

public abstract class Platform implements Describable<Platform>, ExtensionPoint {


    public Platform() {

    }

    @Override
    public Descriptor<Platform> getDescriptor() {
        return Jenkins.get().getDescriptorOrDie(getClass());
    }

}
