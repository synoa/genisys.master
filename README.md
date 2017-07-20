# Deprecated

Use https://github.com/synoa/genisys.archetype instead. 

# genisys.master

## First Steps 👶🏽

You need a Parent Folder where all your Microservices live! In this Directory, you need some configuration files. To start just use copies of [development.properties](https://github.com/synoa/genisys.master/blob/master/development.properties), [staging.properties](https://github.com/synoa/genisys.master/blob/master/staging.properties) and [production.properties](https://github.com/synoa/genisys.master/blob/master/production.properties).

## Create a new super nice Microservice 😎

First open a Terminal and execute `mvn clean install` in the root directory of *this* project 👻!

Change the Directory to your Microservice Living Space and execute 🤖:
```
mvn archetype:generate -DarchetypeGroupId=de.synoa.genisys -DarchetypeArtifactId=getting-started-archetype
```
You should see a new Directory with the Name of your Microservice. Switch to this Directory and execute `mvn clean spring-boot:run` and see your new offspring greeting you 🙋🏼🤦🏽‍.
