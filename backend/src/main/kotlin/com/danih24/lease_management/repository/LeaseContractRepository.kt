package com.danih24.lease_management.repository

import com.danih24.lease_management.model.Customer
import com.danih24.lease_management.model.LeaseContract
import org.springframework.stereotype.Repository

@Repository
class LeaseContractRepository {
    private val contracts = mutableListOf<LeaseContract>()

    fun save(contract: LeaseContract): Boolean =
        contracts.add(contract)

    fun findAll(): List<LeaseContract> =
        contracts
}