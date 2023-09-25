package io.cabradati.streamimi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestStreamimiApplication {

    public static void main(String[] args) {
        SpringApplication.from(StreamimiApplication::main).with(TestStreamimiApplication.class).run(args);
    }

}
