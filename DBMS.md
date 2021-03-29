# DBMS

## Data, Information, Knowledge 
- Data is raw, just a set of facts which by itself does not convey anything.
- Data => Colleting and organizing 
- We need to understand patterns between factual data and give it a meaning. This is called information which helps us with answers to questions like who, when, what, where etc. 
- Info => Information
- Synthesis of data and information leads us to answer the how question and take business decisions. This is referred to as Knowledge.
- Knowledge => Synthesizing and decision making

#### Requiremenst of data

- Integrity
- Availability
- Security
- Independent of application
- Concurrent

#### Limitation of Flat Files

Data is stored in flat files and can be accessed using any programming languauge. The file base approach sufferes following problems

1. Dependency of profran on physical structure of data
2. Complex process of retriving data
3. Loss of data on multiple access or updating 
4. Scurity is not possible
5. Data redundancy and inconsistency
6. Data isolation is not present

## Database System

```
          Users
            |
Application1 Application2
            |
          DBMS (Database)
            |
            OS
```
### Database : 
Shared collection of logically related data and description of these data, designed to meet the information needs of an org.

### DBMS :
Its is softwatre system that enables users to define, create, maintain and control acess of db.
High Cost
High end hardware configuration
DBMS IS COLLECTION OR PROGRAM TO ACCESS DATA
DBMS IS AN INTERFACE BETWEEN DATABASE APPLICATION AND DB
data can be accessed by multiple program

### application program :
An application program interatcs with a database by issuing an appropriate request. Interface between db and user

## Funtions of DBMS
1. Utilities - Import/export, backup
2. Data management - store, retrieve and modify
3. Integirty - accuracy of data
4. Transaction - modifications to db must either be successfull or not done at all
5. Security - acess to authorize users only
6. Recovery - Recoery mechanism for data

# Types of DB sys

1. Hierarchial - tree structure
2. Network - graph structure
3. Relational DB - Table format 
4. Nosql - key value pairs

Relational Model

- Relational db store data in relations i.e tables. Each relation must have a name.
- attributes/coulmns/fields
- row/record/tuples
- no of attributed/column/files - Degree of therelation
- no of rows- Cardinality of of the relation
- null represent - currenty undefined
- Domain - set of allwable value for one or more attributed - predefined value (Female, male) - set of permitted value.
- A relationship among set of values in a table is represented by a Row.
- The attribute value that is currentlt unknow is NULL.

## Data integirty and constrainsts

Data Integrity - Maintaining and assuring the accuracy and consistency of data.

1. Entity Integrity : 
- Every table either 1 and multiple uniquely identified by rows
EMP(Id, Name, sal, dept)
- Primary key constarint
- rows

2. Domain Integirty
- Data types & Check Constraint
- Restrict value
- ID - number DATATYPE
- Dept - Char DT - CHECK(ETA, ICP, IMS)
- cols

3. Referential 
- Foreign key contarint
- EMP & PURCHASE(EMPID)
- related with 2 or more table
- between tables
- Customer information must be known before anything is sold to him/her

## Candidate key
Its is minimal set of columns/attributes that can be used to uniquely identify a singles row/tuple in a relation.
A reltion can have multiple key

## Primary key
Candidate key itself but only 1 Primary key pr relation
efficient and minimal CK
PK is the CK that is selected to uniqely identify a tuple in a relation.
There cannot be more than 1 pk for a table
Uniquly identifies a row.

Table {A, B, C}

CK - A, {B, C}
Pk - A (Every Table have Only one)

Mandatory :
Must uniqly identified a tuple
Must not allow NULL values

## Foreign key:
Set of one or more cols in the child tables whose values are required to match with corresponding cols in the parent table.
One table PK is foreign key for another table
Allow NULL value, duplicates values
Relationship between 2 tables.

## Exercises - Data Integrity and Constraints

###  Exercise 1:
Consider an application for an educational institute. Every department has several instructors but an instructor can be associated with only one department. One among the instructors would act as head of the department. Instructors are allocated to take classes in multiple courses. There are many instructors for a given course.

Soln:

1. Department :

PK : DeptId
CK : DeptId, (DName, HOdId)
FK : HODId

2. Instructor

PK : InstrId
CK : InstrId, (Name, DeptId), (Name, email)
FK : DeptId

3. Allocation

PK : CId
CK : CId
FK : InstrId

4. Course

PK : CId
CK : CId, CName, (CName, Credit)
FK : -

### Exercise 2

Consider a banking application where customers have accounts. Every customer has a unique customer id. A customer can have multiple accounts in the bank. Multiple customers can share the same account number (joint account). Accounts can be of various types like saving account, current account; recurring account etc. Minimum balance must be maintained in each of these account types. Customers can perform deposit and withdrawal transactions through various means like online, cheque, cash etc. A transaction can be initiated by a single customer. A customer must have a name, address and email id. Contact number is optional.

Some relations for this banking application are provided below.

Customer (CustId, Name, Address, EMail, ContactNumber, AcctNumber, AcctType, OpenDate)

AccountType (AcctType, MinBalance)

Transaction (TId, TranType, TDate, ChequeNum, AccNum, Amount, CustId)

Requirements:

Identify the Candidate key(s), Primary key and Foreign key(s) for the above relations.


Soln:

1. CUSTOMER:
PK: (CUSTID,ACCNO)
CK: (CUSTID,ACCNO) (NAME,ACCNO), EMAIL (UNIQUE)
FK: ACCTTYPE
C01 --> 101
C01 --> 102
C02 --> 103
C03 --> 104

2. ACCT TYPE:
PK: ACCTYPE
CK: ACCTTYPE,MINBAL
FK: no
S - 0
C - 1000
R - 500

3. TRANSACTION:
PK: TID
CK: CHECKNUM, (CUSTID,TDATE), (TRANTYPE,TDATE),TID
FK: ACCNO, CUSTID

