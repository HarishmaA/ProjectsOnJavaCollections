package CollectionRealWorldExample1;

import java.util.HashMap;
import java.util.ArrayList;

public class Factory {

	HashMap<String, Bike> bikesProduced = new HashMap<>();

	public Factory() {
		bikesProduced.put("royal enfield", new Bike("Royal Enfield", 95.6, 80.2, 6));
		bikesProduced.put("yamaha", new Bike("Yamaha", 70.6, 95.2, 3));
		bikesProduced.put("dio", new Bike("Dio", 80.6, 97.2, 5));
		bikesProduced.put("honda", new Bike("Honda", 90.0, 97.6, 4));
	}

	ArrayList<Bike> arrayList = new ArrayList<>();

	ArrayList<Bike> order(String bikeName, int items) {
		if (bikesProduced.containsKey(bikeName.toLowerCase())) {
			for (int i = 0; i < items; i++) {
				arrayList.add(bikesProduced.get(bikeName));
			}
		}
		return arrayList;
	}
}
