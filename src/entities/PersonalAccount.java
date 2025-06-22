package entities;

public class PersonalAccount extends Account {
	public double healthCost;


	public PersonalAccount(String name, double anualIncome, double healthCost) {
		super(name, anualIncome);
		this.healthCost = healthCost;
	}


	@Override
	public double tax() {
		if (healthCost > 0 && anualIncome < 20000) {
			return anualIncome * 0.15 - (healthCost / 2);
		}
		else if (healthCost > 0 && anualIncome > 20000) {
			return anualIncome * 0.25 - (healthCost / 2);
		}
		else if (anualIncome > 20000) {
			return anualIncome * 0.25;
		}
		else {
			return anualIncome * 0.15;
		}
	}
	
	
	
}
