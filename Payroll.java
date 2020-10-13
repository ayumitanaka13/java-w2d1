import java.util.Scanner;

public class Payroll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee’s name: ");
		String name = input.next();	
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();

        double grossPay, federal, state, totalDeduction;
        
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + hourlyPayRate);
        System.out.println("Gross Pay: $" + (grossPay = hoursWorked * hourlyPayRate));
        System.out.println("Deductions:");
        System.out.println("   Federal Witholding (20.0%): $" + (federal = grossPay * federalTaxRate));
        System.out.println("   State Witholding (9.0%): $" + (state = grossPay * stateTaxRate));
        System.out.println("   Total Deduction: $" + (totalDeduction = federal + state));
        System.out.println("Net Pay: $" + (grossPay - totalDeduction));
	}    
    
}
