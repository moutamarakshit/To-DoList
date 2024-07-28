# To-Do List Application

## Overview

This is a simple To-Do List application that allows users to add tasks, mark them as completed, and view their task list. The project is built using Java with Spring Boot for the backend and Thymeleaf for the frontend. The application demonstrates the use of basic CRUD operations, object-oriented design principles, and a simple web interface.

## Features

- **Add Tasks**: Users can add new tasks to their to-do list.
- **Mark Tasks as Completed**: Users can mark tasks as completed.
- **View Tasks**: Users can view all their tasks, with completed tasks visually differentiated.

## Technologies Used

- **Java**: Used for backend logic and implementation of object-oriented design principles.
- **Spring Boot**: Framework used to build the backend services.
- **Thymeleaf**: Template engine for rendering dynamic web pages on the frontend.
- **CSS**: Used for styling the web pages.

## Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/todo-list.git
    cd todo-list
    ```

2. **Build the project:**
    ```bash
    ./mvnw clean package
    ```

3. **Run the application:**
    ```bash
    java -jar target/todolist-0.0.1-SNAPSHOT.jar
    ```

4. **Access the application:**
    Open your web browser and navigate to `http://localhost:8081`

## Usage

1. **Adding a Task:**
    - Enter a task description in the input field.
    - Click the "Add Task" button to add the task to your list.

2. **Marking a Task as Completed:**
    - Click the "Complete" button next to the task you want to mark as completed.
    - The task will be updated to indicate it has been completed.

## Code Structure

- **Task.java**: Entity representing a task with a description and completion status.
- **ToDoListController.java**: Controller to handle web requests for adding and completing tasks.
- **ToDoListService.java**: Service to manage the list of tasks.
- **index.html**: Thymeleaf template for the frontend.

## Screenshots


## Contributing

Feel free to fork the repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License.
