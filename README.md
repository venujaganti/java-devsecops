# Java DevSecOps Application

A Java Spring Boot application demonstrating a basic DevSecOps pipeline using **Maven, Docker, Kubernetes, GitHub Actions, and Trivy**.

---

## 🚀 Technologies

- Java 17
- Spring Boot
- Maven
- Git & GitHub
- Docker
- Kubernetes
- Minikube
- GitHub Actions
- Trivy

---

## 📁 Project Structure

```text
java-devsecops/
│
├── Dockerfile
├── pom.xml
├── README.md
│
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
└── screenshots/
    ├── 01-application.png (<Screenshot 2026-08-27 165159.png>)
    ├── 02-tests.png
    ├── 03-docker.png
    ├── 04-kubernetes.png
    ├── 05-github-actions.png
    └── 06-security-scan.png