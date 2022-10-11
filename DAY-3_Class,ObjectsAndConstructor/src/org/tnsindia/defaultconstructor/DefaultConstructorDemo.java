package org.tnsindia.defaultconstructor;

	//class definition
class Car{
	private int speed;         //Variable
	void display() {           //Method
		System.out.println("The Speed is: "+speed+"km/hr");
		}
	
	Car(){					 //Default Constructor
		speed=50;
	}
}



public class DefaultConstructorDemo {

	public static void main(String[] args) {
		Car obj=new Car();      //Object Creation
		obj.display();          //Calling method of Car class
	}
}