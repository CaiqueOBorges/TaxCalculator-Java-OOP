package entities;

public class LegalAccount extends Account{

	public int employeeNum;
	
	public LegalAccount() {
	}
	
	public LegalAccount(String name, double anualIncome, int employeeNum) {
		super(name, anualIncome);
		this.employeeNum = employeeNum;
	}




	@Override
	public double tax() {
		if (employeeNum >= 10) {
			return anualIncome * 0.14;
		}
		return anualIncome * 0.16;
	}
	
	
	
	
}
