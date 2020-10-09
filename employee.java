package com.assignment;

public class employee {
	String Name;
	int Age;
	String City;
	
	void display(String Name,int Age,String City) {
		System.out.println("The name is "+Name);
		System.out.println("The Age is "+Age);
		System.out.println("The city is "+City);

	}

	public static void main(String[] args) {

		employee obj =new employee();
		obj.display("Pooja", 21,"Pune");
	}

}
