package com.java.oops;

import com.java.oops.Interface.Employee;
import com.java.oops.Abstract.Log;

/**
 * Hello world!
 *
 */
public class App
{
    public static Employee employee = new Employee();

    public static void main( String[] args )
    {
        Log log = new Log();
        Log.sys( employee.chooseDB() );
        Log.sys( employee.selectQuery() );
        Log.sys( "Hello World!" );
    }
}
