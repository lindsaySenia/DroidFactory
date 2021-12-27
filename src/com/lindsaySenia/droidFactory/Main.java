package com.lindsaySenia.droidFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Droid r2 = new Droid("R2D2", "Astromech", "Starship repair/support");
        System.out.println(r2);
        r2.speak();
    }
}
