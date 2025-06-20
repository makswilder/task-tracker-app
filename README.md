# Task Tracker App

A RESTful backend service for managing tasks and task lists, built with **Spring Boot**, **Java 21**, and **PostgreSQL**.  
It follows clean architecture principles and is designed to be easily connected to a frontend.

---

## Overview

This app supports:

- Creating, updating, and deleting **Task Lists**
- Adding tasks to lists, setting **status** and **priority**
- Viewing and managing all tasks under a list
- Clean separation of layers (controller → service → persistence)
- UUIDs used for all IDs
- Lightweight DTO mapping

---

## Architecture
- Spring Boot handles the domain logic, persistence, and validation.
- PostgreSQL stores task lists and tasks.

## Domain Model

![Domain Mode](https://github.com/user-attachments/assets/4fa17810-ecb0-428f-a06d-b30fcf544509)

- `TaskList` contains multiple `Task` objects.
- Each `Task` has:
  - A `title`, `description`, and `dueDate`
  - A `TaskStatus` (OPEN, CLOSED)
  - A `TaskPriority` (HIGH, MEDIUM, LOW)
 
## Entity Relationship Diagram (ERD)

![ERD](https://github.com/user-attachments/assets/f7c28bfc-d7c1-4f53-bd5e-697eff703ee4)

- **TASK_LISTS**: stores task list metadata with `UUID id`, `title`, `description`, timestamps.
- **TASKS**: stores tasks, each linked to a task list via `task_list_id`, with its own `status`, `priority`, and timestamps.

---

## Class Diagram

![Class Diagram](https://github.com/user-attachments/assets/719bab20-ee6d-40d0-8711-37db15ac8f2c)

- All fields reflect clean separation between domain and persistence layers.
- `TaskList` ↔ `Task` is a one-to-many bidirectional relationship.
- Timestamps (`created`, `updated`) are auto-managed.
- Enums are embedded and mapped to readable strings in DB.

## Tech Stack

| Layer         | Technology              |
|---------------|--------------------------|
| Language      | Java 21                  |
| Framework     | Spring Boot 3            |
| Persistence   | Spring Data JPA (Hibernate) |
| Database      | PostgreSQL               |
| Build Tool    | Maven                    |
| ID Strategy   | UUID                     |
| API Type      | RESTful (JSON)           |

---

## Sample Endpoints

| Method | Endpoint                           | Description                  |
|--------|------------------------------------|------------------------------|
| GET    | `/api/task-lists`                  | List all task lists          |
| POST   | `/api/task-lists`                  | Create new task list         |
| PUT    | `/api/task-lists/{id}`             | Update task list             |
| DELETE | `/api/task-lists/{id}`             | Delete task list             |
| GET    | `/api/task-lists/{id}/tasks`       | Get tasks for list           |
| POST   | `/api/task-lists/{id}/tasks`       | Add task to list             |
| PUT    | `/api/task-lists/{id}/tasks/{id}`  | Update specific task         |
