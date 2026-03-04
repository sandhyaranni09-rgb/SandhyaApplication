package practiseBasicPrograms;

//This is for the individual performance evaluation of  employees

public class ElseIf {

	public void performanceEvaluation(int noofprojects, int certifications) {

		if (noofprojects >= 5 && certifications <= 10) {
			System.out.println("Outstanding Performer:" + " " + "A+");

		} else if (noofprojects >= 3 && certifications <= 5) {
			System.out.println("Meets Expectations:" + " " + "B+");

		}

		else {

			System.out.println("Needs Improvements:" + " " + "C");

		}
	}

	public static void main (String [] args) {
		
		ElseIf Perf = new ElseIf();
		Perf.performanceEvaluation(4, 4);
	}
}
