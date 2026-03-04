package testPractise;

public class ApprovalLimit {

	static int approverALimit = 100;
	static int approverBLimit = 100;
	int day = 1;

	boolean approverA = false;
	boolean approverB = false;

	// Approver A case
	public void approvalProcess(int transaction) {
		if (!approverA && transaction <= approverALimit) {

			approverALimit = approverALimit - transaction;

			System.out.println("Approved by A");
			approverA = true;

			System.out.println("Remaining Limit Available : $" + ApprovalLimit.approverALimit);

		} else {

			System.out.println("Approver A Approval Limit Exhausted. Waiting for reset...");

		}

		// Approver B case
		if (!approverB && transaction <= approverBLimit) {

			approverBLimit = approverBLimit - transaction;
			approverB = true;

			System.out.println("Approved by B");
			System.out.println("Remaining Limit Available :$" + approverBLimit);

		} else {

			System.out.println("Approver A Approval Limit Exhausted");
		}

		if (!(approverA && approverB)) {
			day++;
			resetlimits();

		}

		System.out.println("Transaction completed on day= " + day);
	}

	public void resetlimits() {
		
		approverALimit = 100;
		approverBLimit= 100;
		System.out.println("Reset completed"+ "Available Limit for A & B =" + approverALimit +  "," + approverBLimit );

	}

	public static void main (String[] args) {
		
		ApprovalLimit AP = new ApprovalLimit();
		AP.approvalProcess(20);
	}
}
