package br.com.conversor;

import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testes {
    private String watchedLog;
    private int count = 0;

    @Rule(order = Integer.MIN_VALUE)
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            watchedLog += description + "\n" + "count: " + count;
        }

        @Override
        protected void succeeded(Description description) {
            watchedLog += description + " " + "success!\n" + "count: " + count;
        }
    };

    @Test
    public void fails() {
        assertEquals(1+1, 2);
    }

    @Test
    public void succeeds() {
        assertEquals(0, 0);
    }
}