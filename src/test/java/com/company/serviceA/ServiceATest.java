package com.company.serviceA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

@SpringBootTest
public class ServiceATest {

    @Autowired
    private ServiceA serviceA;

    @Test
    public void testGetServiceAResponse() {
        StepVerifier.create(serviceA.getServiceAResponse())
               .expectNext("Response from Service A")
               .verifyComplete();
    }

    @Test
    public void testGetCombinedResponse() {
        StepVerifier.create(serviceA.getCombinedResponse())
               .expectNext("Combined response: Response from Service B")
               .verifyComplete();
    }
}