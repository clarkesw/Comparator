/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.bookstore.comparator;

import java.util.*;

/**
 *
 * @author Clarke S.
 */
public class Comper {

    public static void main(String[] args) {
        Employee e1 = new Employee("John",25,3000.0,9922001);
        Employee e2 = new Employee("Ace", 22, 2000.0,5924001);
        Employee e3 = new Employee("Keith",35, 4000.0,3924401);
        
        List<Employee> employees = Arrays.asList(e1,e2,e3);
        Comparator<Employee> comp = Comparator.comparing(Employee::getSalary);
        
        Arrays.sort(employees, comp);
        
        for(Employee emp : employees){
            System.out.println(emp);
        }
        
    }
}
