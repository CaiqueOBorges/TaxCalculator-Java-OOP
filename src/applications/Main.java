package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Account;
import entities.LegalAccount;
import entities.PersonalAccount;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Account> acc = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Taxpayer " + (1 + i) + " data: ");
			System.out.print("Individual or company(i/c)? ");
			char quest = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			
			if (quest == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Annual income: ");
				double annualIncome = sc.nextDouble();
				System.out.print("Health expeditures: ");
				double healthPayments = sc.nextDouble();
				
				acc.add(new PersonalAccount(name, annualIncome, healthPayments));
				
			}
			else {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Annual income: ");
				double annualIncome = sc.nextDouble();
				System.out.print("Number of employee: ");
				int employeeNum = sc.nextInt();
				
				acc.add(new LegalAccount(name, annualIncome, employeeNum));
			}
			}
			
			System.out.println();
		
			System.out.println("TAXES PAID: ");
			for (Account ac : acc) {
				System.out.print(ac.getName() + " $ ");
				System.out.printf("%.2f", ac.tax());
				System.out.println();
			}
			
			System.out.println();
			
			double sum =0;
			for (Account ac : acc) {
				sum += ac.tax();
			}
			System.out.printf("%nTOTAL TAXES: $ %.2f", sum);
		
		
		sc.close();
	}

}
