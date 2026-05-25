package com.company.serviceA.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class ServiceBClient {

    private final WebClient webClient;

    public ServiceBClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8081").build();
    }

    public Mono<String> getServiceBResponse() {
        return webClient.get()
               .uri("/serviceB")
               .retrieve()
               .bodyToMono(String.class);
    }
}