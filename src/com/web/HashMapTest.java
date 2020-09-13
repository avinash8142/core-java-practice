package com.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String empId;
	private String empName;
	public Employee(String empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return empId+" "+empName;
	}
}
public class HashMapTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("emp.ser"));
		o.writeObject(new Employee("11", "asdf"));
		System.out.println("done");
		
		ObjectInputStream i = new ObjectInputStream(new FileInputStream("emp.ser"));
		Employee e=(Employee) i.readObject();
System.out.println(e);
	}

}
