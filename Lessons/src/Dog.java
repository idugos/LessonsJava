
public class Dog {
	
	public String name;
	public int age;
	
	// Construct
	public Dog(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public Dog(int age)
	{
		this.age = age;
	}
	// Method
	public void SetDog(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("Changed age and name!");
	}
	public void SetDog(int age)
	{
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	public static void ShowDog(Dog... dogs)
	{
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}
	}
	
	
}
