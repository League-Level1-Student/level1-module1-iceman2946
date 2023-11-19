package _07_duck;

public class BearRunner {
	public static void main (String [] args) {
		Bear bear= new Bear("YOU",20);
		System.out.println("Hi, my name is Bear and I have 20 friends and my favorite food is YOU! RUN if you can");
		bear.huff();
		bear.roar();
		
	}
}
