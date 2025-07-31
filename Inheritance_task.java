package day16;

class Animals{
	void makeSound() {
		System.out.println("This animal makes a sound");
	}
}

class Dog1 extends Animals{
	void makeSound() {
		System.out.println("The Dog barks");
	}
}

class Cat extends Animals{
	void makeSound() {
		System.out.println("The cat meows");
	}
}


public class Inheritance_task {

	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		d1.makeSound();
		
		Cat c1 = new Cat();
		c1.makeSound();
		

	}

}
