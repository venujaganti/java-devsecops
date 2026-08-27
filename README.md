# ☕ Java DevSecOps Application

A Java **Spring Boot** application developed using **Java 17, Maven, and Spring Boot**. The application is containerized using **Docker**, deployed using **Kubernetes**, automated with **GitHub Actions CI/CD**, and secured using **Trivy vulnerability scanning**.

## 🚀 Project Overview

The Java DevSecOps application demonstrates a complete DevSecOps workflow from source code management and automated testing to Docker containerization, security scanning, and Kubernetes deployment.

The project focuses on integrating **development, security, and operations** into a single automated workflow.

## 🛠️ Technology Stack

| Category | Technologies |
| ---------------- | ------------------------------ |
| Programming | Java 17 |
| Framework | Spring Boot |
| Build Tool | Maven |
| Version Control | Git, GitHub |
| CI/CD | GitHub Actions |
| Containerization | Docker |
| Orchestration | Kubernetes, Minikube |
| Security | Trivy |
| Operating System | Ubuntu Linux |

## ✨ Key Features

* ☕ Java Spring Boot application
* 🧪 Automated Maven testing
* 📦 Maven application packaging
* 🐳 Docker containerization
* 🔐 Docker image vulnerability scanning with Trivy
* ☸️ Kubernetes deployment
* 🔄 GitHub Actions CI/CD
* 🐧 Linux-based deployment
* 📚 DevSecOps workflow implementation

## 🏗️ Architecture

```text
                    Developer
                        │
                        ▼
                     GitHub
                        │
                        ▼
                GitHub Actions
                        │
                ┌───────┴───────┐
                ▼               ▼
           Maven Build      Security Scan
                │              Trivy
                ▼               │
             Testing            │
                │               │
                └───────┬───────┘
                        ▼
                   Docker Image
                        │
                        ▼
                   Kubernetes
                        │
                        ▼
                Java Application
```

## 📁 Project Structure

```text
java-devsecops/

├── src/
│   ├── main/
│   └── test/
│
├── Kubernetes/
│   ├── namespace.yaml
│   ├── deployment.yaml
│   └── service.yaml
│
├── .github/
│   └── workflows/
│       └── ci.yml
│
├── Dockerfile
├── pom.xml
├── README.md
│
├── 01-application.png
├── 02-tests.png
├── 03-docker.png
├── 04-kubernetes.png
├── 05-github-actions.png
└── 06-security-scan.png
```

## ⚙️ Run Application

Clone the repository:

```bash
git clone https://github.com/venujaganti/java-devsecops.git
cd java-devsecops
```

Build the application:

```bash
mvn clean package
```

Run tests:

```bash
mvn clean test
```

Start the application:

```bash
mvn spring-boot:run
```

The application runs on:

```text
http://localhost:8080
```

## 🐳 Docker

Build the Docker image:

```bash
docker build -t devsecops-java-app:1.0 .
```

Check the image:

```bash
docker images
```

Run the container:

```bash
docker run -d \
  --name devsecops-java-app \
  -p 8080:8080 \
  devsecops-java-app:1.0
```

Check running containers:

```bash
docker ps
```

## ☸️ Kubernetes Deployment

Start Minikube:

```bash
minikube start --driver=docker
```

Deploy the application:

```bash
kubectl apply -f Kubernetes/
```

Check pods:

```bash
kubectl get pods -A
```

Check services:

```bash
kubectl get svc -A
```

Access the application:

```bash
minikube service <service-name> --url
```

## 🔐 Security Scan

Trivy is used to scan the Docker image for known vulnerabilities.

Run:

```bash
trivy image devsecops-java-app:1.0
```

The scan provides vulnerability information based on severity such as:

```text
CRITICAL
HIGH
MEDIUM
LOW
```

## 🔄 CI/CD Pipeline

```text
Developer
    ↓
GitHub
    ↓
GitHub Actions
    ↓
Maven Build
    ↓
Unit Tests
    ↓
Docker Build
    ↓
Trivy Security Scan
    ↓
Kubernetes Deployment
    ↓
Java Application
```

GitHub Actions automates the build and testing process whenever changes are pushed to the repository.

Workflow file:

```text
.github/workflows/ci.yml
```

## 📸 Screenshots

### 🏠 Application

![Application]((<Screenshot 2026-08-27 165159-1.png>))

### 🧪 Maven Tests

![Maven Tests](02-tests.png)

### 🐳 Docker

![Docker](03-docker.png)

### ☸️ Kubernetes Deployment

![Kubernetes](04-kubernetes.png)

### 🔄 GitHub Actions

![GitHub Actions](05-github-actions.png)

### 🔐 Trivy Security Scan

![Trivy Security Scan](06-security-scan.png)

## 🎯 Project Objective

The objective of this project is to demonstrate practical knowledge of **Java application development, Spring Boot, Maven, Docker containerization, Kubernetes orchestration, GitHub Actions CI/CD, Trivy security scanning, and Linux administration**.

## 👨‍💻 Author

**Venu Jaganti**

B.Tech – Computer Science & Engineering

GitHub: https://github.com/venujaganti

## 📄 License

This project is created for **educational and portfolio purposes**.