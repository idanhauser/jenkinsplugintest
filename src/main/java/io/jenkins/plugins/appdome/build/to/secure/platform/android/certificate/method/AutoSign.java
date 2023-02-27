package io.jenkins.plugins.appdome.build.to.secure.platform.android.certificate.method;

import hudson.Extension;
import io.jenkins.plugins.appdome.build.to.secure.platform.android.certificate.method.CertificateMethodDescriptor;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

public class AutoSign extends CertificateMethod {

    private final String keystorePath;
    private final String keystorePassword;
    private final String keyAlias;
    private final String keyPass;
    private String fingerprint;

    @DataBoundConstructor
    public AutoSign(String keystorePath, String keystorePassword, String keyAlias, String keyPass) {
        this.keystorePath = keystorePath;
        this.keystorePassword = keystorePassword;
        this.keyAlias = keyAlias;
        this.keyPass = keyPass;
    }

    public String getKeystorePath() {
        return keystorePath;
    }

    public String getKeystorePassword() {
        return keystorePassword;
    }

    public String getKeyAlias() {
        return keyAlias;
    }

    public String getKeyPass() {
        return keyPass;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    @DataBoundSetter
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Extension
    public static final class DescriptorImpl extends CertificateMethodDescriptor {
        @Override
        public String getDisplayName() {
            return "Auto Signing";
        }
    }
}
