package override;

public class Teacher extends Person {
int id;

@Override
void display() {
	System.out.println(name);
	System.out.println(age);
	System.out.println(id);
}
}
