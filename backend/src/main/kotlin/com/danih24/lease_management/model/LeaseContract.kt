package com.danih24.lease_management.model

import java.util.Date
import java.util.UUID

data class LeaseContract(
    val leaseContratNumber: UUID,
    val start: Date,
    val end: Date,
    val monthlyRate: Float,
    val status: LeaseContractStatus,
    val customer: Customer,
    val bicycle: Bicycle

)

enum class LeaseContractStatus {
    ACTIVE, TERMINATED, COMPLETED
}