# SQL
Structured Query Language (SQL) is used to manage data in all relational databases like DB2, Oracle, SQL Server etc. SQL standards are maintained by ISO.

SQL:
DDL - Data Definition Languaage
DML - Data Manipulation language
DCL
TCL

## 2 Major roles
1. DB admin
2. Application Devloper

## 1. DB admin

## DDL - Data Definition Languaage
- Create
- Alter(Modify)
- Drop(Delete objects)
- Truncate(Delete all rows)
- Rename

## DCL - Data
- Grant - Procvide access rights on db
- Revoke - withdraw access rights on db

## 2. Application Devloper

## DML - Data Manipulation language
- Select - retrieve data from tables
- Insert - create new rows
- Delete - Delete data frpm tables
- Update - Modify

## TCL
- Commit - Save db changes permanently and end trascation
- Rollback - undo chnages

Insert 5 emp details
Commit

Insert 5 emp details
Rollback

Autocommit -> On, all operation save by default

# ALTER Command     |  	UPDATE Command

SR.NO	ALTER Command	UPDATE Command
1.	ALTER command is Data Definition Language (DDL).	| UPDATE Command is a Data Manipulation Language (DML).
2.	Alter command will perform the action on structure level and not on the data level. | 	Update command will perform on the data level.
3.	ALTER Command is used to add, delete, modify the attributes of the relations (tables) in the database.  |	UPDATE Command is used to update existing records in a database. 
4.	ALTER Command by default initializes values of all the tuple as NULL. |	UPDATE Command sets specified values in the command to the tuples.
5.	This command make changes with table structure. | This command makes changes with data inside the table.
6.	Example : Table structure, Table Name, SP, functions etc. |	Example : Change data in the table in rows or in column etc.


## SQL DATATYPE
- Character DT
- Integral DT
- Non Integral DT
- Miscellaneous DT

### Character DT
1. CHAR
- Size of n chars - predefined length
- trailing spaces are applied
- 2000 bytes
- CHAR(10) = Hello - 'HELLO' Consume full 10 bytes

2. VARCHAR2
- length vary
- size of actual no of char + fixed size to store length
- spaces are not applied
- 4000 bytes
- VARCHAR2(5)
ETA -> 'ETA' - 3 bytes + fixed bytes to store len(1 bytes) = 4 bytes

### SQL integral DT

SMALLINT
INTEGER
INT

### SQL non integral DT
Numeric
Decimal
Number

- Precision - Total no of significant digits (Digits afater and before decimal)
Scale - no of digits after decimal

- DECIMAL (4,2) -> 99.99
Before decimal = 4-2 = 2
After decimal = 2 

More digita before decimal errr - NUMBER(5,2) : 1234.56 - error
More digits after decimal rodunde off - NUMBER(5,2) : 123.567 - 123.57

### Miscellaneous DT
DATE -> Default format DD-MM-YY
TimeStamp -> for storing time

CLOB > VARCHAR
BLOB - Storing movies, img

## Operators

Arithemtic : +-*/
Comparison : <, >, <=, >=, <>(Not euqal)
Assignemnt : =
Equality check : =
Range : Balance between 1500 and 2000
List - IN : DEPT IN (ETA, ICP, IMS) => DEPT=ETA or DEPT=ICP or DEPT=IMS
NULL test : IS NULL
String mattern matching -Like : NAME LIKE 'S%'
%: 0 or more char
_: 1 char
NAME LIKE '_a%' -> Searching for sec char 'a' in name
NAME LIKE '%y' -> LAST CHAR Y
NAME LIKE '%r%' -> anyhwre in the name
NULL Comparison : 
NULL is like an indicator

Logical :
And Or Not

Expression : Like BODMAS rule

# DDL :

## Create:
Is use to craete a table in a db.

Syntax:
```
CREATE TABLE TABLE_NAME(COLNAME1 DATATYPE, COLNAME2 DATATYPE);
```
Example:
```
CRAETE TABLE STUDENT(
    STID INTEGER constarint std_pk primary key,
    SNAME VARCHAR2(20) not null,
    EMIAL VARCHAR(30) unique,
    DEPARTMENT CHAR(5) check (dept IN('IMS', 'ETA', 'ICP')),
    DOJ DATE default sysdate / default '01-Jan-2021',
    COURSEID CHAR(5) foreign key references (COURSE(ID))
);

CRAETE TABLE STUDENT(
    STID INTEGER,
    constarint std_pk primary key(stdid),
    SNAME VARCHAR2(20) not null,
    EMIAL VARCHAR(30) unique,
    DEPARTMENT CHAR(5) check (dept IN('IMS', 'ETA', 'ICP')),
    DOJ DATE default sysdate / default '01-Jan-2021',
    COURSEID CHAR(5) foreign key references (COURSE(ID))
);

CREATE TABLE ALLOCATIION(
    EMPID INT REFERENCES EMPLOYEE(ID),
    COMPID INT REFERENCES COMPUTER(COMPID),
    ALLOCATE DATE,
    PRIMARYKEY(EMPID, COMPID)
)
```
## CONSTARINTS:

1. PRIMARY KEY 
- no null, no duplicate
- only 1 PK in one table
- Example
```
CREATE TABLE Student ( 
    StudentId INTEGER CONSTRAINT stud_sid_pk PRIMARY KEY,
    FName VARCHAR2(10), 
    ContactNo NUMBER(10));
```

2. FOREIGN KEY
- can have null & duplicate
- Example
```
CREATE TABLE MARKS(
    COURSEID INTEGER,
    STUDENTID INTEGER CONSTRAINT marks_sid_fk REFERNCES STUDENT(STUDENT),
    MARKSSCORED DECIMAL(5,2));
)
```

