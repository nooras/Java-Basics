## Spring Rest

## Autowrired
- Object dependecy inject

## AutoScan

- create beans

## Spring boot

- Auto config
- Starter
- loosely coupled project
- Ioc
- AOP

## Web application

- Web client - Browser

- WEb service - Application which is hosted on server, provides data

- Spring boot have internal tomcat server installed

- http - request & repost, Protocol present

## Rest principle
/emp
class{
    /get
    method1{

    }
    /post - uniform resource locator
    method2{

    }
}

## Soap - Simple Object Protocol

## Restful Webservices - Rest Principles

## Unifrom Interface - http

## Cacheable 

## Stateless - client data should not be store on server side

## Client - server

## Layered

## Spring Rest

## Jax-Rs - Java based Framework - specifincation -  RestEasy, Jersy Implemeting

@Controller
- Class level annotations
- Java response to convert into Json and it will be used to clint side
- RequestMapping - End point to class level or method

```
@Controller
@RequestMapping(value="/emp")
class{
    @RequestMapping(value="/empGet", method=RequestMethod.GET) 
    OR
    @GetMapping (value="/empGet")

    @ResponseBody
    method1(){
        return new Employee(); -> need to convert in json
    }
    @RequestMapping(value="/empGet", method=RequestMethod.POST)
    method2(RequestBody Employee emp){
        save(emp);
    }
}
```

## Method level Annotations
- GetMapping
- PostMapping
- PutMapping
- DeleteMapping

# @ResponseBody  - Till Spring3
- COnevrt java repsonse into Json

# @RequestBody

## @RestController -> @Controller + @ResponseBody
- Repalce with controller
- Convert java to json

# RestTemplate

- You can be use in service layer
- Can be autowrired
- Inbuilt class
- 
- Method 1:
```
Main file:
@Bean
pun=blic RestTemplate template(){
    return new RestTemplate;
}

Anywhere:
@Autowired
RestTemplate rs;
```
- Method 2
```

```

- ExceptionaHandling
- @RestControllerAdvice - class - Imp for exam
- @ExceptionHandler(InfybankException.class) - method
- @ExceptionHandler({InfybankException.class, Exception.class})

# Data Validation - IMP
                null    ""   " "
## @notNull     f       t      t

## @notEmpty     f      f       t

## @notBlank     f      f       f  - use trim method

## Pattern

@Pattern(regex = "[A-Za-z]+", message="")
String name

## Authentic
- only authorize people can access

## Microservices

Presentation
Service
Persistence
Database

Funtionlities
- Login
- Search
- Buy
- Payment
- Order

Monolithic application
- Layered STructure
- Application as a whole
- Maintainence: Complexity increases and mantiance become difficult
- Funtionalities: usage of funtionalities differ
- Bug: small bug can be fatal for whole app

## Spring Microservices
- App;ication divided in small parts






