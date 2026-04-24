package com.danih24.lease_management.repository

import com.danih24.lease_management.model.Bicycle
import com.danih24.lease_management.model.BikeCategory
import com.danih24.lease_management.model.BikeCondition
import org.springframework.stereotype.Repository

@Repository
class BicycleRepository {
    private val bicycles = mutableListOf<Bicycle>(

        Bicycle(
            id = 1,
            brand = "Canyon",
            model = "Grizl CF SL",
            category = BikeCategory.GRAVEL,
            condition = BikeCondition.NEW,
            frameNumber = "CAN-991"
        ),
        Bicycle(
            id = 2,
            brand = "Specialized",
            model = "Turbo Vado 4.0",
            category = BikeCategory.EBIKE,
            condition = BikeCondition.USED,
            frameNumber = "SPEC-102"
        ),
        Bicycle(
            id = 3,
            brand = "Riese & Müller",
            model = "Load 75",
            category = BikeCategory.CARGO,
            condition = BikeCondition.NEW,
            frameNumber = "RM-007"
        ),
        Bicycle(
            id = 4,
            brand = "Cube",
            model = "Kathmandu Hybrid",
            category = BikeCategory.EBIKE,
            condition = BikeCondition.USED,
            frameNumber = "CUB-445"
        ),
        Bicycle(
            id = 5,
            brand = "Brompton",
            model = "C Line",
            category = BikeCategory.FOLDING,
            condition = BikeCondition.NEW,
            frameNumber = "BRO-221"
        ),
        Bicycle(
            id = 6,
            brand = "Trek",
            model = "Domane AL 2",
            category = BikeCategory.ROAD,
            condition = BikeCondition.USED,
            frameNumber = "TRE-883"
        ),
        Bicycle(
            id = 7,
            brand = "Rad Power",
            model = "RadRunner 3",
            category = BikeCategory.CARGO,
            condition = BikeCondition.NEW,
            frameNumber = "RAD-661"
        ),
        Bicycle(
            id = 8,
            brand = "Santa Cruz",
            model = "Heckler",
            category = BikeCategory.MTB,
            condition = BikeCondition.USED,
            frameNumber = "SC-112"
        ),
        Bicycle(
            id = 9,
            brand = "Orbea",
            model = "Gain M30",
            category = BikeCategory.EBIKE,
            condition = BikeCondition.USED,
            frameNumber = "ORB-554"
        ),
        Bicycle(
            id = 10,
            brand = "Gazelle",
            model = "Ultimate C380",
            category = BikeCategory.CITY,
            condition = BikeCondition.NEW,
            frameNumber = "GAZ-900"
        )
    )

    fun findAll(): List<Bicycle> =
        bicycles

}