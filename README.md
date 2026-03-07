# Scientific Calculator with DevOps Pipeline

This project demonstrates the implementation of a **Scientific Calculator application integrated with a DevOps CI/CD pipeline**. The application performs scientific calculations and automates the build, testing, containerization, and deployment process using modern DevOps tools.

---

## Project Overview

The Scientific Calculator is a **Java-based command-line application** that performs mathematical operations such as:

- Square Root
- Factorial
- Natural Logarithm
- Power Calculation

The project integrates **DevOps practices** to automate the software development lifecycle including building, testing, containerization, and deployment.

---

## DevOps Pipeline Workflow

The CI/CD pipeline automates the following steps:

1. Developer pushes code to **GitHub repository**
2. **Jenkins pipeline** is triggered via webhook
3. Project is built using **Maven**
4. **JUnit test cases** are executed
5. A **Docker image** is built
6. Docker image is pushed to **DockerHub**
7. **Ansible playbook** deploys the container

Pipeline Flow:

GitHub → Jenkins → Maven Build → JUnit Test → Docker Build → DockerHub → Ansible Deployment

---

## Tools and Technologies Used

| Category | Tool |
|--------|------|
| Programming Language | Java |
| Version Control | Git, GitHub |
| Build Tool | Maven |
| Testing Framework | JUnit |
| CI/CD | Jenkins |
| Containerization | Docker |
| Container Registry | DockerHub |
| Deployment | Ansible |
| Webhook Tunneling | ngrok |

---

## Project Structure

```
calculator-devops-project
│
├── src/
│   └── main/java/Calculator.java
│
├── test/
│   └── CalculatorTest.java
│
├── Dockerfile
├── Jenkinsfile
├── deploy.yml
├── inventory
├── pom.xml
└── README.md
```

---

## Running the Project

### Clone the Repository

```
git clone https://github.com/mohitkumar-dev95/calculator-devops-project.git
```

### Build the Project

```
mvn clean install
```

### Run the Application

```
java -jar target/calculator.jar
```

---

## Docker Commands

Build Docker Image

```
docker build -t mohitkumar95/calculator:latest .
```

Push Image to DockerHub

```
docker push mohitkumar95/calculator:latest
```

Run Container

```
docker run -it mohitkumar95/calculator:latest
```

---

## Ansible Deployment

Run the Ansible playbook to deploy the container:

```
ansible-playbook deploy.yml -i inventory
```

---

## Repository Links

GitHub Repository  
https://github.com/mohitkumar-dev95/calculator-devops-project

DockerHub Repository  
https://hub.docker.com/r/mohitkumar95/calculator

---

## Author

Mohit Kumar  
IIIT Bangalore  
Roll Number: MT2025075

---

## Conclusion

This project demonstrates how DevOps practices can automate the entire software development lifecycle. By integrating GitHub, Jenkins, Maven, Docker, and Ansible, the application can be built, tested, containerized, and deployed automatically through a CI/CD pipeline.
