package com.company.serviceB;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

@SpringBootTest
public class ServiceBTest {

    @Autowired
    private ServiceB serviceB;

    @Test
    public void testGetServiceBResponse() {
        StepVerifier.create(serviceB.getServiceBResponse())
               .expectNext("Response from Service B")
               .verifyComplete();
    }
}