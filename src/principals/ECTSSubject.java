package principals;

public class ECTSSubject extends Subject{
	
	public int ects;
	
	public ECTSSubject(String name, int ects) {
		super(name);
		this.ects = ects;
	}
	
	public int getEcts() {
		return ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}
	
	public String toString() {
		return name + " (value : " + ects+" ects)" ;
		
	}
	
}
