# Lease Management System

Draft fullstack application for managing bicycle lease contracts.

## Technologies

### Backend
- Kotlin
- Spring Boot (Web MVC)
- Maven

### Frontend
- React
- TypeScript
- Vite

## Prerequisites

- Java 21
- Node.js (current LTS recommended) and npm

## Start the Backend

From the `backend` directory:

```powershell
cd backend
.\mvnw.cmd spring-boot:run
```

Backend runs on `http://localhost:8080` by default.

## Start the Frontend

From the `frontend` directory:

```powershell
cd frontend
npm install
npm run dev
```

Frontend runs on `http://localhost:5173` by default.

## How the apps connect

The frontend currently calls the backend API directly at:
- `http://localhost:8080/api/customer`
- `http://localhost:8080/api/bicycle`


## TODOs
- [ ] Implement backend API endpoints for creating lease contracts.
- [ ] Implement frontend UI for creating lease contracts.
- [ ] Add database integration to persist data.

## Technical Notes
- The backend is structured with a typical Spring Boot architecture, including controllers, services, and repositories.
- The frontend is set up with React and TypeScript, using Vite for development and building. It includes basic components and API calls to interact with the backend.
- Kotlin was chosen due to the target tech stack and interest in using a modern JVM language. Spring Boot provides a robust framework for building RESTful APIs. On top the framework was known already.
- React and TypeScript offer a powerful combination for building interactive UIs with type safety and it was known already.