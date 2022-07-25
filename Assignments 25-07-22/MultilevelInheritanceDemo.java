// Program to have a better understanding of multilevel inheritance
// In multilevel inheritance there is a grandparent class, parent class and child class.
// A child class can access all the information from the parent class as well as the grandparent class.
package oopsdemo;
class Animal //grandparent class
{ 
	public void display()
	{
		System.out.println("Animal Kingdom.");
	}
}
class Mammal extends Animal{ //parent class
	public void birth()
	{
		System.out.println("Mammal gives birth to offsprings.");
	}
}
class Dog extends Mammal //child class
{
	public void puppy() {
		System.out.println("Dog's offsprings are called puppies.");
	}
	
}

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.display();
		d.birth();
		d.puppy();

	}

}
