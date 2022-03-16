package br.com.conversor;

import org.junit.ClassRule;
import org.junit.rules.TestWatcher;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testes {
    @ClassRule
    public static TestRule classWatchman = new TestWatcher() {
        @Override
        protected void starting(Description desc) {
            System.out.println(desc.testCount());
        }

        @Override
        protected void succeeded(Description desc) {
            System.out.println("teste: " + desc.testCount());
        }

        @Override
        protected void finished(Description desc) {
            System.out.println("Suite completed!");
        }
    };

    @Test
    public void fails() {
        assertEquals(1 + 1, 2);
    }

    @Test
    public void succeeds() {
        assertEquals(0, 0);
    }
}