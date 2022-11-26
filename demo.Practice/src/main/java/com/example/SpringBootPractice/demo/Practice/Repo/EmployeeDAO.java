package com.example.SpringBootPractice.demo.Practice.Repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.SpringBootPractice.demo.Practice.Entity.Employee;

@Repository
public class EmployeeDAO {

	public static List<Employee> list = new ArrayList<Employee>();

	static {

		try {
			list.add(new Employee(1, "Prem", "Tiwari", "chapradreams@gmail.com"));

			list.add(new Employee(2, "Vikash", "Kumar", "abc@gmail.com"));

			list.add(new Employee(3, "Ritesh", "Ojha", "asdjf@gmail.com"));

			list.add(new Employee(4, "Anand", "Sharma", "anandsharma@gmail.com"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public List<Employee> getAllEmployee() {
		
		return list;
	}

}
