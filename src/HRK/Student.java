package HRK;

public class Student {
	
	public String Name = "Harshitha";
			
public String getName()
{
		return Name;
}
public void setName(String Name) { this.Name = Name;
}

public static void main(String[] args)
{
	 Student student = new Student();
	 System.out.println(student.Name);
	 String Student1 = student.getName();
	 System.out.println(Student1);
	 student.setName("XYZ");
	 System.out.println(student.Name);
	 
}

}