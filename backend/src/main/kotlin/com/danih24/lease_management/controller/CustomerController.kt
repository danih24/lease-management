package com.danih24.lease_management.controller

import com.danih24.lease_management.model.Customer
import com.danih24.lease_management.service.CustomerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/customer")
class CustomerController(
    private val customerService: CustomerService
) {
    @GetMapping
    fun listAll(): List<Customer> =
        customerService.findAll()
}