# Spring

- Open source
- Inversion of Control container
- Provide complete infrastructure for developing java application
- Developed by Rod Johnson
- Apache 2.0 license in June 2003


# Feature 
-Light weight due to POJO implementation
- Spring works on modular approach
- Uses existing framework like orm, logging, JEE
- It is easier to test
- Exception handling transaction management

# Spring boot

- Open source java based framework used to develop stand alone sping application
- developed by pivotal team
- Annotation configuration and default codes

## Features of Spring Boot
- Create a stand alone app
- Embedded tomcat, jetty or Undertow
- Starter dependcies to simplify build configuration
- Increase productivity
- reduces development time and make code easier

## Why spring

- Open source 
- work like modular approach
- Build a webbase application - web module
- unit or Integrated test case - Test module

## Modules

- Spring Core COntainer - COre, beans, context, spel
- Spring Data Access/Integration  - JDBC, ORM, JMS, OXM, Transactions
- Spring Web - Web, MVC, WebSocket
- Other 
1. Spring AOP
2. Sping Implementation
3. Spring Messaging
4. Spring test

```
    Spring Data Access/Integration | Spring Web
Spring AOP | Sping Implementation| Spring Messaging
            Spring Core COntainer
                Spring test
```

## Spring Core COntainer

- Consists of Core module which provide fundamental support
- Bean Module providing basic Spring IOC container
- Context and Spring Expression Language Module

## Spring Data Access/Integration

- Provide access to DB
- Helps in easier access of Data sources
- Consists of jdbc, orm, oxm, jms, transavtion module

## Spring Web

- used for developing web applucations
- Consists of Spring web, Spring webmvc, spring websocket modules

## Spring AOP

- Support aspect oriented programming implementations
- Separtaing business logic from other cross cutting concersn like security, logging, transaction

## Spring Messaging
- Provide support for integration spring applucations with messaging systems

## Spring test

- Supports unit testing and integration testing using Junit or TestNg

Scope 
Singleton
Prototype

Stateful - Carry the state - every time an
Stateless - beans that are singleton and initilizedonly once. Shared state

## Need for IoC

# IoC - Invert the flow of control to acive loosely couple

Tight coupling - Bad Design
Loose coupling - Better Design

- No Creation of object inside another class
- Dependecy removed
- More loosle couple
- Easier to test
- The application is maitainable

## Implemnetations of IoC

1. Service Locator
2. Events
3. Delegates
4. Dependecy Injecttion

# Dependecy Injection

- External framwork -> provides/manages(Dependencies)-> to class
- A technique in which the responsibility of creating, assembling and wiring the depenencies of a dependent class is given to external framweork.

## External Depenency Injection Framework

- Sping Framwork
- Google Guice
- Play Framework

# Spring IoC Container

- Core container modules assigned for dependecy injection
- COntainer which creates, instantiate and initialized of the required objects
- Link the canfiguration metadata
- application logic is provided for creation of required objects
- application logic is maintianed using POJO classes
- Confiig metadata can be provided as:
1. XML based
2. Java based
3. Java annotation based
- Object is created and managed by beans

## Inteface Represting IoC Container

1. Bean Factory
- Represent a basic spring container
- Provides basic features 
- Beans are instantiated using getBean() method
- Beans instantiated only when getBean() is invoked

2. Application context
- More common used Spring conatiner
- Inherits featres of Bean factory
- Provides additional features supporting enterprise applicaton development
- It is implemetd by ClassPathCMLApplicationContext which is used to configure metadata.
- AnnocationConfigApplicationContext is used to java annotation metdata

## XML bases Spring COntainer configuration

- Congig metadata provided as A XML file
- Instantiated Bean using ClassPathXMLApplicationContext

## JAva based COnfiguration

- Config metadat is provided by java class
- Using @Configuration and @Bean
- @Configuration - identifies the java class as configuration class and class is expected to conatin details on Beans
- @Bean - is used for beans declaration and on methods providing bean defination. Beans declarion methods are invoked by Spring during bootstrap and values retured by these methods are treaed as spring beans
- Instantiate bean using AnnotationConfigApplicationContext

## Configuration IoC Container - Java Annotation-Based Configuration

- Need for explicit configuration is eleminated
- Beans are automcatically scanned and instantiated
- Classes annotation with @Component, @Servce, @Controller and @Reposirtory
- @Component - For genric Spring beans and used to class mark as beans
- @Service - Speciallazation of @xompoennet obj which is used to defined service level beans
- @Controller - For presentation layer web componet 
- @Reposirtory - Used to define persstence layer spring beans
- @CompnentScan - Enables auto scanng. for scanning components conatined within package conatining configuration class
- @CompnentScan(basePackages="com.infy.service") - For specifying multiple/different packages of auto-scanning components
- Instantiated bean suing AnnotatuonConfigApplicationContext

## Lazy initailation of beans

- What are lazy and Eager loading?
- Eager loading - loads all beans
- Lazy - when requesting den only load beans
- Significant 

## Differnce 
BeanFactory                         Application Context
Doesnt support annotation           support annotation
Doesnt support enterprise srives
Support Lazy loading                Support Eager loading
Beans are initilized only when getBean() is invoked     Beans are initialized when ApplicationContext is loaded

