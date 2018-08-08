package lms;

public class AdaptiveU {
	private String identificationName;
	private String nameOfTheChallenge;
	private int time;
	private double rating;
	private String category;
	private String videoLink;
	private String type;
	private boolean seen;

	// Constructor
	public AdaptiveU(String identificationName, String nameOfTheChallenge, int time, double rating, String category,
			String videoLink, String type, boolean seen) {
		this.identificationName = identificationName;
		this.nameOfTheChallenge = nameOfTheChallenge;
		this.time = time;
		this.rating = rating;
		this.category = category;
		this.videoLink = videoLink;
		this.type = type;
		this.seen = seen;
	}

	String getIdentificationName() {
		return this.identificationName;
	}

	int getTime() {
		return this.time;
	}

	boolean getSeen() {
		return this.seen;
	}

	void setSeen(boolean seen) {
		this.seen = seen;
	}

	@Override
	public String toString() {
		return "\t" + identificationName + "\t" + nameOfTheChallenge + "\t" + time + "\t" + rating + "\t" + rating
				+ "\t" + category + "\t" + videoLink + "\t" + type + "\t" + "seen";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (!(obj instanceof AdaptiveU))
			return false;
		
		if (!this.identificationName.equals(((AdaptiveU) obj).identificationName)) {
			return false;
		}
		if (!this.nameOfTheChallenge.equals(((AdaptiveU) obj).nameOfTheChallenge)) {
			return false;
		}
		if (!(this.time == ((AdaptiveU) obj).time)) {
			return false;
		}
		if (obj == this)
			return true;
		return true;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode value is " + Integer.valueOf(identificationName.charAt(0)));
		return Integer.valueOf(identificationName.charAt(0));
	}
}
