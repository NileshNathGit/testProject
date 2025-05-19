package KPcoding;


public class arrayofobjects

{	
		public static void main(String[] args) {
			
			
			Student s1 = new Student();
			s1.roll=23;
			s1.num = "Samsung";
			s1.name = "smart";
			
			Student s2 = new Student();
			s2.roll=23;
			s2.num = "Samsung";
			s2.name = "smart";
			
			Student s4 = new Student();
			s4.roll=236;
			s4.num = "Samsung";
			s4.name = "smart";
			
			Student students[] = new Student[3];
			students[0]= s1;
			students[1]= s2;
			students[2]= s4;
//			for(int i=0;i<students.length;i++)
//			{
//				
//				System.out.println(students[i].roll);
//			
//			}
//			
			
			for(Student s : students)
			{
				System.out.println(s.name+ " , "+s.roll); 
			}
			
		}
}

