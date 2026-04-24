package com.danih24.lease_management.service

import com.danih24.lease_management.model.Bicycle
import com.danih24.lease_management.repository.BicycleRepository
import org.springframework.stereotype.Service

@Service
class BicycleService(
    private val bicycleRepository: BicycleRepository
) {
    fun findAll(): List<Bicycle> =
        bicycleRepository.findAll()
}