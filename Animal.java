class MyAnimal{
	String name;
	int age;
	String bark;
}

public class Animal {
	public static void main(String[] args) {
		
		MyAnimal Dog = new MyAnimal();
		Dog.name = "����";
		Dog.age = 6;
		Dog.bark = "�տ�";
		
		MyAnimal Cat = new MyAnimal();
		Cat.name = "ġ��";
		Cat.age = 2;
		Cat.bark = "�ֿ�";
		
		MyAnimal Owl = new MyAnimal();
		Owl.name = "�ҿ�";
		Owl.age = 23;
		Owl.bark = "�ξ�";
		
		System.out.println("�̸� : "+ Dog.name);
		System.out.println("���� : "+ Dog.age);
		System.out.println(Dog.name+"! : "+ Dog.bark);
		System.out.println();
		
		System.out.println("�̸� : "+ Cat.name);
		System.out.println("���� : "+ Cat.age);
		System.out.println(Cat.name+"! : "+ Cat.bark);
		System.out.println();

		System.out.println("�̸� : "+ Owl.name);
		System.out.println("���� : "+ Owl.age);
		System.out.println(Owl.name+"! : "+ Owl.bark);
	}

}
