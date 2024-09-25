/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package departmentjpa;

import model.EmployeeTable;
import model.Department;
import model.Employee;
import model.DepartmentTable;

/**
 *
 * @author DoubleX
 */
public class DepartmentJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Department dep1 = new Department(1, "IT");
        Department dep2 = new Department(2, "HR");
        DepartmentTable.insertDepartment(dep1);
        DepartmentTable.insertDepartment(dep2);
        
        Employee emp1 = new Employee(1, "John", "Network Admin", 56789, dep1);
        Employee emp2 = new Employee(2, "Marry", "HR Manager", 46789, dep2);
        Employee emp3 = new Employee(3, "Henry", "Programmer", 67890, dep1);
        Employee emp4 = new Employee(4, "Clark", "HR recruiter", 36789, dep2);
        EmployeeTable.insertEmployee(emp1);
        EmployeeTable.insertEmployee(emp2);
        EmployeeTable.insertEmployee(emp3);
        EmployeeTable.insertEmployee(emp4);
    }
    
}
