/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departmentjpa;

import java.util.List;
import model.Department;
import model.DepartmentTable;
import model.Employee;
import model.EmployeeTable;

/**
 *
 * @author DoubleX
 */
public class DepartmentDisplay {
    public static void main(String[] args) {
        System.out.println("All employee (by ID)");
        System.out.println("--------------------");
        List<Employee> empList = EmployeeTable.findAllEmployee();
        
        for(Employee emp : empList) {            
            System.out.println("ID: " + emp.getEmployeeid());
            System.out.println("Name: " + emp.getName());
            System.out.println("Job: " + emp.getJob());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Dapartment: " + emp.getDepartmentid().getName());
            System.out.println("--------------------");
        }
        
        System.out.println("All employee (by Department)");
        System.out.println("--------------------");
        List<Department> depList = DepartmentTable.findAllDepartment();
        
        for(Department dep : depList) {    
            System.out.print("Department ID: " + dep.getDepartmentid());
            System.out.println(" Department Name: " + dep.getName());
            System.out.println("--------------------");
            
            for(Employee emp : dep.getEmployeeCollection()) {  
                System.out.println("ID: " + emp.getEmployeeid());
                System.out.println("Name: " + emp.getName());
                System.out.println("Job: " + emp.getJob());
                System.out.println("Salary: " + emp.getSalary());
                System.out.println("Dapartment: " + emp.getDepartmentid().getName());
                System.out.println("--------------------");
            }
        }
    }
}
