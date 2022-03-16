package br.com.conversor;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Testes implements TestWatcher, AfterAllCallback {

    private static final Logger LOG = LoggerFactory.getLogger(Testes.class);

    private int count = 0, countSucess = 0, countFail = 0;

    @Override
    public void testSuccessful(ExtensionContext context) {
        LOG.info("Test Successful for test {}: ", context.getDisplayName());
        count++;
        countSucess++;
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        LOG.info("Test Aborted for test {}: ", context.getDisplayName());
        count++;
        countFail++;
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        LOG.info("Test Failed for test {}: ", context.getDisplayName());
        count++;
        countFail++;
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        LOG.info("Test result summary for {} {}", context.getDisplayName(), countSucess);
    }

}