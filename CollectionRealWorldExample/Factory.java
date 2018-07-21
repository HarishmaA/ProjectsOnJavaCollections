package CollectionRealWorldExample;

import java.util.ArrayList;
//import java.util.Scanner;

public class Factory {
	ArrayList<Bike> arrayList = new ArrayList<>();

	ArrayList<Bike> order(int items, String BikeName) {

		for (int i = 0; i < items; i++) {
			arrayList.add(new Bike(BikeName, 80.6, 97.2, 5));
		}
		return arrayList;
	}
}
