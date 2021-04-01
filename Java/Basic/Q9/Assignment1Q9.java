
class Student {
    private int subjectA,subjectB,subjectC;
    Student(){
    	
    }
    Student(int a, int b, int c){
    	subjectA = a;
    	subjectB = b;
    	subjectC = c;
    }
    

    public int studentsTotalMarksInAllSubjects(Student[] students) {
    	
    	
    	int stu1 = students[0].subjectA+students[0].subjectB+students[0].subjectC;
    	int stu2 = students[1].subjectA+students[1].subjectB+students[1].subjectC;
    	int stu3 = students[2].subjectA+students[2].subjectB+students[2].subjectC;
    	
		return stu1+stu2+stu3;
		}

    public double studentsAverageMarksInAllSubjects(Student[] students) {
    	int stu1 = students[0].subjectA+students[0].subjectB+students[0].subjectC;
    	int stu2 = students[1].subjectA+students[1].subjectB+students[1].subjectC;
    	int stu3 = students[2].subjectA+students[2].subjectB+students[2].subjectC;
		return (stu1+stu2+stu3)/3;
		}
    public int[] subjectWiseMarks(Student[] students,String subjectName) {
    	int subject = subjectA;
    	int[] subMarks =new int[3];
    	if(subjectName.equalsIgnoreCase("subjectA")) {
    		///subject = subjectA;
    		for(int i=0;i<3;i++) {
    			subMarks[i] = students[i].subjectA;
    		}
    	}else if(subjectName.equalsIgnoreCase("subjectB")) {
    		//subject = subjectB;
    		for(int i=0;i<3;i++) {
    			subMarks[i] = students[i].subjectB;
    		}
    	}else {
    		//subject = subjectC;
    		for(int i=0;i<3;i++) {
    			subMarks[i] = students[i].subjectC;
    		}
    	}
    	
		return subMarks;
		}
    public int subjectATotalByStudents(int[] marks) {
    	/*int subjectAT = marks[0]+marks[3]+marks[6];
		return subjectAT;*/
    	int tot = 0;
 	   for(int i=0;i<marks.length;i++) {
 		   tot+=marks[i];
 	   }
 	return tot;
		}
    public int subjectBTotalByStudents(int[] marks) {
    	/*int subjectBT = marks[1]+marks[4]+marks[7];
		return subjectBT;*/
    	int tot = 0;
 	   for(int i=0;i<marks.length;i++) {
 		   tot+=marks[i];
 	   }
 	return tot;
		}
    public int subjectCTotalByStudents(int[] marks) {
    	/*int subjectCT = marks[2]+marks[5]+marks[8];
		return subjectCT;*/
    	int tot = 0;
 	   for(int i=0;i<marks.length;i++) {
 		   tot+=marks[i];
 	   }
 	return tot;
		}

   public int subjectTotalByStudents(int[] marks) {
	   int tot = 0;
	   for(int i=0;i<marks.length;i++) {
		   tot+=marks[i];
	   }
	return tot;}
   public double subjectAverageByStudents(int[] marks) {
	   int tot = 0;
	   for(int i=0;i<marks.length;i++) {
		   tot+=marks[i];
	   }
	return tot/3;
   }

    public double subjectAAverageByStudents(int[] marks) {
    	int tot = 0;
 	   for(int i=0;i<marks.length;i++) {
 		   tot+=marks[i];
 	   }
 	return tot/3;
 	}
    public double subjectBAverageByStudents(int[] marks) {
    	int tot = 0;
 	   for(int i=0;i<marks.length;i++) {
 		   tot+=marks[i];
 	   }
 	return tot/3;
 	}
    public double subjectCAverageByStudents(int[] marks) {
    	int tot = 0;
 	   for(int i=0;i<marks.length;i++) {
 		   tot+=marks[i];
 	   }
 	return tot/3;
 	}

}


public class Assignment1Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		//this method will be managed during runtime in portal
		

	}

}
