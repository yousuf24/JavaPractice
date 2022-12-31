package hackerRank;

import java.lang.reflect.Method;
import java.util.*;

class Student{
	public int id;
	public String name;
	public String location;
	public int getId() {
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
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
public class Solution1 {

	public static void main(String[] args) {
		/*Class stud=new Student().getClass();//u can also use below
		Class student=Student.class;
//		System.out.println(stud);
//		System.out.println(student);
		
		Method[] methods_ame=stud.getMethods();//returns all methods including equals(), toString(), hashCode() etc.
		Method[] methods=student.getDeclaredMethods();//returns only methods that we declare
		Arrays.sort(methods, (x1,x2)->x1.getName().toString().compareTo(x2.getName().toString()));//how u sort array without use of list
		for(Method e:methods) {
			System.out.println(e.getName());
		}*/
		
		//@2
		 Class student = new Student().getClass();
         Method[] methods = student.getDeclaredMethods();

         ArrayList<Method> methodList = new ArrayList<>();
         for(Method method:methods){
             methodList.add(method);
         }
         Collections.sort(methodList,(x1,x2)->x1.getName().toString().compareTo(x2.getName().toString()));
         for(Method name: methodList){
             System.out.println(name.getName());
         }
		

	}

}
