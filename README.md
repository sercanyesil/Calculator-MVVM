# Basic Calculator App (MVVM Architecture)

This Android application is a basic calculator that allows users to perform four fundamental mathematical operations: addition, subtraction, multiplication, and division. It follows the MVVM (Model-View-ViewModel) architecture pattern for better separation of concerns and maintainability.

## Features

- Perform addition, subtraction, multiplication, and division.
- Utilizes coroutines for asynchronous operations.
- Implements data binding for efficient UI updates.
- Uses ViewModel to manage UI-related data in a lifecycle-conscious way.
- Separation of concerns between UI logic, business logic, and data sources.

## Components

### MainActivity

The main entry point of the application. It contains the UI elements and interacts with the ViewModel to handle user input and display results.

### MainActivityViewModel

The ViewModel responsible for managing the UI-related data and handling user interactions. It communicates with the MathRepository to perform mathematical operations.

### MathDataSource

A data source interface defining the contract for mathematical operations. Implementations of this interface provide the actual logic for performing calculations.

### MathRepository

Acts as a mediator between the ViewModel and the MathDataSource. It abstracts the data layer from the ViewModel and provides a clean API for performing mathematical operations.

<img src="https://i.imgur.com/BaWAS0B.png" alt="Home Screen Screenshot" width="300"/>

## Dependencies

- `androidx.activity:activity-ktx`: Kotlin extensions for working with activities.
- `androidx.lifecycle:lifecycle-viewmodel-ktx`: Kotlin extensions for working with ViewModels.

## Getting Started

To run the application, follow these steps:

1. Clone this repository.
2. Open the project in Android Studio.
3. Build and run the application on an emulator or a physical device.




