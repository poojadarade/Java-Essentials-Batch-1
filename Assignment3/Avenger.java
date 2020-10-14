package com.assignment;   

public class Avenger {    

	 String name; 
	 int age;  
	 String power;
	 String weapon; 
	 String planet; 
	
	  public void getDetails(String name,int age,String power,String weapon,String planet){
        this.name=name;
        this.age=age;
        this.power=power;
        this.weapon=weapon;
        this.planet=planet;
        
	  }
	  
	  public void displayDetails() {
		   System.out.println("Name = "+name );
           System.out.println("Age=  "+age );
           System.out.println("Power= "+power);
           System.out.println("Weapon = "+weapon);
           System.out.println("Planet = "+planet);
        }
	  
	  public static void main(String[] args){
		  Avenger[] obj = new Avenger[1] ;
	    obj[0] = new Avenger();
	    obj[0].getDetails("Iron Man", 48,"Superhuman strength", "Repulsor Rays", "Planet C-53");
	    obj[0].displayDetails();
	  }

	}
     
    

	


	
	
