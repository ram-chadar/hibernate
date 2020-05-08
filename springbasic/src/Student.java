
public class Student {
int id;
String name;
Student(int i,String s)
{
	this.id=i;
	this.name=s;
}

/*public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}*/
void show()
{
	System.out.println(id);
	System.out.println(name);
}
}
