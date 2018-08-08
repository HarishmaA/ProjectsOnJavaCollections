package lms;

import java.util.HashSet;
import java.util.Iterator;

public class RequestHandler {
	HashSet<AdaptiveU> collectionOfChallenges = new HashSet<>();

	// 1. ADD A CHALLENGE
	void addingChallenge(AdaptiveU adaptiveU) {
		collectionOfChallenges.add(adaptiveU);
		System.out.println(adaptiveU);
	}

	// 2.DISPLAY ALL ADDED CHALLENGES
	void displayAllAddedChallenges() {
		System.out.println();
		System.out.println(
				"IDENTIFICATION NAME\tNAME OF THE CHALLENGE\tTIME\tRATING\tCATEGORY\tVIDEO LINK\tTYPE\tSEEN\t");
		System.out.println();
		Iterator<AdaptiveU> iterator = collectionOfChallenges.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	// 3.DELETE ALL CHALLANGES
	void deleteAllAddedChallenges() {
		collectionOfChallenges.clear();
	}

	// 4.TO KNOW THE EARNED POINTS
	int addingPoints() {
		Iterator<AdaptiveU> iterator = collectionOfChallenges.iterator();
		while (iterator.hasNext()) {
			AdaptiveU challenge = iterator.next();
			if (challenge.getSeen() == true) {
				AdaptiveU.points += challenge.getTime();
			}
		}
		return AdaptiveU.points;
	}

	// 5.HAVE YOU COMPLETED ANY ADDED CHALLENGE? IF YES,
	void setTrueIfSeen(String identificationName) {
		Iterator<AdaptiveU> iterator = collectionOfChallenges.iterator();
		while (iterator.hasNext()) {
			AdaptiveU challenge = iterator.next();
			if (identificationName.equalsIgnoreCase(challenge.getIdentificationName())) {
				challenge.setSeen(true);
			}
		}

	}
}
