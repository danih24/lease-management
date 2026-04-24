package com.danih24.lease_management.controller

import com.danih24.lease_management.model.Bicycle
import com.danih24.lease_management.service.BicycleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/bicycle")
class BicycleController(
    private val bicycleService: BicycleService
) {
    @GetMapping
    fun listAll(): List<Bicycle> =
        bicycleService.findAll()
}