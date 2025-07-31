package day16;

class Animal{
	void display() {
		System.out.println("I am Animal class");
	}
}

class dog extends Animal{
	void display() {
		System.out.println("I am Dog class");
	}
}
public class PolymorphismEx {

	public static void main(String[] args) {
		dog d1 = new dog();
		d1.display();

	}

}
