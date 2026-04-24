package com.danih24.lease_management.model

data class Bicycle(
    val id: Int,
    val frameNumber: String,
    val brand: String,
    val model: String,
    val category: BikeCategory,
    val condition: BikeCondition,
)

enum class BikeCategory {
    MTB, EBIKE, GRAVEL, CITY, CARGO, FOLDING, ROAD
}

enum class BikeCondition {
    NEW, USED
}