3. CHECK CONSTARINT 
- put restriction/limit on value stored
- Example:
```
CREATE TABLE Student ( 
    StudentId INTEGER, 
    FName VARCHAR2(10), 
    Gender CHAR(1) CONSTRAINT Stud_gender_ck1 CHECK(Gender IN('M', 'F'))); 
```

4. NOT NULL 
- col cant have NULL values
- applied to column level constraint only
- EXAMPLE - 
```
CREATE TABLE STUDENT (FNAME VARCHAR(10) NOT NULL);

CREATE TABLE Student (
    StudentId INTEGER CONSTRAINT Stud_SId_nn NOT NULL,
    FName VARCHAR2(10) NOT NULL,
    LName VARCHAR2(10));
```
- Only space is valid - " "
- cannot insert emtry string - ""
- NULL = NULL - One Null is not equal to another null (NEED TO VERIFY )

5. UNIQUE 
- allow only unique values & NULL. Duplicates are not allowed.
- 2 rows in a table caonnt have same value
- Allow null value
- Example:
```
CREATE TABLE Student ( 
    StudentId INTEGER, 
    FName VARCHAR2(10), 
    ContactNo NUMBER(10) CONSTRAINT Stud_cno_uk UNIQUE);
```

Define constraint: CONSTRAINT cons.name PRIMARY KEY/ PRIMARY KEY
2 ways: TABLE Level (after col defination)

6. Default Value : 
- It is not constraint, just a features. Oracle db does not consider default as a constraint
- Can insert NULL value
```
CREATE TABLE Student (
    StudentId INTEGER, 
    FName VARCHAR2(10), 
    DOJ DATE DEFAULT SYSDATE);
```

ALL EXAMPLE:
```
CREATE TABLE Student (
     StudentId INTEGER PRIMARY KEY,
     FName VARCHAR2(10) CONSTRAINT Stud_FName_NN NOT NULL,
     LName VARCHAR2(10), CHECK (FName <> LName),
     DOJ DATE DEFAULT SYSDATE,
     Gender CHAR(1) CONSTRAINT Student_Gender_Ck CHECK (Gender IN('M', 'F')),
     PersonId INTEGER REFERENCES Person(PersonId));
```

## Not Null  only define at Column level



## Exercise 1:
https://lex.infosysapps.com/en/viewer/rdbms-hands-on/lex_auth_0127291332680990721?collectionId=lex_auth_0128302979653386245633&collectionType=Course

```
CREATE TABLE PLAYER(
    PId INTEGER CONSTRAINT player_pid_pk PRIMARY KEY,
    PName VARCHAR2(20) NOT NULL,
    Ranking INTEGER
);
```

## Exercise 2:
https://lex.infosysapps.com/en/viewer/rdbms-hands-on/lex_auth_0127326956316262401?collectionId=lex_auth_0128302979653386245633&collectionType=Course
```
CREATE TABLE TOURNAMENT(
    TId INTEGER CONSTRAINT tour_tid_pk PRIMARY KEY,
    TName VARCHAR2(30) NOT NULL,
    StartDt DATE NOT NULL,
    EndDt DATE NOT NULL,
    Prize INTEGER NOT NULL
);
```

## Exercise 3:
```
CREATE TABLE MATCH(
    MId INTEGER,
    TId INTEGER,
    CONSTRAINT match_mid_tid_pk PRIMARY KEY(MId, TId),
    CONSTRAINT match_tid_fk FOREIGN KEY(TId) REFERENCES TOURNAMENT(TId),
    Player1 INTEGER CONSTRAINT match_p1_pid REFERENCES PLAYER(PId),
    Player2 INTEGER CONSTRAINT match_p2_pid REFERENCES PLAYER(PId),
    CHECK (Player1 <> Player2),
    MatchDt DATE NOT NULL,
    Winner INTEGER CONSTRAINT match_win_pid REFERENCES PLAYER(PId),
    Score VARCHAR2(30) NOT NULL
);
```

## Exercise 4

```
Alter table Player add(
MatchesPlayed Number,
MatchesWon Number
);
```

Desc STUDENT:

## DROP
It is used to remove an existing table from the db.
Syntax:
```
DROP TABLE TABLE_NAME;
```
Example:
```
DROP TABLE STUDENT;
```
## ALTER

Use for table modification

Adding new col:
```
ALTER TABLE STUDENT ADD MARKS DECIMAL(5,2)
```

Modify datatype
```
ALTER TABLE STUDENT MODIFI ADDRESS VARCHAR(52);
```

Reanme
```
ALTER TABLE STUDENT 

ALTER TABLE STUDENT

ALTER TABLE STUDENT
```

## DML
## INSERT
- We can insert with omitting null
- we can omit default
- unique constraint allow null and multiple nulls

```
INSERT INTO TABLE_NAME (COL NAME) VALUES (DATA);

INSERT INTO STUDENT (STDID, SNAME, EMAIL, DEPT, DOJ, COURSEID) VALUES (100, 'FAM', 'FAM@123', 'IMS', '01-03-2021', NULL);

Withour cols:
INSERT INTO Employee VALUES (6, 'James Potter', '01-Jun-2014', 75000.00, 1000.00, 'ETA', 'PM', NULL, 1004);

with cols in correct order:
INSERT INTO Employee (Id, Ename, DOJ, Salary, Bonus, Dept, Designation, Manager, Compid) VALUES (7, 'Ethan McCarty', '01-Feb-2014', 90000.00, 1200.00, 'ETA', 'PM', NULL, NULL); 

With cols in any order:
INSERT INTO Employee (Id, Compid, Ename, DOJ, Salary, Bonus, Dept, Designation, Manager) VALUES (8, 1004, 'Emily Rayner', '01-Jan-2014', 25000.00, 100.0, 'ETA', 'SE', NULL);
```

## Update

