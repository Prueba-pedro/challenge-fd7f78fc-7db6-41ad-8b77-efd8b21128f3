package com.company.serviceA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ServiceA {

    @Autowired
    private ServiceBClient serviceBClient;

    public Mono<String> getServiceAResponse() {
        return Mono.just("Response from Service A");
    }

    public Mono<String> getCombinedResponse() {
        return serviceBClient.getServiceBResponse()
               .map(response -> "Combined response: " + response);
    }
}