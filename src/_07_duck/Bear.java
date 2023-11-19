package _07_duck;

public class Bear {
	String favoriteFood;
	int numberofFriends;
	Bear(String favoriteFood, int numberofFriends) {
		this.favoriteFood= favoriteFood;
		this.numberofFriends= numberofFriends;
	}
	
	
	void roar () {
		System.out.println("ROOOOOOOAR!!!!!!!!!");
	}
	void huff () {
		System.out.println("Haaaaaaaaaa");
	}
	void run () {
		System.out.println("RUNNNN!"));
	}

}
