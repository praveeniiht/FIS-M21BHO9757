package corejava;

interface RBI{
	final int savingsInterestRate=4;
	int homeLoanRate=6;
	void savings();
	void deposits();
	void loans();
}

class HDFC implements RBI{

	@Override
	public void savings() {
		// TODO Auto-generated method stub
		
		System.out.println("HDFC Allows savings account for non employees also");
		
	}

	@Override
	public void deposits() {
		// TODO Auto-generated method stub
		System.out.println("HDFC Allows min 5000/- as deposit ");
	}

	@Override
	public void loans() {
		// TODO Auto-generated method stub
		System.out.println("HDFC provides Home, Personal and Education Loans");
		
	}
	
	public void charity() {
		System.out.println("HDFC spends a min of 1% of profit is given to chartity");
	}
	
}

class SBI implements RBI{

	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("SBI Allows savings account for non employees and farmers also");
		
	}

	@Override
	public void deposits() {
		// TODO Auto-generated method stub
		System.out.println("SBI Allows min 0/- as deposit ");
	}

	@Override
	public void loans() {
		// TODO Auto-generated method stub
		System.out.println("SBI provides Home, Personal, Agriculture,Mortage and  Education Loans");
		
	}
	
}



public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC hdfc = new HDFC();
		hdfc.savings();
		hdfc.deposits();
		hdfc.loans();
		hdfc.charity();
		
		SBI sbi = new SBI();
		sbi.savings();
		sbi.deposits();
		sbi.loans();
	

	}

}