# Autowire
# Dependency injcetion using autowire


- Process of combining beans in IoC Conatiner is Wiring
- Spring Ioc Container is informed which beans is required
- how the conatiner should combine the required beans

## Manual Wiring
- Explicit defination of beans dependnecy
- Real-life applications have multiple dependecies
- Manually wiring is not a feasible task
- It is tedious for developer to kepp track
- Manually wire the dependencies

## SOln - autowire
- Spring helps to avoid manual wriring
- Spring IoC Container automates the process of Wiring
- IoC conatiner injects dependencies into dependent beans classes without defining it explicity in the configuration class
- This is call autowiring

## @AutoWIred annotation

- Allows the conatiener to inject dependcies inoto the bean
- Beans depencies are resolved based on types

## Types of autowiring

1. Autowiring on propertes
- Can be used on properties or instance variables
2. Autowiring on setter methods 
- Can be used on setter methods - setter injection
3. Autowiring on constructors
- Can be used on construtors - constructors Injection

## @Qualifier annotation
- Autowires resolved bean dependencies based on type
- @Qualifies used along with the beans name
- Specifes beans to be wired, based on the bean name
- Autowired resolved depencies based on beans name

# Bean Scopes
- Each bean has a life cycle and visibility scope in s apring application
- Bean Scopes define - How the instanecs/objects of a beans of a beasn will be fectched?
- Life cycle helps detemining various stages of a bean

## Bean Scope 
1. Singleton Design
- Only one object is created per class
- Logging, Config settings, DB connections
- Single objects acts as "Global Point of Access"
- Used when multiple instantiation is economically unfeasible and or logically not required
- Deisgn implmented by SIngleton Beans scope

- Default beans scope insoring
- follwos the singleton design pattern
- Craetesonly one instances of the bean
- Fetched same isnatnce for all request

- @Scope("singleton") - String
- @Scope(value=ConfiguraablleBeanFactory.SCOPE_SINGLETON)

2. Prototype Design
- Exsiting objects are cloned to provide the features of multiple insatantitaion
- Existing objects acts as the prototype contaning default state of the obj
- Used wehn multiple insatntioation is costly process but logically required
- Design implemnted by prototype bean scope

- Follows the prototype deisgn pattern
- creates multiple insatnces of the bean
- fatches unique insatnces for all requests
- @Scope("prototype") - string value
- @Scope(value=ConfiguraablleBeanFactory.SCOPE_PROTOTYPE) - constant value


## Types of Beans

1. Singleton
2. Prototype
3. Request
4. Session
5. Application
6. Web socket


## Spring Boot

- Add-on to the spring framework
- Makes Development of spring-based app repid and simplified
- Integrates spring framework and third party libraries to make application development easier

- Spring Application + EMbedded servers - No XML Configuration

## Cons of spring
- Reduces the productivity and incress the development time
- requires lots of Configuration, xml config
- Servers required to set explicitly to run the spring applicaions
- No measures for dealing with threats(XSS or CSRF)
- Boilerplate code to do minimal tasks
- Various option to the developers for building applications
- Several options cause confusion and wrong selection can lead to failure
2. Project Dependecy Management

## Reason for sprng boot
- Spring boot is an opinionated framework
- boilerplate and XML config
- Provide starter depencies
- Embedded servers
- Provides security
- Tomcat Webcoantoner is customizable

## Features
- Starter dependecy
- automatic config
- spring boot actuator
- easy to use embedded servlet conatiner
- Easy and fast setup, build, config and run
- Embedded servers
- Starter Dependecies
- Prodution ready feature
- No XML config
- Starter can be added to pm.xml file and used

## Starter 

- spring-boot-starter -> Core starter whic supports autoconfig, logging and YAML
- spring-boot-starter-aop -> Aspect-oriented programming using of spring AOP and AspectJ
- spring-boot-starter-data-jdbc -> Used for spring Data JDBC
- spring-boot-starter-data-jpa -> Used for spring Data JPA with Hibernate
- spring-boot-satrter-web -> Used for building web application using Spring MVC and Spring Rest and provide Tomcat as default embedded contanier
- spring-boot-starter-test -> Gives assistance to test Spring Boot application employing - Juint, Hamcrest, Mockito
- spring-boot-starter-log4j2 ->  
Provides helps to use Log4j2 for logging, alternatives to spring-boot-starter-logging
- spring-boot-starter-actuator -> Provides support for usin Spring Boot Actuator


How Spring Boot makes building app easier?
- It views classpath and configured beans
- Provides autocatic config

## AUtomatic config
- Spring MVC APplication -> Servlet Conatiner + Tomcat
- Pivotal to business logics than infrastructures and requirements

## Offers
- Quick and broadly avaialable for spring development
- Provides default config and customization
- Provides additional non- functional features like embedded servers, security, metrics etc
- Save efforts of creating codes & XML Config

## KEy features of Spring Boot

1. FailureAnaylzer
- Provides error message
- Action to fix the failure

2. Lazy initializaton
- Beans are created when required
- Not during the start of the application

