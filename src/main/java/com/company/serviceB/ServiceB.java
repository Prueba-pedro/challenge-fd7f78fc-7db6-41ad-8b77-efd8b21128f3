package com.company.serviceB;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ServiceB {

    public Mono<String> getServiceBResponse() {
        return Mono.just("Response from Service B");
    }
}