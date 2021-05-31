class MyAnimal{
	String name;
	int age;
	String bark;
}

public class Animal {
	public static void main(String[] args) {
		
		MyAnimal Dog = new MyAnimal();
		Dog.name = "포비";
		Dog.age = 6;
		Dog.bark = "왕왕";
		
		MyAnimal Cat = new MyAnimal();
		Cat.name = "치즈";
		Cat.age = 2;
		Cat.bark = "애옹";
		
		MyAnimal Owl = new MyAnimal();
		Owl.name = "소울";
		Owl.age = 23;
		Owl.bark = "부엉";
		
		System.out.println("이름 : "+ Dog.name);
		System.out.println("나이 : "+ Dog.age);
		System.out.println(Dog.name+"! : "+ Dog.bark);
		System.out.println();
		
		System.out.println("이름 : "+ Cat.name);
		System.out.println("나이 : "+ Cat.age);
		System.out.println(Cat.name+"! : "+ Cat.bark);
		System.out.println();

		System.out.println("이름 : "+ Owl.name);
		System.out.println("나이 : "+ Owl.age);
		System.out.println(Owl.name+"! : "+ Owl.bark);
	}

}
