package entities;

public abstract class Account {
	protected String name;
	protected double anualIncome;
	
	public Account() {
		
	}

	public Account(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}
	
	public abstract double tax();
	
	
	
}
