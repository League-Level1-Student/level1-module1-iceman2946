package _03_cat;

public class CatRunner {
	public static void main(String [] args) {
		Cat cat= new Cat("Ruby");
		cat.printName();
		cat.meow();
		for(int i=9; i<1; i--) {
			cat.kill();
		}
		}
		
	}

