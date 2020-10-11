package com.assignment;

public class Employee1 {
	
        int Id;
        String Name;
        int Age;
        long Salary;

        Employee1()           // Default Constructor
        {
            Id = 1;
            Name = "Kumar";
            Age = 29;
            Salary = 45000;
        }

        void PutData()
        {
            System.out.print("\n\tEmployee Id     : "+Id);
            System.out.print("\n\tEmployee Name   : "+Name);
            System.out.print("\n\tEmployee Age    : "+Age);
            System.out.print("\n\tEmployee Salary : "+Salary);
        }

        public static void main(String args[])
        {

            Employee1 E = new Employee1();// Creating Object

            E.PutData();          // Calling PutData()

        }
    }


