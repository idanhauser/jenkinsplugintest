package io.jenkins.plugins.appdome.build.to.secure.platform.ios.certificate.method;

import hudson.Extension;
import io.jenkins.plugins.appdome.build.to.secure.StringWarp;
import org.kohsuke.stapler.DataBoundConstructor;

import java.util.List;

public class AutoDevSign extends CertificateMethod {
    private final List<StringWarp> provisioningProfiles;
    private final List<StringWarp> entitlements;

    @DataBoundConstructor
    public AutoDevSign(List<StringWarp> provisioningProfiles, List<StringWarp> entitlements) {
        this.provisioningProfiles = provisioningProfiles;
        this.entitlements = entitlements;
    }

    public List<StringWarp> getProvisioningProfiles() {
        return provisioningProfiles;
    }

    public List<StringWarp> getEntitlements() {
        return entitlements;
    }

    @Extension
    public static final class DescriptorImpl extends CertificateMethodDescriptor {
        @Override
        public String getDisplayName() {
            return "Auto-Dev Signing";
        }


    }
}
