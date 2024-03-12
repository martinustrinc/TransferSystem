# Bank Transfer System

This is a simple bank transfer system implemented using Spring Boot.

## How to Run

To run the application, you can use Maven or run the generated JAR file.

### Using Maven

1. Open a terminal or command prompt in the root directory of the project.
2. Run the following Maven command:

[//]: # (mvn spring-boot:run)
### Using JAR File
1. Build the project using Maven:
2. Navigate to the `target` directory:
3. Run the generated JAR file:


Make sure to replace `bank-transfer-system.jar` with the actual name of your generated JAR file.

## How to Use

Once the application is running, you can access it using a web browser or tools like Postman. The application exposes RESTful APIs for performing fund transfers between accounts and managing user accounts.

You can access the Swagger UI documentation by navigating to [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) after starting the application.

## Dependencies

- Java 11
- Maven

## Configuration

- Database: Configure database connection details in `application.properties`.
- Logging: Configure logging settings in `log4j2.xml`.
- Swagger UI: No additional configuration required. Access Swagger UI at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) after starting the application.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them to your branch.
4. Push your changes to your fork.
5. Submit a pull request to the main repository.

## License