- Modify existing table.
- 
```
Without where clause:
UPDATE Employee SET SALARY = SALARY * 1.10

Single col update:
UPDATE Employee SET SALARY = SALARY * 1.20 WHERE ID = 2;

Multiple col update:
UPDATE Employee SET SALARY = SALARY * 1.3, BONUS = SALARY * 0.30 WHERE ID = 1

Multiple conditions in where:
UPDATE Employee SET SALARY = SALARY * 1.40 WHERE DESIGNATION = 'SE' OR DEPT = 'ETA'

UPDATE TABLE_MAME SET COL_NAME = VALUE WHERE COL_NAME=VAL;

UPDATE STUDENT SET DOJ = "04-03-2021" WHERE DEPT='ETA';

UPDATE STUDENT SET DEPT = 'IMS', EMAIL="ABC@123' WEHRE STID = 1002;

UPDATE STUDENT SET STID = 1001 WHERE SNAME LIKE 'S%';

Foreign key violation
```

## DELETE & TRUNCATE
- DELETE statement is used to delete records from a single table in a relational database. 
- TRUNCATE statement can also be used to delete data from tables. TRUNCATE statement deletes all rows from the table as it does not support WHERE clause. TRUNCATE statement is a faster option compared to DELETE when you have to delete all rows from the table.
```
Filter single row
DELETE FROM STUDENT WHERE STDID = 1002;

DELETE FROM Employee WHERE Id = 5;

filter multiple conditions
DELETE FROM Employee WHERE Dept ='ETA' and Manager = 2;

Delete statement will remove all rows of a table
DELETE FROM Employee;
```
cust - MULTIPLE ACCR
ACCT - MULTIPLE CUST
TRANS-CUST
CUST-NAME, ADD, EMAIL, PHONE(OP)



EXERICE 3

Create table Match(
MID INTEGER,
TID INTEGER,
PRIMARY KEY(MID, TID),
PLAYER1 INTEGER REFERENCES PLAYER(PID),
PLAYER2 INTEGER REFERENCES PLAYER(PID),
CHECK (PLAYER1 <> PLAYER2),
MATCHDT DATE NOT NULL,
WINNER INTEGER REFERENCES PLAYER(PID),
SCORE VARCHAR(30) NOT NULL
);

ASSIGNMENT 1:
ARCODE -> CHECK (ARCODE LIKE 'A%')
QUANITY -> DEFAULT 0 CHECK (QTY >= 0)
QUANTITY -> DEFAULT 0,
            CHECK (QTY >= 0)
CLASS -> CHECK (CLASS IN ('A', 'B', 'C'))


CREATE TABLE ARTICLE(
    ARCODE CHAR(5) CONSTRAINT ARCODE_CHECK 
)


# Exercise 5:
```
UPDATE Product SET Discount = 25  WHERE Category='Sports'; 
```

# Exercise 6:
```
Delete from SaleDetail where SaleId=1004;

```

# Assignment 1
```
CREATE TABLE Article(
    ArCode CHAR(5) PRIMARY KEY CHECK (ArCode LIKE 'A%'),
    ArName VARCHAR2(30) NOT NULL,Rate NUMBER(8,2),
    Quantity NUMBER(4) DEFAULT 0 CHECK (Quantity>=0),
    Class CHAR(1) CHECK (Class IN('A','B','C')));
```

# Assignment 2
```
INSERT INTO Article VALUES(
    'A1001',
    'Mouse',
    500,
    0,
    'C'
);
```
-----------------------------------------------
## Select:
- SQL is used to retrieve or fetch data from a database.
- ALIAZING - ASSIGN ANOTHER NAME

Select all cols
```
SELECT * FROM Employee
```

Filter cols
```
SELECT Id, EName, Salary FROM Employee
```

Alias without as keyword
```
SELECT Id EmpId, EName EmpName, Salary FROM Employee
```

Alias with as keyword
```
SELECT Id AS EmpId, EName AS EmpName, Salary FROM Employee
```

Expression:
```
SELECT EName, Salary * 2 AS Double_Salary FROM Employee
```

Constant: row with a value 30 is added
```
SELECT EName, 30 AS Value FROM Employee
```

## WHERE :
- can be used on all column

Comparison Opertaor
```
SELECT * FROM EMPLYEE WHERE SALARY = 100;

SELECT ID, ENAME FROM Employee WHERE SALARY > 40000
```

And :
```
SELECT ID, ENAME FROM Employee WHERE SALARY >= 30000 AND DEPT = 'ETA'
```

Or:
```
SELECT ID, ENAME FROM Employee WHERE SALARY > 75000 OR DEPT = 'ICP'
```

BETWEEN : Values range
salaray between 1000 and 2000 => salary is >=1000 abd salary <=2000

```
Select id, ename, doj, dept, salary, bonus from employee where salary between 25000 and 75000;
```

NOT IN : negate the condition
```
Select id, ename, doj, dept, salary, bonus from employee where salary not in(25000,75000);
```

IN: Check for multiple values of an attribute, equivalent to or opertor
c1 in (1,2) is similar to c1=1 or c1=2
```
SELECT ID, ENAME FROM Employee WHERE ID IN (2,3),

Select id, ename, doj, dept, salary, bonus from employee where bonus in(1200, 1000, 100);
```

In with duplicates:
```
SELECT ID, ENAME FROM Employee WHERE DEPT IN ('ETA', 'ETA')
```

=NULL:
equal to operator cannot be used to check for NULL values.
No output though they have BONUS as NULL
```
SELECT ID, EName FROM Employee WHERE BONUS = NULL
```

IS NULL:
IS NULL IS USED TO CHECK NULL VALUE
```
SELECT ID, EName FROM Employee WHERE BONUS IS NULL
```

IS NOT NULL: CHECK IF NOT NULL VALUE
```
SELECT ID, EName FROM Employee WHERE BONUS IS NOT NULL
```

