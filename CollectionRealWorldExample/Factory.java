package CollectionRealWorldExample1;

import java.util.HashMap;
import java.util.ArrayList;

public class Factory {

	HashMap<String, Bike> h = new HashMap<>();

	public Factory() {
		h.put("royal enfield", new Bike("Royal Enfield", 95.6, 80.2, 6));
		h.put("yamaha", new Bike("Yamaha", 70.6, 95.2, 3));
		h.put("dio", new Bike("Dio", 80.6, 97.2, 5));
		h.put("honda", new Bike("Honda", 90.0, 97.6, 4));
	}

	ArrayList<Bike> arrayList = new ArrayList<>();

	ArrayList<Bike> order(String BikeName, int items) {
		if (h.containsKey(BikeName.toLowerCase())) {
			for (int i = 0; i < items; i++) {
				arrayList.add(h.get(BikeName));
			}
		}
		return arrayList;
	}
}