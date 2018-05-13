package com.reactive.customers.service.impl;

import com.reactive.customers.model.Customer;
import com.reactive.customers.service.CustomerService;
import org.joda.time.DateTimeComparator;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    public Flux<List<Customer>> orderByDueTime(List<Customer> customers, HttpStatus ok) {

        return Flux.fromIterable(customers)
                .parallel()
                .sorted((o1, o2) -> DateTimeComparator.getInstance().compare(o1.getDuetime(),o2.getDuetime()))
                .buffer();
    }
}