SOME COLUMNS SELECTION:
```
Select id, enmae, salary*2 double_salary from employee;

SELECT ID, ENAME, 1 FROM EMPLOYEE;

SELECT ID, ENAME, 's' FROM EMPLOYEE;
```
CASE:
```
SELECT ID, ENAME CASE
WHEN BONUS IS NULL THEN 0
WHEN BONUS IS NOT NULL THEN 1
END BINARY_BONUS FROM EMPLOYEE;

SELECT * FROM EMPLOYEE;
```


## DISTINT
- Remove duplicates based on all the col in select clause
- Disticnt must be used immediately after SELECT
- it consider null value
- used only wth select 
- usage of distinct should be avoided as far as possible due to perfeormance issues.

Single duplicate
```
SELECT DISTINCT DEPT FROM EMPLOYEE;

SELECT ID,ENAME FROM EMPLOYEE WHERE DEPT IN (SELECT DISTICNT DEPT FROM EMPLOYEE);
```

Multiple Duplicate
```
SELECT DISTINCT Dept, Manager FROM EMPLOYEE
```

## LIKE
```
WORD START WITH E
SELECT * FROM EMPLOYEE WHERE ENAME LIKE "E%";

WORD END WITH E
SELECT * FROM EMPLOYEE WHERE ENAME LIKE "%E";

WORD HAVE E ANYWHERE
SELECT * FROM EMPLOYEE WHERE ENAME LIKE "%E%";

WORD HAVE SECOND CHARACTER E
SELECT * FROM EMPLOYEE WHERE ENAME LIKE "_E%";

WORD HAVE SECOND LAST CHARACTER E
SELECT * FROM EMPLOYEE WHERE ENAME LIKE "%E_";

select id,ename,doj,salary,bonus,dept from employee where doj like '__-JAN-__';

select id,ename,doj,salary,bonus,dept from employee where doj like '%JAN%';
```

ORDER BY:


SELECT * FROM EMPLOYEE ORDER BY SALARY;

IN DESCENDING:
SELECT * FROM EMPLOYEE ORDER BY SALARY, DEPT DESC;

SELECT * FROM EMPLOYEE ORDER BY SALARY DESC, DEPT DESC;

SELECT DISTICNT DEPT, SALARY FROM EMPLOYEE ORDER BY SALARY DESC, DEPT DESC;

F J W G H S D O


# Funtions 

## Numeric Functions:
ABS(VALUE) - RETURN ABSOULTE VALUE OF A NUMBER
ROUND(VALUE, DIGITS) - - RETURN THE VALUE OF A SPEICIFIED DEIGITS
CEIL(VALUE)
FLOOR(VALUE)

SELECT CITY, MINTEMP, CEIL(MINTEMP) AS CEIL, ROUND(MINTEMP, 1) AS ROUND, ABS(MINTEMP) 

## CHARATER FUNCTIONS

UPPER(VALUE)
LOWER(VALUE)
CONCAT(VALUE1, VALUE2)
LENGTH(VALUE)
SUBSTR(VALUE, START_POSITION, LENGTH)/SUBSTR(VALUE, START_POSITION)
SUBSTR("DATABASE", 5) = "BASE"
SUBSTR("DATABASE", 3, 3) = "TAB"

SELECT CONCAT(CITY, COUNTRT) "CONCAT", 
CITY || COUNTRY "CONCATBYOPERTOR", 
CONCAT(CONCAT(CITY, ','), COUNTRY) "NESTEDCONCAT", 
CONCAT((CITY|| ','), 
COUNTRY) "NESTEDCONCATOPERATOR" FROM WHETHER;

SELECT CITY, 
SUBSTR(CITY, 1, 4) FIRST4,
SUBSTR(CITY, 2, 10) TEN,
SUBSTR(CITY, 3) THREE,
SUBSTR(CITY, 7, 2) SEVEN FROM WHETHER

## CONVERSION FUNTION - 1-2 QUESTION WILL BE ASK IN EXAM

TO_CHAR(VALUE, FORMAT) - CONVERT NUMBER OR DATE OF STRING
TO_DATE(VALUE, FORMAT) - - CONVERT A STRING TO A DATE
TO_NUMBER(VALUE, FORMAT) - CONVERT A STRING TO A NUMBER

- TO_CHAR(VALUE, FORMAT)
VALUE- DATE & NUM
FORMAT - OUTPUT FOMRAT

MON, MONTH, DY, DAY
TO_CHAR(RecordDate, 'Mon') - 3 LETTER OF MONTH
TO_CHAR(RecordDate, 'Month')
TO_CHAR(RecordDate, 'DY') - 3 LETTER OF DAY
TO_CHAR(RecordDate, 'DAY')
TO_CHAR(RecordDate, 'DD') - DAY - 23,24
TO_CHAR(RecordDate, 'CC') - CENTURAY -LAST 2 DIGITS - 21
TO_CHAR(RecordDate, 'YYYY')
TO_CHAR(RecordDate, 'MN') - MONTH NUMBER
TO_CHAR(25-MAR-2021, YYYY-MM-DD)

TO_CHAR(MINTEMP)
TO_CHAR(MINTEMP, "999.99")
TO_CHAR(MINTEMP, "$9,9.99")

```
SELECT RecordDate, TO_CHAR(RecordDate, 'MON') "MONTH", TO_CHAR(RecordDate, 'Month') "FULL_MONTH", TO_CHAR(RecordDate, 'Dy') "DAY", TO_CHAR(RecordDate, 'Day') "FULL_DAY" FROM Weather;
```

- TO_DATE(VALUE, FORMAT)
INPUT - STRING
OUTPUT - NUMBER/DATE
MUST SPEICFY FORMAT
SELECT "01-JAN-2021" DATE_STRING, 
TO_DATE("01-JAN-2021", "YYYY-MON-DD") DATE2,
TO_DATE("01-JAN-2021", "MON-YYYY-DD") DATE3 FROM DUAL;


