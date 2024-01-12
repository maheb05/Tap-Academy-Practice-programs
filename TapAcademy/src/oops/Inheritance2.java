package oops;

import java.util.Scanner;

public class Inheritance2 {
	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		
		School s = new School();
		College c = new College();
		University u = new University();
		
		s.studentAdmisson();
		s.conductExam();
		s.conductFieldTrip();
		System.out.println();
		
		s.studentAdmisson();
		c.conductExam();
		c.conductInternship();
		System.out.println();
		
		u.studentAdmisson();
		u.conductExam();
		u.ConductsResearch();
		
		
		
	
		
	}

}

class Institute{
	void studentAdmisson() {
		System.out.println("Student Admission Done ");
	}
	void conductExam() {
		System.out.println("Conduct Exam ");
	}
}

class School extends Institute{
	void conductExam() {
		System.out.println("Unit Test,Quarterly,Halfyearly,Annually");
	}
	void conductFieldTrip() {
		System.out.println("Students are taken to Trips in schoools by staff for Awarness ");
	}
}
class College extends Institute{
	void conductExam() {
		System.out.println("Mids,Labs,Semister ");
	}
	public void conductInternship() {
		// TODO Auto-generated method stub
		
	}
	void ConductsInternships() {
		System.out.println("Internships are conducted in college to enhance the skils of students ");
	}
}
class University extends Institute{
	void conductExam() {
		System.out.println("Only FinalExams ");
	}
	void ConductsResearch() {
		System.out.println("Researches are conducted in universities to enhance the skils of students ");
	}
}

