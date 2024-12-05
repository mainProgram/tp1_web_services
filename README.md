Requirements 
* JDK 17
* Maven 3.*
* Postman

MS1
In a console execute 
docker compose -f .\src\main\docker\keycloak.yml up
In another console execute 
docker compose -f .\src\main\docker\jhipster-registry.yml up
Then build 

MS2
In a console execute 
docker compose -f .\src\main\docker\keycloak.yml up
In another console execute 
docker compose -f .\src\main\docker\jhipster-registry.yml up
Then build 

Gateway
In a console execute 
docker compose -f .\src\main\docker\keycloak.yml up
In another console execute 
docker compose -f .\src\main\docker\jhipster-registry.yml up
Then build 

Keycloak url: http://localhost:9080 
Jhipster registry url: http://localhost:8761
OpenId Config URL: {{server}}/realms/{{realm}}/.well-known/openid-configuration

Follow this link to authenticate with keycloack using postman: https://developer.entando.com/v7.3/tutorials/create/ms/use-postman-with-oauth2.html

After authentication hit http://localhost:9090/services/ms1/api/v1/hello, you should see 'Hello world from ms1 !' and http://localhost:9090/services/ms2/api/v1/hello, you should see 'Hello world from ms2 !'














