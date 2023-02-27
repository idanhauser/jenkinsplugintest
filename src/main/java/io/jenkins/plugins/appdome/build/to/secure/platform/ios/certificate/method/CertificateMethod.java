package io.jenkins.plugins.appdome.build.to.secure.platform.ios.certificate.method;

import hudson.ExtensionPoint;
import hudson.model.Describable;
import hudson.model.Descriptor;
import jenkins.model.Jenkins;

public class CertificateMethod implements Describable<CertificateMethod>, ExtensionPoint {

    public CertificateMethod() {
    }

    @Override
    public Descriptor<CertificateMethod> getDescriptor() {
        return Jenkins.get().getDescriptorOrDie(getClass());

    }
}
