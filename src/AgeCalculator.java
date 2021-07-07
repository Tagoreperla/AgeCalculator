import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1991, 03, 20);
		int years = Period.between(birthDate, today).getYears();
		int Months = Period.between(birthDate, today).getMonths();
		int Days = Period.between(birthDate, today).getDays();
		System.out.println("You are "+years+ " Years "+Months+ " Months and "+Days+ " Days by today!");
		
	}

}
