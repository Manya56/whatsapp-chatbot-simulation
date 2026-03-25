# WhatsApp Chatbot Backend Simulation
A Spring Boot REST API that simulates a WhatsApp chatbot webhook.

## Features
- **Endpoint:** `POST /webhook`
- **Logging:** All incoming messages are logged to the server console.
- **Automated Replies:** - "hi" -> "Hello! How can I help you today?"
  - "bye" -> "Goodbye! Have a great day."
  - Other -> Default bot response.

## How to Run
1. Clone the repository.
2. Ensure you have Java 17+ and Maven installed.
3. Run `mvn spring-boot:run` or run `DemoApplication.java` from your IDE.
4. Test using Postman at `http://localhost:8080/webhook`.