- TO_NUMBER(VALUE, FORMAT)

SELECT "1000.98" , 
TO_NUMBER("1000.98")

SELECT TO_CHAR(TO_DATE("24-mar-2021"), "MON") FROM DUAL;

## DATE FUNTIONS

- SYSDATE 
- SYSTIMESTAMP
- ADD_MONTHS(DATE, N) - ADD N MONTHHS TO DATE
- MONTHS_VETWEEN(DATE1, DATE2)

SELECT RECORDATE,
ADD_MONTHS(RECORDATE, 1),
MONTH_BETWEEN("01-FEB-2014", "01-JAN-2014");

## AGGREGATE FUNCTIONS

MULTIPLE ROW FUNTIONS
RETURN SINGLE ROW
MIN()
MAX()
SUM()
AVG()

COUNT(*) - COUNT ALL ROWS
COUTN(COL_NAME) - COUNT ALL VALID VALUES- IGNORE NULL

SELECT MIN(SALARY), MAX(SALARY), SUM(SALARY), COUNT(ID), COUNT(*), COUNT(BOUNS) FROM EMPLOYEE;

- count with distinct
SELECT COUNT(DISTINCT DEPT) FROM EMPLOYEE

SELECT AVG(SALARY), AVG(BOUNS), SUM(BOUNS)/COUNT(BONUS) FROM EMPLOYEE;

NVL() ~>

SELECT NVL(CITY, "NOT AVAILABLE"),
NVL(MINTEMP, 0.0),
NVL(TO_CHAR(MINTEMP), "NOT AVAILABLE") FROM WEATHER;

## GROUP BY
- after grouping you can only access group by coulmn and by aggreegate funtions on group by column

SELECT COUNT(*) FROM EMPLOYEE WHERE GROUP BY DEPT;

SELECT SUM(SALARY) FROM EMPLOYEE WHERE GROUP BY DEPT;

SELECT COUNT(BONUS), BONUS FROM EMPLOYEE WHERE GROUP BY BOUNS;

SELECT max(SALARY), Dept, Designation FROM EMPLOYEE WHERE GROUP BY Dept, Designation;

SELECT max(SALARY), min(salary), Dept FROM EMPLOYEE WHERE GROUP BY Dept;

SELECT max(avg(salary)) from EMPLOYEE GROUP BY DEPT;

SELECT avg(salary), DEPT from EMPLOYEE GROUP BY DEPT HAVING AVG(SALARY) >50000 ;

WHERE -> APPLY TO SINGLE ROW, MIN, MAX, SUM, AVG
HAVING CLAUSE -> APPLY TO MULTIPKE ROWS


SELECT DEPT, AVG(SALARY) "SALARY" FROM EMPLOYEE GROUP BY DEPT ORDER BY "SALARY";


# Exercise 7

```
SELECT Prodid, Pdesc, Category, Discount from Product where Category = 'Apparel';
```

# Exercise 8
```
SELECT Prodid, Pdesc, Category, Discount from Product where Pdesc IS NULL;
```

# Exercise 9
```
SELECT Prodid, Pdesc, Category, Discount from Product where Category='Apparel' and Discount > 5;
```

# Exercise 10
```
SELECT Prodid, Category, Discount from Product where Category='Apparel' or Category='Sports' order by category, discount;
```

# Exercise 11
```
SELECT PRODID,SUM(QUANTITY) "QTY_SOLD" FROM SALEDETAIL WHERE QUANTITY>1
GROUP BY PRODID HAVING COUNT(PRODID)>1;
```

# EXERCISE 12
```
SELECT LOCATION, COUNT(LOCATION) "NUMBER_SMAN" FROM SALESMAN GROUP BY LOCATION;
```

# Assigment 3:
```
SELECT DESCR, PRICE FROM ITEM WHERE DESCR LIKE '%Hard disk';
```

# Assigment 4:
```
SELECT * FROM QUOTATION WHERE QSTATUS<>'Accepted';
```

# Assigment 5:
```
SELECT DESIGNATION, SALARY FROM EMPDETAILS WHERE DESIGNATION IN('Manager', 'Billing Staff');
```
# Assigment 6:
```
SELECT ROID, LOCATION FROM RETAILOUTLET WHERE MANAGERID IS NULL;
```
# Assigment 7:
```
SELECT ORDERID, QUOTATIONID, STATUS FROM ORDERS WHERE ORDERDATE BETWEEN '1-DEC-2014' AND '1-JAN-2015';
```

# Assigment 8:
```
SELECT ORDERID, STATUS, NVL(PYMTMODE, 'Payment yet not done') "PYMTMODE" FROM ORDERS ;
```
# Assigment 9:
```
SELECT COUNT(ORDERID) TOTALORDERSCOUNT, COUNT(AMOUNTPAID) PAIDORDERSCOUNT from Orders;
```

# Assigment 10:
```
SELECT MAX(SALARY) MAXSAL, MIN(SALARY) MINSAL, SUM(SALARY) TOTALSAL, AVG(SALARY) AVGSAL FROM EMPDETAILS;
```