3. SQL database
- Extended support to work with SQL Database
- JDBC Access using JdbCTemplate
- Object relational mapping such as hibernate

4. Spring Data
- functionality of cretaing repsoirpty implmentations

5. NoSql technologies
- Additional projects to access various NoSql technologies
- Mongodb, Neo4j

6. Provides support to liveliness State and Readiess State
- liveliness State - >If applicatons internal state lets it work precisely or recover if failing
- Readiness State -> Checks if application can handle traffic

7. It convert command option argumenst to property and add with spring env.

8. SPring boot allows block or properties to converrt JSON satructure

## @SpringBootApplication

- Indicates it as a configuration class
- Triggers autoconfiguration and component scanning
- Combination of 3 annotations and their default attributes -> @EnableAutoConfiguration @ComponentScan @Configuration

### @EnableAutoConfiguration
- Enables auto-configuration for spring boot app
- Configures application accoring to the required depeencies

### @ComponentScan
- Enables spring bean dependency injection feature using @Autowired annotation
- @Component, @Service, @Reposirtoy, @Controller automatically reg as spring beans
- injected thorugh @Autowired

### @Configuration
- Enables Java Based config for Spring boot applications

## Spring Boot Runners
- CommandLineRunnerInterfaec- run some specific code, application arg accessed as a string array
- ApplicationRunnerInterface- afetr applcaitions atrt, makes used applicationArgumentInterface
- Both interface offers single run before SpringApplication.run() completes



## Enterprise Application

- Presentation Layer
- Service Layer
Business login is implmeneted, Heart of app.
- Persistence Layer
- Database
- Same applications code in various env as config can be externalized


- Standalone, webapplication, database driven application and man

Ex. CustomerLogin - Authentication, UserInterface, Userdetails

# Spring framework

Was to reduce the complexity invloved in the development of enterprise.

POJO plain old java objects and to apply enterprise services noninvasive to pojo.

It doesnt force a programmer to extend or implment their class.
coupling - refers to the usage of an object by another
loose coupling
tight coupling

loose coupling - make by manage to any third party framwork

Core - Key modile of spring FW fundamental support on which allow their modules of frame work are dependent


# Spring IoC Container

IoC helps in creating a more loosely couple applcation. represnt the inversion of the responsibility of application object creation, initialization and destruction to the third party sch as framwork. Now thirs party takes care of apllication object management and dependencies there by making an application easy to maintain, test and resuse.

Creates, initialize and injects

Ways:
XML
Java based
Java annotation

Two types of container
1. BeanFactory 
- instatntiate, configure and manage the beans
- org.springframwwrok.beans.factory.beanfactory
2. Application Context
- Central interface within as spring application which is used for providing the configuration informatuon to the application.
- inherits --- internalizatiozation, validation etc



#### Application context can be instatnitied to 'lazy-load' Spring beans either thorugh XML-Based configuration or thorugh Java-Based Configuration

# Cross Cutting Concers

- Bsuiness logic + Cross Cutting concers = Tight coupling

## Resolution of tight coupling
- Spring offers a graceful solution to resolve tight copling with the help of Aspect Oriented Programming(AOP)

## Functionalities

- Transaction management
- Role bases security
- Logging Records
- Error handling
- Performance Monitoring 

# AOP
- Implements cross cuttig conecrnce is a central location
- More maintainable code
- Separtae business Logic
- implements functionalities without cluttering code
- It is programming paradign which helps in separtaing the cross-cutting comcerns from the core logic that increases modularity of the application.

## LoggingAspect
- Logging code is centralized inside LogginAspect class
- Can be used wherever error messages need to be logged
- Separates business logic from cross-cutting concern

## AOP Terminology

1. Aspect - Class where implmentations of cross cutting concerns is placed
2. Join Point - Join point always represents a method execution
3. Advice - Action taken by an aspect at a particular join point
4. Pointcut Expression
```
execution <modifier> <return type> <class name> <method name> (parameters)
```
- modifier is optional
- Execution is calles a pointcut designator
- tells spring that join poiny is the execution of the matching methods
- Return type is mandaortory. If doesnt mater use * as a wildcard
- class names is optional 
- * use this a wildcard
- method is mandatory
- Use * widcard as name or part of name
- To skip parameters use ..(2 dots)


- XML Basd configuration - set lazy-init="true" & by gobally set dedault-lazy-init="true"
- Java based Config - @Lazy before @Bean in class & global by setting @Lazy beafore @Configuration
- lazy-load can be autowired beafore @Autowired

@Configuration
@ComponentScan
@PropertySource - Accept the class path
@PropertySource("classpath:application.properties")

getProperty("msg")

Setter and injection

@ComponentScan(basePackages = "com.infy com.infy.congig") - scaning for multiple package

## Autowiring :

Inject the object depency implicitly

consutuctor
setter
property - refernce
Reuiqres list
cannot be used for primitive types

no 
byName
byType
constructor
autodetect


Use Dependcy Injection

IoC inversion of Control using dependcy injection.

ex: object employee and it has a depency on object address.

# Autowiring

# Spring Boot

# Logging

# Aspect Oriented Programming