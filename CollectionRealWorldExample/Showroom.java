package CollectionRealWorldExample;

import java.util.ArrayList;
import java.util.Scanner;

public class Showroom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("If u want the factory to produce bikes.. type \"yes\" else \"no\"");
			char response = sc.nextLine().charAt(0);
			if (response == 'y' || response == 'Y') {
				System.out.println("How many number of bikes you want to produce?");
				int items = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the bike name you want to produce..");
				String bikeName = sc.nextLine();
				Factory bike = new Factory();
				ArrayList<Bike> arrayListOfBikes = bike.order(items, bikeName);
				System.out.println(arrayListOfBikes.toString());

			} else
				break;
		}
		sc.close();
	}
}
