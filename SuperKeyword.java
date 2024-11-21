package javaLab;

// super.meth()
// super.attr
// super()

public class SuperKeyword {

	public static void main(String[] args) {
		CSExam student = new CSExam(141, 70, 25);

		System.out.println(student.marks);

	}
}

class Exam {
	public static final int totalMarks = 100;

	int roll, marks;

	Exam(int roll, int marks) {
		this.roll = roll;
		this.marks = marks;
	}
}

class CSExam extends Exam {

	CSExam(int roll, int theory, int practicals) {
		super(roll, theory + practicals);
	}
}