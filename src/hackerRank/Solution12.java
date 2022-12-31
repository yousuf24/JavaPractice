package hackerRank;
import java.util.*;

class Student1 implements Comparable<Student1>{
	private int id;
    private String name;
    private double cgpa;
    Student1(int id,String name,double cgpa){
        this.id=id;this.name=name;this.cgpa=cgpa;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getCGPA(){
        return this.cgpa;
    }
	@Override
	public int compareTo(Student1 o) {
		
		if(cgpa==o.cgpa) {
			if(name.equals(o.name)) {
				if(id==o.id)return 0;
				else if(id>o.id)return 1;
				else return -1;
			}else {
				return name.compareTo(o.name);
			}
		}else if(cgpa>o.cgpa)return -1;
		else return 1;
		
		
		
	}
}

class Priorities{
	ArrayList<Student1> getStudents(List<String> events){
        PriorityQueue<Student1> pq=new PriorityQueue<Student1>();int len=events.size();
        
        for(int i=0;i<len;i++){
            String[] arr=events.get(i).split(" ");
            
            if(arr.length>1){
            	
                int id=Integer.parseInt(arr[3]);
                String name=arr[1];
                double cgpa=Double.parseDouble(arr[2]);
                Student1 s=new Student1(id, name, cgpa);
                
                pq.add(s);
            }
            else {
                pq.poll();
            }
        }
        while(pq.size()>1) {
        	System.out.println(pq.poll().getName());
        }
        
        
        return new ArrayList<Student1>(pq);
    }
}
public class Solution12 {
	private static final Priorities p=new Priorities();
	private static final Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		int totalEvents=s.nextInt();
		List<String> events=new ArrayList<>();
		
		while(totalEvents-- !=0) {
			events.add(s.nextLine());
		}
		
		List<Student1> li=p.getStudents(events);
		if(li.isEmpty())System.out.println("EMPTY");
		else {
			for(Student1 each:li) {
				System.out.println(each.getName());
			}
		}
		

	}

}
