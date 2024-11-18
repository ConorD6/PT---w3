package W3schools;

public class W3schools {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("I am learning Java.");
		System.out.println("It is awesome!");
		System.out.println(3);
		System.out.println(358);
		System.out.println(50000);
		System.out.println(3 +3);
		System.out.println(2 * 5);
		// This is a comment
		System.out.println("Hello World");
		System.out.println("Hello World"); // This is also a comment
		/* The code below will print the words Hello World
		 * to the screen, and it is amazing */
		System.out.println("Hello World");
		String name = "John";
		System.out.println(name);
		int myNum = 15;
		myNum = 20; // myNum is now 20
		System.out.println(myNum);
		System.out.println("Hello " + name);
		String firstName = "Conor ";
		String lastName = "Dilley";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		int x = 5, y = 6, z = 50;
		System.out.println(x + y); // Print the value of x + y
		System.out.println(x + y + z);
		//Student Data
		String studentName = "John Doe";
		int studentID = 15;
		int studentAge = 23;
		double studentFee = 75.25;
		char studentGrade = 'B';
		//Print variables
		System.out.println("Student Name: " + studentName);
		System.out.println("Student id: " + studentID);
		System.out.println("Student age: " + studentAge);
		System.out.println("Student fee: " + studentFee);
		System.out.println("Student grade: " + studentGrade);
		
		//Create integer variables
		int length = 4;
		int width = 6;
		int area;
		
		area = length * width;
		
		System.out.println("Length is: " + length);
		System.out.println("Width is: " + width);
		System.out.println("Area of the rectangle is: " + area);
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);
		
		char myGrade = 'A';
		System.out.println(myGrade);
		
		char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3);
		
		String greeting = "What's up Nuzboy!";
		System.out.println(greeting);
		
		//Create variables of different data types
		int items = 50;
		double costPerItem = 9.99;
		double totalCost = items *costPerItem; 
		char currency = '$';
		
		//Print variables
		System.out.println("Number of items: " + items);
		System.out.println("Cost per item: " + currency + costPerItem);
		System.out.println("Total Cost = " + currency + totalCost);
		
		double myDouble = 9.78;
		int myInt = (int) myDouble;
		
		System.out.println(myDouble);
		System.out.println(myInt);
		
		//Set the maximum possible score in the game to 500
		int maxScore = 500;
		//The actual score of the user
		int userScore = 423;
		/*Calculate the percentage of the user's score in relation to the maximum available score.
		 * Convert userSCore to the double to make sure that the division is accurate
		 */
		double percentage = (double) userScore / maxScore * 100.0;
		System.out.println("User's percentage is " + percentage);
		
		double myBubble = 5.99;
		int myTint = (int) myBubble;
		System.out.println(myTint);
		
		int a = 100 + 50;
		System.out.println(a);
		int sum1 = 100 +50;
		int sum2 = sum1 + 250;
		int sum3 = sum1 + sum2;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
		int b = 10;
		b += 5;
		System.out.println(b);
		int c =657;
		c += 101;
		System.out.println(c);
		
		int d = 5;
		int e = 3;
		System.out.println(d > e);
		
		String txt = "lkjasdfjkhasdfkjhasdfk;ljhsdf";
		System.out.println(txt.length());
		String wordz = "Hey whats up my guy";
		System.out.println(wordz.length());
		
		String text = "Make me bigger";
		System.out.println(text.toUpperCase());
		String tiny = "Make me smaller";
		System.out.println(tiny.toLowerCase());
		
		String location = "Please locate where 'location' occurs!";
		System.out.println(location.indexOf("location"));
		String locationz = "Please 'locationz' where I word stuff good!";
		System.out.println(locationz.indexOf("locationz"));
		
		String firstDog = "Pepper ";
		String lastDog = "Dilley";
		System.out.println(firstDog.concat(lastDog));
		
		String Vik = "We are the so called \"Vikings\" from the North";
		System.out.println(Vik);
		
		String nik = "We are nick\'s";
		System.out.println(nik);
		
		String kik = "We are called \\ the mob.";
		System.out.println(kik);
		
		System.out.println(Math.max(20,31));
		System.out.println(Math.min(20,31));
		System.out.println(Math.sqrt(144));
		System.out.println(Math.abs(-15.19));
		System.out.println(Math.random());
		int randomNum = (int)(Math.random() * 101);
		System.out.println(randomNum);
		
		boolean isCodingFun = true;
		boolean isCleaningFun = false;
		System.out.println(isCodingFun);
		System.out.println(isCleaningFun);
		
		int f = 10;
		int g = 9;
		System.out.println(f > g);
		System.out.println(10 > 9);
		System.out.println(f == 10);
		System.out.println(15 == 10);
		
		int myAge = 32;
		int votingAge = 18;
		System.out.println(myAge >= votingAge);
		if (myAge >= votingAge) {
			System.out.println("I'm an old fart who can vote.");
		} else { 
			System.out.println("I'm a little yougen who can't vote.");
		}
		if (20 > 18) {
			System.out.println("20 is greater than 18");
		int h = 20;
		int i = 18;
		if (h > i) {
			System.out.println("h is great than i");
		}
		int time = 20;
		if (time < 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}
		if (time < 10) {
			System.out.println("Good morning.");
		} else if (time > 15) {
			System.out.println("Good afternoon.");
		} else {
			System.out.println("Good evening.");
		}
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		}
		int doorCode = 1337;
		if (doorCode == 1337) {
			System.out.println("Correct code. The door is now open.");
		} else {
			System.out.println("Wrong Code. The door remains close.");
		}
		int myDum = 10;
		if (myDum > 0) {
			System.out.println("The value is a positive number");
		}else if (myDum < 0) {
			System.out.println("The value is a negative number.");
		}else {
			System.out.println("The value is 0.");
		}
		int myCum = 5;
		if (myCum % 2 == 0) {
			System.out.println(myCum + " is even");
		} else {
			System.out.println(myCum + " is odd");
		}
		int day = 8;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
		case 6:
			System.out.println("Saturday");
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Looking forward to the weekend");
		}
		int j = 0;
		while (j < 5) {
			System.out.println(j);
			j++;
		}
		int k = 0;
		do {
			System.out.println(k);
			k++;
		}
		while (k > 5);
		
		int countDown = 3;
		
		while (countDown > 0) {
			System.out.println(countDown);
			countDown--;
		}
		System.out.println("Happy New Year!!");
		
		int dice = 1;
		while (dice <= 6) {
			if (dice < 6) {
			System.out.println("No Yatzy.");
		} else {
			System.out.println("Yatzy!");
		}
			dice = dice + 1;
		}
		for (int l = 0; l < 5; l++) {
			System.out.println(l);
		}
		for (int m = 0; m <= 10; m = m + 2) {
			System.out.println(m);
		}
		for (int n = 1; n <= 2; n++) {
			System.out.println("Outer: " + n); // Executes 2 times
			// Inner Loop
			for (int o = 1; o <= 3; o++) {
				System.out.println(" Inner: " + o); //Executes 6 times (2 * 3)
			}
		}
		for (int p = 1; p <= 2; p++) {
			for (int q = 1; q <= 3; q++) {
				System.out.println(p + "," + q + " ");
			}
		}
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String r : cars) {
			System.out.println(r);
		}
		for (int s = 0; s <= 100; s += 10) {
			System.out.println(s);
		}
		for (int t = 0; t <= 10; t += 2) {
			System.out.println(t);
		}
		int number = 2;
		// Print the multiplication table for the number 2
		for (int u = 1; u <= 10; u++) {
			System.out.println(number + " x " + u + " = " + (number * u));
		}
	}

}
