package com;

public class TestInher {
public static void main(String[] args) {
	person p1 = new person();
	p1.name="Alex";
	
	p1.updateName();
	System.out.println("------------------------");
	emp e1 = new emp();
	e1.id=100;
	e1.name= "bruce";
	e1.salary=35000;
	e1.updateName();
	e1.updateSalary();
	
			
	
}
}
