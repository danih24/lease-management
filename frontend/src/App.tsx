import './App.css'
import {useEffect, useState} from "react";
import type {Customer} from "./Customer.ts";
import {getData} from "./API.ts";
import type {Bicycle} from "./Bicycle.ts";

function App() {
  const [customers, setCustomers] = useState<Customer[] | null>(null);
  const [selectedCustomerId, setSelectedCustomerId] = useState<number | undefined>(undefined);

  const [bicycles, setBicycles] = useState<Bicycle[] | null>(null);
  const [selectedBicycleId, setSelectedBicyclerId] = useState<number | undefined>(undefined);


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

    async function loadBicycles() {
      try {
        const data = await getData<Bicycle[]>("http://localhost:8080/api/bicycle")
        setBicycles(data);
      } catch (err) {
        setError(err instanceof Error ? err.message : "Unknown error");
      } finally {
        setLoading(false);
      }
    }

    loadCustomers();
    loadBicycles();

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

  const bicycleSelection = (
      <select
          value={selectedCustomerId}
          onChange={(e) => setSelectedBicyclerId(Number.parseInt(e.target.value))}
      >
        <option value="">Select a bicycle</option>
        {bicycles?.map((bicycle: Bicycle) => (
            <option key={bicycle.id} value={bicycle.id}>
              {bicycle.brand} / {bicycle.model}
            </option>
        ))}
      </select>
  )

  return (
      <>
        <h1>Lease Management</h1>
        {loading && loadingIndicator}
        {customers && customerSelection}
        {bicycles && bicycleSelection}

        <div>
          <h3>Selected customer</h3>
          <div>
            {customers?.find(customer => customer.id === selectedCustomerId)?.name || "No customer selected"}
          </div>
          <h3>Selected bike</h3>
          <div>
            {bicycles?.find(bicycle => bicycle.id === selectedBicycleId)?.model || "No bike selected"}
          </div>
        </div>


        {error && errorMessage}
      </>
  )
}

export default App
