package newproject;

public class Newproject {

    public static void main(String[] args) {
        
        Details obj = new Details();  
        obj.student();
        obj.course();
        //This is overloading 
        Student s1=new Student();
        s1.setData("RAZZAQ", 60,"RAZZAQ123789@gamil.com");
        s1.display();
        s1.setData("RABDULLAHR", 90, "kb337137@gmail.com");
        s1.display();
        
        
    }

}
 class Student {
	
	String name;
	int age;
	String email;
	
	public void setData(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void setData(String name,int age, String email)
	{
		this.name=name;
		this.age=age;
		this.email=email;
	}
	
	public void display()
	{
		System.out.println("STUDENT NAME :" +name);
		System.out.println("STUDENT AGE  :" +age);
		System.out.println("STUDENT EMAIL:" +email);
	}
	

}