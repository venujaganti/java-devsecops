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