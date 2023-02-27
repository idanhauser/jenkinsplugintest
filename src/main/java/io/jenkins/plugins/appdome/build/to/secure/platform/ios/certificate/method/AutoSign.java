package io.jenkins.plugins.appdome.build.to.secure.platform.ios.certificate.method;

import hudson.Extension;
import hudson.util.Secret;
import io.jenkins.plugins.appdome.build.to.secure.StringWarp;
import org.kohsuke.stapler.DataBoundConstructor;

import java.util.List;

public class AutoSign extends CertificateMethod {

    private final String keystorePath;
    private final Secret keystorePassword;
    private final List<StringWarp> provisioningProfiles;
    private final List<StringWarp> entitlements;

    @DataBoundConstructor
    public AutoSign(String keystorePath, Secret keystorePassword, List<StringWarp> provisioningProfiles, List<StringWarp> entitlements) {
        super();
        this.keystorePath = keystorePath;
        this.keystorePassword = keystorePassword;
        this.provisioningProfiles = provisioningProfiles;
        this.entitlements = entitlements;
    }

    public String getKeystorePath() {
        return keystorePath;
    }

    public Secret getKeystorePassword() {
        return keystorePassword;
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
            return "Auto Signing";
        }

    }
}
