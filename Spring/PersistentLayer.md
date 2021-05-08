ORM

Orm support CRUD
query genration is automated
database indepent
ORM methods to perforfm he CRUD operations

## mapping
Java class - a database table
attributes of the class 
objects of th class

## CRUD
Craete
Retreive
Update
Delete

## Standard in java for ORM
JPA - Java Persistance API :
- A specifiation for using the orm
- skeleton structure
JPA implmentaion :
- Jpa vendors/Orm vendors/framworks
- Hibernate, OpenJPA, ExlipseLink

## Case study - Infy bank

## Jpa Entity class

### JPA annotations

## Spring ORM with boot Demo
Spring + Boot + ORM
Spring + Boot + JPA + Hibernate

start.spring.io

mysql
data

## spring-boot-starter-data-jpa
- Spring core jars
- sprig aop
- spring jdbc
- spring data
- spring orm
- JPA
- Hibernate

## Java Entity class
- JPA annotation
- @Entity - Java.persistenece.entity
- @Table

EntityManager - to inetract with db thorugh ORM methods connection to the database
autowired using @PErsistenceContext

Craete entity object from dto

call the JPA rom methods for crud oepartion

Transaction - represnt a single unit of work
@Transactional
Declartive transaction approach
needed when making any change to tha data abase
creates the transaction
begins
commits the transaction
the changes will be reflected on commiting the trasactions
- timeout = 
- readOnly = true

Persistence Conetxt 
a cache memory mainatained by entity manager

Entity Life Cycle States
- New State
- Manges/persistence satte
- Removed state
- Detached state

@Enumerated(value=Enumtype.STRING)

## JPQL - Java PErsisteance Query Language

- OOP + SQL
- Write the queries on the entity class rather than on the table
- Get all the customer of a given city
- SQL -> select * from customer where city = "Mumbai"
- JPQL -> Select c from Customer c where c.city="Mumbai" 

# Mysql

Mysql Server
-Open Command prompt, enter the command 'mysqld --console'
Mysql Client
-Open another cmd, enter the command 'mysql -u root'
-paste the Table Scripts
application.properties
-comment the password

## Why spring data
In spring ORM the repo is repetitaive wehn developer i mplements the repo code. it may not be consstenet

## Spring data
- A project under spring umbrella
- Helps to automate the repo/persistent layer
- It has subprojects for specific database technoligies
- It has core projects

## Query approaches

1. By methods name
- declare this methods in the repo interface
- return type findBy<attribute name><operation> {args};
- ... readBy/queryBy/getBy...
- Opeartion si optional
- List<CustomerEntity> findByCity(String city)
- List<CustomerEntity> findByCityANdCustomerType(String city, CustomerType type)
- Using the methods name JPQL query will be automatically formed
- Select C from Customer C where C.city=?1

2. By @NamedQuery
- when a query is repeatedly used at multiple places then we can create NamedQuery fro that
- on an entity class we can write named query
- Its a ORM feature and it is uppored by spring data
- provide 2 attribute -> name and query
- @NamedQuery(name="CustomerEntity.findByCity", 
    query="Slect c from customer where c.city=?1")
- @Query > @NamedQuery > Query by name

3. By @Query
- Use on top of methods name in repo interface
- support native queries
- query nativequery=true
- Explicit @Param("CustCity)
- @Query("select c from customer where c.city=?1")

##### For update query Transactional and modyfying is required //to give dml (update) rights to the @Query annotation

findAll

Pagination

- Send the data page by page
- gmail inbox mails

In crudRepository

//page number-> index=0, page size=2
Pageable page = PageRequest()

## Sorting

Sort.by("city").descending.and(Sort.by("name"))

## Identity

It is used for PK auto generation

@GeneratedValue(strategy=Generation.Identity) 
auto_incremnet in db

## Table

- Table is used for autogenarted the PK value
- Supported by all the relational DB
- 2 ways:
1. default table
- GenaratedValue(strategy=Generation.TABLE) 
- hibernate_seqence table is reuired - sequence_name and next_val
- Bydefault starting from 1
2. Custome Table
- We can create our own table and use it to auto generated PK
- We can start with any value
- @TableGenreator(name= "pkgen", table="id_gen", pkColumnName="gen_key", pkColumnValue="cust_id", valueColumnName="gen_value", allocationSIze=1) is required with GenaratedValue
- GenaratedValue(generator="pkgen", strategy=Generation.TABLE) 

## Sequenece
- Supported by oracle not supported by mysql
1. Default 
- Hibernate_sequence
2. Custom seq
- @SequenceGenerator
- @GenratedValue

## Auto

1. default
- one of identity, table and seq is selected based on underli=ying DB

2. 

## Cardinality of association
how many entites exist on the each side of the relationship for example on the customer side as well as on the address side

## 4 types
1. One - to one

- forreign key column is called join column
@JoinColumn(name="address_id",unique=True)
@oneToOne(cascade = CascadeType.ALL)
- unique constarint must
- customer is called source or owner of the relationship
- Address is called Traget of the relationship
- all the opeartions permoefed on seource will be appilcable to target antity as well

2. One to many
- One source entity associaated with many target entities
- source contans entity
- Customer - source
- Card - Target
- not unique
- In SOurce
- @JoinCOlumn(name=cust_id)
- @OneToMany(cascade=CascadeType.ALL)
 private cardEntity cardEntity -> Target entity

 - Steps:issueNewCardToExstingCustomer
 i. cardEbtty from CardDTO
 ii. find the customer using the given customerId
 iii. set card entity insdide the exiting card list of customer

 iv. save the cutsomer

3. Many to one

- Many source enttes will be associated with a sngle target entity
- not unique
- Target - Customer - One
- Source - Loan - Many

-  => In source
- @JoinColumn(name="cust_id")
- @ManyToOne(cascade=CascadeType.ALL)
- => SantionLoanExtsitingCustomer
- exsiting customerId and new LoadDTO
- 1. LoanENtity from LoanDTO
- 2. Find the customer using the given customerId
- 3. Set cutosmerEntity inside new loadENtity
- 4. Save the loanEntity
- return the generated load id
4. Many to Many


IMP
- Spring data - quereis, namedqueries, jpql, entites, priamary key geneartaion, mapping relatons - oneToone etc
- Capstone project

Obj 
- Everything
- Orm
- Pagination
- Transactional Management with
- isolation, rollaback etc

Service Layer
- Whole course

























