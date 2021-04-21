# Stream

- It is a flow of data
- Interface - which has lots of data processing methods. this methods called high order funtion
- Methods is takeing funtion as input or returning funtion as output is called higher order function
- having data prcoessing methods
- stream have more advance methods to process a data
- execute in parallely - enables multithreading 
-  can create from collection, array, value.

- stream - filter - foreach

# need

- lots of methods which makes easier
- faster
- multithreaded

# Junit

1. Method
2. Input to the method
3. Expected Output

Download

Import 
selct> build path > confif> java build path > classpoath > addlibrary > juint

import test from org.junit.jupiter.api

assertThrows - take 2 args - 
1st Exception class - general exception
2nd - method that want to execute in lambda

paramatrized test case

1. Value source
2. CsvSource - comma savarated value source
3. method
4. user- defined argument provider

@Tag - not null - no space - not a keyword

@RunWith(JunitPlatform.class) - make testsuite avalable for junit 5 

@runwith - org.juint.runner.RunWith
JunitPlatform.class - org.junit.platform.runner.JunitPlatform;

@SelectClasses - org.junit.platform.suite.api.SelectClasses -will select all

@IncludeTags("Invalid")- Tgas which have invalid will run only

@ExcludeTags("Invalid") - will exclude invalid test cases


### Lifecycle methods

@BeforeAll
@AfterAll
@BeforEach
@AfterEach

## Logger

Logger - will collect information and append it to appender
Apender - console or file
Layout - fromat the way we store

Modularity

Monolithic - all lib in single jar - rt.jar 
size is big and dificult to scale down

Weaker Encapsulation - module  is not accessible until we imported

Jar problem - sometimes shows compile time only

export when package is exported
reuire when packeg is needed.

## Maven

manage
snapshot - any project crrently developed
release - 

## Setting

connect to nexas repository
username
password
changing default setting

## JDBC - Obj

Data Persistence
- Saving the data
- serilization
- working with driver - driver - driver is a software componets which connect 
medium to transfer webcam to desktop
- JDBC API - Java database connectivity
- Driver Class - SC - pure java driver -type 4
- vendors - oracle/mysql/h2

Load the driver - 
Get Connection - DriverManager - JDBC - getConncetion(url, un, pswd); - return a connection object
Prepare the statement - 
Execute statement - execute, executeUpdate - update / del/etc, executeQuery - Select statment
ResultSet<Object>

Optional = of/ofNullable/empty
obj.ifpresent()
obj.orElse













