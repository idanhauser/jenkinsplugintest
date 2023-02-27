package io.jenkins.plugins.appdome.build.to.secure;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import org.kohsuke.stapler.DataBoundConstructor;

public class StringWarp extends AbstractDescribableImpl<StringWarp> {

    private final String item;

    @DataBoundConstructor
    public StringWarp(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    @Extension
    public static class DescriptorImpl extends Descriptor<StringWarp> {
        public String getDisplayName() {
            return "";
        }
    }
}
