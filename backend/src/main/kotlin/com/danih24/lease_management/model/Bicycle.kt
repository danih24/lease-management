package com.danih24.lease_management.model

import java.util.UUID

data class Bicycle(
    val frameNumber: UUID,
    val brand: String,
    val model: String,
    val category: BikeCategory
)

enum class BikeCategory {
    MTB, EBIKE, Gravel, CITY, CARGO, FOLDING
}
