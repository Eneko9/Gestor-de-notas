package principals;

public class Calificator {
	
	String name;
	int percentage;
	CalificatorTypes type;
	
	public Calificator(String name, int percent, CalificatorTypes type) {
		this.name = name;
		this.percentage = percent;
		this.type = type;
	}

	public CalificatorTypes getType() {
		return type;
	}

	public void setType(CalificatorTypes type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percent) {
		this.percentage = percent;
	}
	
	
}
