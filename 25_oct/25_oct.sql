/* 1. insert new record in employees table with following details using prepared statement */
  
prepare insertstmt from 'insert into employees values(?,?,?,?,?,?,?,?,?,?,?)';
set @EmployeeId=999;
set @FIRST_NAME ='ROHAN';
set @LAST_NAME = 'SHAH';
set @EMAIL= 'rohanshah@mail.com';
set @PHONENUMBER= '230-987-111';
set @HireDate='2019-3-4';
set @JobId='IT_PROG';
set @SALARY =45000;
set @COMMISSION_PCT= 0.2;
set @MANAGER_ID =101;
set @DEPARTMENT_ID= 10;
execute insertstmt using  @EmployeeId, @First_Name, @Last_Name ,@Email, @PhoneNumber, @HireDate, @JobId, @salary, @Commission_Pct, @Manager_Id, @Department_Id;
select * from Employees where employee_id=999;



/* 2. delete a record from employees table for following employee_id using prepared statement
   EMPLOYEE_ID 101  */
   
prepare deletestmt from 'delete from employees where employee_id=?';
set @EmployeeId=101;
execute deletestmt using @EmployeeId;
select * from employees;


/* 3. Update employee email and phonenumber with following details using prepared statement
  EMAIL: official@yash.com
  PHONENUMBER: 789-778-221    */
  
prepare updatestmt from 'update employees set email=?, phone_number=? where employee_id=?';
set @Email='official@yash.com';
set @PhoneNumber='789-778-221';
set @EmployeeId=999;
execute updatestmt using @Email,@PhoneNumber,@EmployeeId;
select * from employees where employee_id=999;


/* 4. Create a table States with following columns,
   State_Id 
   State_Name
and following records,
   S001  Madhya Pradesh
   S002  Uttar Pradesh
using Replace function insert following entry into state table
    S001 MadhyaPradesh  */
    
create table States (State_Id varchar(40) primary key , State_Name varchar (40) not null);
insert into States values ('S001','Madhya Pradesh');
insert into States values ('S002','Utter Pradesh');
select * from States;
 replace into States  (State_Id, State_Name)
 values('S001','MadhyaPradesh');
 select * from States;
 
 
 /* 5. Create a table student with following columns,
   Student_roll_no
   Student_name
   fees
Update student fees using replace function   */

 create table student (student_roll_no int primary key, student_name varchar(40)not null, fees double);
 insert into student values(2001,'Akshay',20000);
 select * from student;
 replace into student (student_roll_no,student_name ,fees)
 values (2001,'Akshay',35000);
 select * from student;