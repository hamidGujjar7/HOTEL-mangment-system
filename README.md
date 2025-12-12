# Hotel Management System

An Android application for managing hotel operations including reservations, rooms, dishes, tables, and payments.

## Features

- **User Management**: Login and user authentication
- **Dashboard**: Overview of hotel operations
- **Room Management**: Track and manage hotel rooms
- **Reservations**: Book and manage room reservations
- **Table Management**: Manage dining tables
- **Dish Management**: Maintain menu items
- **Orders**: Track customer orders
- **Payments**: Process and record payments

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/hotel_mangement_system/
│   │   │   ├── Activities (DashboardActivity, LoginActivity, MainActivity)
│   │   │   ├── dao/ (Data Access Objects)
│   │   │   ├── db/ (Database entities)
│   │   │   ├── repository/ (Repository pattern)
│   │   │   └── viewmodel/ (ViewModels)
│   │   └── res/ (Resources - layouts, drawables, etc.)
│   ├── test/ (Unit tests)
│   └── androidTest/ (Instrumented tests)
```

## Architecture

This project uses the following architectural patterns:
- **MVVM** (Model-View-ViewModel)
- **Repository Pattern** for data management
- **Room Database** for local persistence
- **Data Access Objects (DAO)** for database operations

## Database Entities

- `User` - Application users
- `Hotel` - Hotel information
- `Room` - Hotel rooms
- `Reservation` - Room reservations
- `Table` - Dining tables
- `Dish` - Menu items
- `Order` - Customer orders
- `Payment` - Payment records

## Building and Running

1. Clone the repository
2. Open the project in Android Studio
3. Build the project: `./gradlew build`
4. Run the application on an emulator or device

## Technologies Used

- **Kotlin/Java** - Programming language
- **Android Room** - Local database
- **ViewModel** - Architecture component
- **Gradle** - Build system

## Testing

- Unit tests: `app/src/test/`
- Instrumented tests: `app/src/androidTest/`

## Development Notes

- The application uses local Room database for data persistence
- User authentication is handled through LoginActivity
- Dashboard provides an overview of hotel operations

## License

This project is part of an Android development exercise.
