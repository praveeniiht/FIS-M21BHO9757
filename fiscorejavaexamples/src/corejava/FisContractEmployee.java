package corejava;

public class FisContractEmployee extends FisEmployee{
	int contractPeriod;
	public void calSalary() {
		System.out.println("Contract salary is calcualted...");
	}
	public void showContractPeriod() {
		System.out.println("The Contract period is: "+contractPeriod);
	}

}
