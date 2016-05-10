
public class MyEx1 {

	public static void main(String[] args) {
		
		Dog sharik1 = new Dog(15);
		Dog sharik2 = new Dog("sharik2",8);
		
//		sharik1.age=10;
//		sharik2.age=5;
		
		System.out.println(Calculator.CalculateSumm(sharik1.age,sharik2.age));
		
//		Dog.ShowDog(sharik1,sharik2);
//		
//		sharik1.name = "Lol1";
//		sharik2.name = "Lol2";
		
		Dog.ShowDog(sharik1,sharik2);
		
		sharik1.SetDog("noSharik", 11);
		
		Dog.ShowDog(sharik1);
		
		
	}

}
