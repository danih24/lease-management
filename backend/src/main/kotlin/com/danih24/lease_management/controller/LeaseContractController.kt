package com.danih24.lease_management.controller

import com.danih24.lease_management.model.LeaseContract
import com.danih24.lease_management.service.LeaseContractService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/leaseContract")
class LeaseContractController(
    private val leaseContractService: LeaseContractService,
) {
    @GetMapping
    fun listAll(): List<LeaseContract> =
        leaseContractService.findAll()

}