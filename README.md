# Java DevSecOps Project

A simple Java Spring Boot application demonstrating a complete DevSecOps CI/CD workflow.

## Architecture

```text
Developer
    |
    v
GitHub
    |
    v
GitHub Actions
    |
    +----------------------+
    |                      |
    v                      v
Maven Test          OWASP Dependency Check
    |                      |
    +----------+-----------+
               |
               v
          Maven Build
               |
               v
          Docker Build
               |
               v
          Trivy Scan
               |
               v
        Docker Image
               |
               v
        Kubernetes
               |
               v
        Java Application


java-devsecops/
│
├── screenshots/
│   ├── 01-application.png 
│   ├── 02-tests.png
│   ├── 03-docker.png
│   ├── 04-kubernetes.png
│   ├── 05-github-actions.png
│   └── 06-security-scan.png
│
├── src/
├── kubernetes/
├── .github/
├── Dockerfile
├── pom.xml
├── .gitignore
└── README.md

# Java DevSecOps Project

## Project Screenshots

### 1. Application

![Application](screenshots/01-application.png)

### 2. Maven Tests

![Maven Tests](screenshots/02-tests.png)

### 3. Docker

![Docker](screenshots/03-docker.png)

### 4. Kubernetes

![Kubernetes](screenshots/04-kubernetes.png)

### 5. GitHub Actions

![GitHub Actions](screenshots/05-github-actions.png)

### 6. Security Scan

![Trivy Security Scan](screenshots/06-security-scan.png)