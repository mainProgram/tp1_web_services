
# Project Setup

## Requirements
- **JDK 17**  
- **Maven 3.x**  
- **Postman**  

---

## Microservice 1 (MS1)
1. Open a console and run:  
   ```bash
   docker compose -f ./src/main/docker/keycloak.yml up
   ```
2. Open another console and run:  
   ```bash
   docker compose -f ./src/main/docker/jhipster-registry.yml up
   ```
3. Run the project:  
   ```bash
   ./mvnw
   ```

---

## Microservice 2 (MS2)
1. Open a console and run:  
   ```bash
   docker compose -f ./src/main/docker/keycloak.yml up
   ```
2. Open another console and run:  
   ```bash
   docker compose -f ./src/main/docker/jhipster-registry.yml up
   ```
3. Run the project:  
   ```bash
   ./mvnw
   ```

---

## Gateway
1. Open a console and run:  
   ```bash
   docker compose -f ./src/main/docker/keycloak.yml up
   ```
2. Open another console and run:  
   ```bash
   docker compose -f ./src/main/docker/jhipster-registry.yml up
   ```
3. Run the project:  
   ```bash
   ./mvnw
   ```

---

## URLs
- **Keycloak**: [http://localhost:9080](http://localhost:9080)  
- **JHipster Registry**: [http://localhost:8761](http://localhost:8761)  
- **OpenID Config URL**:  
  ```
  {{server}}/realms/{{realm}}/.well-known/openid-configuration
  ```

---

## Authentication with Keycloak Using Postman
Follow the tutorial [here](https://developer.entando.com/v7.3/tutorials/create/ms/use-postman-with-oauth2.html) to authenticate with Keycloak using Postman.

---

## Testing the Endpoints
After successful authentication:  
1. Visit: [http://localhost:9090/services/ms1/api/v1/hello](http://localhost:9090/services/ms1/api/v1/hello)  
   - You should see:  
     ```
     Hello world from ms1!
     ```
2. Visit: [http://localhost:9090/services/ms2/api/v1/hello](http://localhost:9090/services/ms2/api/v1/hello)  
   - You should see:  
     ```
     Hello world from ms2!
     ```

---
