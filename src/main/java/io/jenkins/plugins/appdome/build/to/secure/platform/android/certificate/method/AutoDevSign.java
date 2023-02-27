package io.jenkins.plugins.appdome.build.to.secure.platform.android.certificate.method;

import hudson.Extension;
import io.jenkins.plugins.appdome.build.to.secure.platform.android.certificate.method.CertificateMethodDescriptor;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

public class AutoDevSign extends CertificateMethod {

    private final String fingerprint;
    private Boolean googleSigning;

    @DataBoundConstructor
    public AutoDevSign(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public Boolean getGoogleSigning() {
        return googleSigning;
    }

    @DataBoundSetter
    public void setGoogleSigning(Boolean googleSigning) {
        this.googleSigning = googleSigning;
    }

    @Extension
    public static final class DescriptorImpl extends CertificateMethodDescriptor {
        @Override
        public String getDisplayName() {
            return "Auto-Dev Signing";
        }
    }
}
