# Example application for extending keycloak database
Based on official demo from keycloak:

https://github.com/keycloak/keycloak/tree/main/examples/providers/domain-extension/src/main/java/org/keycloak/examples/domainextension/jpa

documentation:

https://www.keycloak.org/docs/latest/server_development/index.html#_extensions_jpa

### Features
* Extends keycloak database with custom JPA entities


### prerequisites
* keycloak server with postgres database must be up and running


### example jpa entities
* SecurityPin with test fields id,value
* Carrier with test fields id,Carrier ID

#### How to run
* In project's root folder : `mvn clean install`
* stop keycloak service
* copy generated jar file from `/target` folder to `<keycloak_home_directory>/providers/`
* build keycloak `bin\kc.bat build`
* start keycloak `bin\kc.bat start-dev`


#### How it works
Keycloak has built-in liquibase ,so after adding the jpa entities ,`bin\kc.bat build` ,
liquibase will run example-changelog.xml and create the tables when keycloak is started (`bin\kc.bat start-dev`).
An external microservice with access to keycloak db can run CRUD operations(tested locally)
