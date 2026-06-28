/* 
Question 51: Write a Java program to implement Employee Management System with full CRUD operations.
Create a POJO class Employee with attributes empId, salary, and department.
Store records using array of objects.
Menu Operations:
1. Add Employee 2. Display All Employees 3. Search Employee by Id
4. Update Salary 5. Delete Employee 6. Find Highest Salary
7. Find Lowest Salary 8. Count by Department 9. Calculate Total Salary 10. Exit
Input / Output Example:

Enter Choice : 1
Enter Employee Id : 101 Salary : 45000 Department : IT
Output : Employee Added Successfully

Enter Choice : 3
Enter Employee Id to Search : 101
Output : Found => Id: 101 Salary: 45000 Department: IT

Enter Choice : 4
Enter Employee Id : 101
Enter New Salary : 55000
Output : Salary Updated Successfully

Enter Choice : 5
Enter Employee Id to Delete : 101
Output : Employee Deleted Successfully

Explanation:
This is a full CRUD (Create, Read, Update, Delete) + logical operations program.
Add (Create): creates Employee object, stores in array at index count, count++.
Display (Read): prints all active records from index 0 to count-1.
Search: loops array comparing getEmpId(). If found, prints details.
Update Salary: finds employee by id, calls setSalary(newSalary).
Delete: finds employee by id, shifts all elements left from that index. count--.
Highest/Lowest Salary: comparison loops through all employees.
Count by Department: loops and counts employees with matching department.
Total Salary: sums all getSalary() values.
This is a complete real-world employee management system in Java.

Asked In Companies:
Practice assignment

*/