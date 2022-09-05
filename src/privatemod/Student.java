package privatemod;

public class Student {
	private String name;
	
	String getName() {
		return name ;
	}
	void setName(String name) {
		this.name=name;
	}



public static void main(String [] args) {
	Student s1=new Student();
	s1.setName("Jaber");
			System.out.println(s1.getName());
}
	}  
