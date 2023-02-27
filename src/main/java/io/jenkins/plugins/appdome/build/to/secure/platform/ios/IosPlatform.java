package io.jenkins.plugins.appdome.build.to.secure.platform.ios;

import hudson.Extension;
import io.jenkins.plugins.appdome.build.to.secure.platform.Platform;
import io.jenkins.plugins.appdome.build.to.secure.platform.PlatformDescriptor;
import io.jenkins.plugins.appdome.build.to.secure.platform.ios.certificate.method.CertificateMethod;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

public class IosPlatform extends Platform {

    private String appPath;
    private final String fusionSetId;
    private final CertificateMethod certificateMethod;

    @DataBoundConstructor
    public IosPlatform(String fusionSetId, CertificateMethod certificateMethod) {
        super();
        this.fusionSetId = fusionSetId;
        this.certificateMethod = certificateMethod;
    }

    @DataBoundSetter
    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    public String getAppPath() {
        return appPath;
    }

    public String getFusionSetId() {
        return fusionSetId;
    }

    public CertificateMethod getCertificateMethod() {
        return certificateMethod;
    }

    @Extension
    public static final class DescriptorImpl extends PlatformDescriptor {
        @Override
        public String getDisplayName() {
            return "iOS";
        }

    }
}
