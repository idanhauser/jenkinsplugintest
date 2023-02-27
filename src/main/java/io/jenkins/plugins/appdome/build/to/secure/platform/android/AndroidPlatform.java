package io.jenkins.plugins.appdome.build.to.secure.platform.android;

import hudson.Extension;
import io.jenkins.plugins.appdome.build.to.secure.StringWarp;
import io.jenkins.plugins.appdome.build.to.secure.platform.Platform;
import io.jenkins.plugins.appdome.build.to.secure.platform.PlatformDescriptor;
import io.jenkins.plugins.appdome.build.to.secure.platform.android.certificate.method.CertificateMethod;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

import java.util.List;

public class AndroidPlatform extends Platform {
    private String appPath;
    private final String fusionSetId;
    private final CertificateMethod certificateMethod;

    @DataBoundConstructor
    public AndroidPlatform(String fusionSetId, CertificateMethod certificateMethod) {
        this.fusionSetId = fusionSetId;
        this.certificateMethod = certificateMethod;
    }

    public String getAppPath() {
        return appPath;
    }

    @DataBoundSetter
    public void setAppPath(String appPath) {
        this.appPath = appPath;
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
            return "Android";
        }
    }
}
