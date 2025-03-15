
# Springboot + TailwindCSS v4 template
This is a starter temaplete for springboot applications with tailwind v4.


## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher (or use the included Maven wrapper)
- Node.js 14 or higher and npm (for Tailwind CSS)

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/jorgegonzalezpiedra/springboot-taiwlind-stater.git
cd springboot-taiwlind-stater
```
### 2. Install dependencies
```bash
./mvnw clean install
```
This will install all the required Maven dependencies for Spring Boot.

### 3. Set Up Tailwind CSS
```bash
npm install
npm run watch
```
This will install Tailwind CSS and build your stylesheet at
*src/main/resources/static/css*

### 4. Run the application
```bash
./mvnw spring-boot:run
```
Your application will be available at http://localhost:8082

## Project structure
- **src/main/java**: Java source files including controllers and main application

- **src/main/resources/static**: Static assets

- **src/main/resources/static/css**: Static CSS files. This folder must contains a simple style.tailwind.css with `@import "tailwindcss"` and style.tailwind.build.css wich is the builded css generated for tailwind after scanning your classes

- **src/main/resources/templates**: Thymeleaf template files

- **src/main/resources/application.properties**: Application configuration

- **package.json**: Node.js dependencies