# Assigment 11:
```
SELECT ITEMCODE, AVG(QTYAVAILABLE) AS "Average Quantity" FROM RETAILSTOCK HAVING  AVG(QTYAVAILABLE) < 75 GROUP BY ITEMCODE;
```
# Assigment 12:
```
SELECT SNAME, AVG(QUOTEDPRICE) "Average quoted price" FROM QUOTATION  WHERE QSTATUS='Closed' GROUP BY SNAME HAVING AVG(QUOTEDPRICE)>500;

<!-- SELECT SNAME, avg(quotedprice) FROM QUOTATION WHERE QSTATUS = 'Closed' GROUP BY SNAME HAVING AVG(QUOTEDPRICE) > 500 -->
```
# Assigment 13:
```
SELECT JOB, AVG(SAL) "Average Salary" FROM EMP WHERE JOB IN ('MANAGER', 'ANALYST') GROUP BY JOB HAVING AVG(SAL) >1500;
```
# Assigment 14:
```
SELECT JOB, DEPTNO, AVG(SAL) AVGSALARY FROM EMP WHERE DEPTNO IN(10,20) AND SAL>2000 GROUP BY JOB,DEPTNO HAVING AVG(SAL)>2500;

<!-- SELECT JOB,DEPTNO,AVG(SAL) FROM EMP WHERE DEPTNO IN (10,20) AND SAL > 2000
GROUP BY JOB,DEPTNO 
HAVING AVG(SAL) > 2500 -->
```

# Joins

## Crosss join
- WILL CROSS JOIN TO EACH ROW 
- TABLE 1 = 5 ROW , TABLE 2 = 5 ROW => TOTAL ROW WILL BE 25

```
SeleSELECT ENAME, E.COMPID, MAKE, MYEAR FROM EMPLOYEE CROSS JOIN COMPUTER C ON E.COMPID = C.COMPID; 
```

## Inner join 
- JOINING BASED ON CONDDITION
- BOTH CONDITION SHOULD BE MATCHED
- SINGLE ROW CONDITION -> WHERE / ON -> NO DIFFERNCE IN INNER JOIN
- EMP-> COMPUTER : EMP.COMPID = COMP.COMPID

```
SELECT ENAME, E.COMPID, MAKE, MYEAR FROM EMPLOYEE INNER JOIN COMPUTER C ON E.COMPID = C.COMPID; 
```

WITH WHERE CONDITION:
```
SELECT ENAME, E.COMPID, MAKE, MYEAR FROM EMPLOYEE INNER JOIN COMPUTER C ON E.COMPID = C.COMPID WHERE MAKE="DELL"; 
```

NO WHERE - REPLACING WITH ---ON---AND---
```
SELECT ENAME, E.COMPID, MAKE, MYEAR FROM EMPLOYEE INNER JOIN COMPUTER C ON E.COMPID = C.COMPID AND MAKE="DELL"; 
```

# eXERCISE 

```
SELECT E.ID, E.ENAME, E.COMPID, C.MAKE FROM EMPLOYEE E INNER JOIN COMPUTER C ON E.COMPID = C.COMPID AND MODEL IN ('Precision','Edge');

```

## SELF JOIN 

SELECT EMP.ID EMPID, EMP.ENAME EMPNAME, MGR.ID MGRID, MGR.ENAME MGRNAME 
FROM Employee EMP INNER JOIN Employee MGR ON EMP.MANAGER = MGR.ID 


## EX 14

SELECT DEPT, COUNT(MAKE) "NUMBER OF COMPUTERS" FROM COMPUTER C INNER JOIN EMPLOYEE E ON C.COMPID=E.COMPID WHERE MAKE='Dell' GROUP BY DEPT;

<!-- SELECT DEPT, COUNT(E.COMPID) FROM COMPUTER C INNER JOIN EMPLOYEE E ON C.COMPID = E.COMPID AND MAKE = 'DELL' GROUP BY E.DEPT; ERRR -->

# EX 15
SELECT S1.SID, S1.SNAME, S1.LOCATION FROM SALESMAN S1 INNER JOIN SALESMAN S2 ON S1.LOCATION = S2.LOCATION AND S1.SID<>S2.SID;

# EX 16
SELECT P1.PRODID, P1.CATEGORY, P1.PRICE FROM PRODUCT P1 INNER JOIN PRODUCT P2 ON P1.PRICE=P2.PRICE AND P1.PRODID<>P2.PRODID;

# LEFT JOIN

SELECT * FROM EMPLYEE LEFT OUTER JOIN COMPUTER ON EMPLOYEE.COMPID=COMPUTER.COMPID

SELECT * FROM EMPOYEE LEFT OUTER JOIN COMPUTE ON E.COMPID = C.COMPID WHERE MAKE='DELL';

WHERE - WILL GIVE ONLY VALID OUTPUT - WILL REMOVE NULL VALUE - IT WILL FILER WHOLE TABLE ROWS
ON - AND CONDITION - WILL GIVE ALL LEFT TABLE VALUE WITH RIGHT NULL VALUE
LOOKUP TABLE


# RIGHT JOIN

SELECT * FROM EMPLYEE RIGHT OUTER JOIN COMPUTER ON EMPLOYEE.COMPID=COMPUTER.COMPID;

# FULL

SELECT * FROM EMPLYEE FULL OUTER JOIN COMPUTER ON EMPLOYEE.COMPID=COMPUTER.COMPID;


## Exercise 17

SM LJ SALE
SALEDDETAILS IJ PRODUCT RJ SM LJ SALE

SM LJ SALE LJ SD LJ PRODUCT

identity saleid which has qty >1 --> WHERE
to find sum of each prod --> GROUP BY PROID

Products sold more than once --> COUNT(PRODID) >1

SELECT PRODID, SUM(QUANTITY) FROM SALEDETAIL WHERE QUANTITY >1 GROUP BY PRODID HAVING COUNT(PRODID) > 1

```
SELECT SM.SID, SM.SNAME, 
NVL(SUM(PRICE*QUANTITY),0) TAMOUNT,
NVL(SUM((PRICE*QUANTITY*DISCOUNT)/100),0) TDISCOUNT
FROM SALESMAN SM LEFT JOIN SALE S ON SM.SID=S.SID LEFT JOIN SALEDETAIL SD ON S.SALEID=SD.SALEID LEFT JOIN PRODUCT P ON P.PRODID = SD.PRODID GROUP BY SM.SID, SM.SNAME;
```
WHEN TO APPLY GROUP BY AND WHAT COLUMN NEED TO PASS WITH GROUP BY ?

