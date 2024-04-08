package OOPS.objectAndClass;

public class Demo {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.breed = "Mudhol";
		d1.color = "Brown";
		d1.name = "Soosi";
		
		d1.barking();
		d1.eating();
		d1.sleeping();
		d1.walking();
		d1.running();
		
		Dog d2 = new Dog();
		d2.breed = "Doberman";
		d2.name = "Jockey";
		d2.color = "Black";
		
		d2.barking();
		d2.eating();
		d2.sleeping();
		d2.walking();
		d2.running();
		
		Dog d3 = new Dog();
		d3.breed = "Kaat";
		d3.color = "Grey";
		d3.name = "Kooru";
		
		d3.barking();
		d3.eating();
		d3.sleeping();
		d3.walking();
		d3.running();
		
		
	}

}
