package com.danih24.lease_management.service

import com.danih24.lease_management.model.Customer
import com.danih24.lease_management.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
) {

    fun findAll(): List<Customer> =
        customerRepository.findAll()


}