WHEN WE USE AGGREGATE FUNTION THAT TIME ADD GROUP BY FUNTION. WHATEVER VALUE NEED TO SHOW WITH SELECT X,Y THAT COLUMN WITLL COME WITH GROUP BY X,Y

TOTAL SALE AMT = SUM()

TOTAL DISCONT = SUM()
JOINS = 3 TABLES
GROUP BY

# EXERCISE 18
Emp.MgrId = Mgr.Id

Employee Emp Inner Join Computer EC
Employee Mgr Inner Join Computer MC
Employee Emp Inner JOin Employee Mgr
Emp.name  Mgr.Name  EC.model MC.model

```
SOL 1 WITH INNER JOIN:
SELECT EMP.ID ID, EMP.ENAME ENAME, MGR.ID MGRID, MGR.ENAME MGRNAME, C.MODEL E_MODEL, CC.MODEL M_MODEL FROM Employee EMP INNER JOIN Employee MGR ON EMP.MANAGER = MGR.ID INNER JOIN COMPUTER C ON EMP.COMPID = C.COMPID INNER JOIN COMPUTER CC ON MGR.COMPID = CC.COMPID;

SOL2 WITH LEFT JOIN:
SELECT EMP.ID ID, 
EMP.ENAME ENAME, 
MGR.ID MGRID, 
MGR.ENAME MGRNAME,
C.MODEL E_MODEL, 
CC.MODEL M_MODEL
FROM Employee EMP INNER JOIN Employee MGR ON EMP.MANAGER = MGR.ID 
LEFT JOIN COMPUTER C ON EMP.COMPID = C.COMPID 
LEFT JOIN COMPUTER CC ON MGR.COMPID = CC.COMPID WHERE CC.MODEL IS NOT NULL;

```

# ASSIGNEMENT 15

```
SELECT ENAME, VEHICLENAME FROM EMP E LEFT JOIN EMPVEHICLE EV ON E.EMPNO=EV.EMPNO LEFT JOIN VEHICLE V ON V.VEHICLEID=EV.VEHICLEID;
```

# ASSIGNEMENT 16

SELECT I.ITEMCODE, DESCR, NVL(TO_CHAR(QTYAVAILABLE), 'N.A.') QTYAVAILABLE FROM RETAILSTOCK R RIGHT JOIN ITEM I ON R.ITEMCODE= I.ITEMCODE AND ROID = 'R1001';

# ASSIGNEMENT 17

SELECT I.ITEMCODE, DESCR, CATEGORY, QUOTEDPRICE FROM ITEM I INNER JOIN QUOTATION Q ON I.ITEMCODE=Q.ITEMCODE WHERE QSTATUS = 'Accepted';

# ASSIGNEMENT 18

SELECT ITEMCODE, SNAME, SUM(QTYORDERED) TOTALQUANTITY FROM QUOTATION Q INNER JOIN ORDERS O ON Q.QUOTATIONID=O.QUOTATIONID GROUP BY SNAME, ITEMCODE HAVING SUM(QTYORDERED) >100;

# ASSIGNMENT 19

SELECT E2.EMPNAME, E2.DESIGNATION, E2.EMAILID FROM EMPDETAILS E1 INNER JOIN EMPDETAILS E2 ON E1.WORKSIN=E2.WORKSIN AND E1.EMPNAME='George' where E1.EMPID<>E2.EMPID;

# Ass 20

select C.Custid, C.Custname from Customer C Inner Join Customer cc On c.Address=CC.Address and C.Custid<>CC.Custid;

# ASS 21

Select I.ITEMCODE, DESCR, SNAME from ITEM I INNER JOIN Quotation Q ON I.ITEMCODE=Q.ITEMCODE;

<!-- SELECT E.ID ID,E.ENAME,M.ID MGRID,M.ENAME MGRNAME,EC.MODEL E_MODEL,MC.MODEL M_MODEL
FROM EMPLOYEE E INNER JOIN EMPLOYEE M ON E.MANAGER=M.ID
INNER JOIN COMPUTER EC ON E.COMPID=EC.COMPID
INNER JOIN COMPUTER MC ON M.COMPID=MC.COMPID

SELECT I.ITEMCODE ,I.DESCR, NVL(TO_CHAR(RT.QTYAVAILABLE),'N.A.') "QTYAVAILABLE" FROM ITEM I LEFT OUTER JOIN RETAILSTOCK RT ON I.ITEMCODE =RT.ITEMCODE AND RT.ROID='R1001'; -- asgn 16

SELECT E.ID ID,E.ENAME,M.ID MGRID,M.ENAME MGRNAME,EC.MODEL E_MODEL,MC.MODEL M_MODEL
FROM EMPLOYEE E INNER JOIN EMPLOYEE M ON E.MANAGER=M.ID
INNER JOIN COMPUTER EC ON E.COMPID=EC.COMPID
INNER JOIN COMPUTER MC ON M.COMPID=MC.COMPID   -- exer 18 -->

QUIZ = > 7
SELCT * FROM A FULL OUTER JOIN B ON A.P=B.X WHERE A.P IS NULL OR B.X IS NULL

Q8

Op 2
op 3
op 5 is correct

Op 1
A               B
X               X   Y
1               2   A

cp:  1 2 A
Fo:  1 Null
   null 2 A

Op 3
A               B
X               X   Y
1               1   A
                1   B

cp:  1 1 A
     1 1 B


Fo:  1 1 A
     1 1 B

A               B
X               X   Y
1               2   A
                3   B

When nothing match then output will be different
Cp : 1

Q14
A               B
P               Q
x               x
Null            x
x               Null

