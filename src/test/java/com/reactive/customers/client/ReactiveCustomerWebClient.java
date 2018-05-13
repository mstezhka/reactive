package com.reactive.customers.client;

import com.reactive.customers.model.Customer;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

public class ReactiveCustomerWebClient {

    private static WebClient webClient = WebClient.create("http://127.0.0.1:8080/customers");

    public static void main(String[] args ) throws InterruptedException {
        webClient.post()
                .uri("/orderByDueTime", 1000)
//                .body(Customer.class)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(Customer.class)
                .subscribe();
    }
}
