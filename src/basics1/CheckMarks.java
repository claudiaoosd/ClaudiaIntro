// Grade Students

package basics1;

public class CheckMarks {

	public static void main(String[] args) {
	gradeStudent(96);
	}

	public static void gradeStudent(int score) {
		
// if score <50 print Failed
if (score < 50) {
	System.out.println("Grade unacceptable");
	}

	else if 
// if score >=50 && <70 print D
	(score >= 50 &&  score <70) {System.out.println("Grade D");
	  }
//if score >= 70 && <80 print (C)
	else if (score >= 70 && score <80) {
	 System.out.println("Grade C");
	} 
	 else if 
		
// if score >= 80 && < 90 print B
		 ( score >= 80 && score<90) {System.out.println("Grade B");
	}

	else
// if score >= 90 && <  print A
 	{System.out.println("Grade A");
	}
	
	}
}
	
	


	
	