package com.danih24.lease_management.service

import com.danih24.lease_management.model.LeaseContract
import com.danih24.lease_management.repository.LeaseContractRepository
import org.springframework.stereotype.Service

@Service
class LeaseContractService(
    private val leaseContractRepository: LeaseContractRepository
) {
    fun findAll(): List<LeaseContract> =
        leaseContractRepository.findAll()

    fun createLeaseContract(leaseContract: LeaseContract) =
        leaseContractRepository.save(leaseContract)
}