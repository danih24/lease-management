
export async function getData<T>(url: string): Promise<T> {
  const response = await fetch(url);

  if (!response.ok) {
    throw new Error(`Error fetching the data: ${response.status} ${response.statusText}`);
  }

  const data: T = await response.json();
  return data;
}