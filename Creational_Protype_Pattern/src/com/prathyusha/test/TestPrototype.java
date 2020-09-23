package com.prathyusha.test;

import java.util.List;

import com.prathyusha.Employee;

public class TestPrototype  {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Employee emps = new Employee();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employee empsNew = (Employee) emps.clone();
		Employee empsNew1 = (Employee) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("Nuthana");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Teja");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}

		
	}


