package com.reactive.customers.service;

import com.reactive.customers.model.Customer;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Flux;

import java.util.List;

public interface CustomerService {

    Flux<List<Customer>> orderByDueTime(List<Customer> customers, HttpStatus ok);
}
