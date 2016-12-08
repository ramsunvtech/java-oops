package com.java.oops;

import com.java.oops.Interface.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Employee employee = new Employee();

    public static void main( String[] args )
    {
        System.out.println(employee.chooseDB());
        System.out.println(employee.selectQuery());
        System.out.println( "Hello World!" );
    }
}
