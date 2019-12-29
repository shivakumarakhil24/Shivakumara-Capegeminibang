class Animal
{
	void sound()
	{
		System.out.println("welcome");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("meow meow");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("bow bow");
	}
}
class Cow extends Animal
{
	void sound()
	{
		System.out.println("ambaaaa");
	}
}
class Sheep extends Animal
{
	void sound()
	{
		System.out.println("bee bee");
	}
}
class Machine
{
	void recieve(Animal a)
	{
		a.sound();
	}
}
class MainAnimal
{
	public static void main(String[] args) {
		Cat ct=new Cat();
		Cow cw=new Cow();
		Dog dg=new Dog();
		Sheep sp=new Sheep();
		Machine m=new Machine();
		m.recieve(dg);
	}
}