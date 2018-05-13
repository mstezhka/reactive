package com.reactive.customers.controller;

import com.reactive.customers.model.Customer;
import com.reactive.customers.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.*;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

//    @RequestMapping(value = "/orderByDueTime", method = RequestMethod.POST) // replaced with @PostMapping
    @PostMapping("/orderByDueTime")
    public Flux<List<Customer>> orderByDueTime(@RequestBody List<Customer> customers){

        return customerService.orderByDueTime(customers, HttpStatus.OK);
    }
}
