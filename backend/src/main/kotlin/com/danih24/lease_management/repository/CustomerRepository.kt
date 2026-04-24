package com.danih24.lease_management.repository

import com.danih24.lease_management.model.Customer
import org.springframework.stereotype.Repository

@Repository
class CustomerRepository {
    private val customers = mutableListOf<Customer>(
        Customer(
            id = 101,
            email = "max@example.com",
            name = "Max Mustermann",
            address = "Hauptstr. 1, Freiburg",
            phone = "+49 151 111",
        ),
        Customer(
            id = 102,
            name = "Sarah Schmidt",
            email = "sarah@example.com",
            phone = "+49 151 222",
            address = "Berliner Allee 5, Staufen",
        ),
        Customer(
            id = 103,
            email = "fleet@ecodrive.de",
            name = "EcoDrive Solutions",
            address = "Industriestr. 10, Freiburg",
            phone = "+49 761 333",
        ),
        Customer(
            id = 104,
            email = "elena@example.com",
            name = "Elena Rossi",
            address = "Kaiser-Joseph-Str. 12, Freiburg",
            phone = "+49 151 444",
        ),
        Customer(
            id = 105,
            email = "j.weber@web.de",
            name = "Julian Weber",
            address = "Schwarzwaldstr. 88, Kirchzarten",
            phone = "+49 151 555",
        )
    )

    fun findAll(): List<Customer> =
        customers
}