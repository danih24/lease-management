import './App.css'
import {useEffect, useState} from "react";
import type {Customer} from "./Customer.ts";
import {getData} from "./API.ts";

function App() {
  const [customers, setCustomers] = useState<Customer[] | null>(null);
  const [selectedCustomerId, setSelectedCustomerId] = useState<number | undefined>(undefined);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);


  useEffect(() => {
    async function loadCustomers() {
      try {
        const data = await getData<Customer[]>("http://localhost:8080/api/customer")
        setCustomers(data);
      } catch (err) {
        setError(err instanceof Error ? err.message : "Unknown error");
      } finally {
        setLoading(false);
      }
    }

    loadCustomers();

  }, [])

  const loadingIndicator = <div>Loading data...</div>
  const errorMessage = <div>{error}</div>

  const customerSelection = (
      <select
          value={selectedCustomerId}
          onChange={(e) => setSelectedCustomerId(Number.parseInt(e.target.value))}
      >
        <option value="">Select a customer</option>
        {customers?.map((customer: Customer) => (
            <option key={customer.id} value={customer.id}>
              {customer.name}
              /
              {customer.email}
            </option>
        ))}
      </select>
  )

  return (
      <>
        <h1>Lease Management</h1>
        {loading && loadingIndicator}
        {customers && customerSelection}


        {error && errorMessage}
      </>
  )
}

export default App
