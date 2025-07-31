package SuperAndSubClasses;
import java.util.ArrayList;
import java.util.Scanner;

public class TVSeries extends Shows{
	private String completedSeries;
	private String ageRestriction;
	private int total;
	private String emmyString;
	private double profit;
	private static int totalSeries = 0;

	public TVSeries(String name, String releaseDate, String award, double budget, double imdbPoint,
			ArrayList<String> writerProducer, ArrayList<String> cast, 
			String completedSeries, String ageRestriction, int total) {
		
		super(name, releaseDate, award, budget, imdbPoint, writerProducer, cast);
		this.completedSeries = completedSeries;
		this.ageRestriction = ageRestriction;
		this.total = total;
		totalSeries++;
	}
	
	
	public double getProfit() {
		return profit;
	}
	

	public void setProfit(double profit) {
		this.profit = profit;
	}



	public String getEmmyString() {
		return emmyString;
	}

	
	public void setEmmyString(String emmyString) {
		this.emmyString = emmyString;
	}

	
	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public String isCompletedSeries() {
		return completedSeries;
	}


	public void setCompletedSeries(String completedSeries) {
		this.completedSeries = completedSeries;
	}


	public String getAgeRestriction() {
		return ageRestriction;
	}


	public void setAgeRestriction(String ageRestriction) {
		this.ageRestriction = ageRestriction;
	}


	public static int getTotalSeries() {
		return totalSeries;
	}


	public static void setTotalSeries(int totalSeries) {
		TVSeries.totalSeries = totalSeries;
	}
	
	@Override
	public String isShowAdaptation() {
        Scanner scanner = new Scanner(System.in);
        String typeString = "";
        do {
            System.out.print("Is this TV Series an adaptation? (yes/no): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("yes")) {
            	
            	System.out.print("Which type of adaptation this show ?");
            	typeString = scanner.next();
                break;
            } else if (input.equalsIgnoreCase("no")) {
                typeString = "This show not a adaptation.";
                break;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        } while (true);
        scanner.close();
        return typeString;
    }
	
	public void calculateProfit(double expenditure) {
		double profit = 0;
		
		profit = getBudget() - expenditure;
		
		setProfit(profit);
	}
	
	public String wonEmmy() {
	    Scanner scanner = new Scanner(System.in);
	    String input;
	    do {
	        System.out.print("Has this show won an Emmy? ");
	        input = scanner.next().toLowerCase();
	        if (input.equalsIgnoreCase("yes")) {
	            return "Yes";
	        } else if (input.equalsIgnoreCase("no")) {
	            return "No";
	        } else {
	            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
	        }
	    } while (true);
	}


	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(String caString : cast) {
			sb.append(caString).append(", ");
		}
		
		sb.append("\n") ;
		
		for(String person : writerProducer) {
			sb2.append(person).append(", ");
		}
		sb2.append("\n");
		
		return super.toString() +
				"\nCompleted Serie = " + completedSeries +
				"\nAge restriction is = " + ageRestriction +
				"\nTotal Number of Episodes = " + total +
				"\nCast of the TV Series = " + sb + 
				"Writer and Producer of the TV Series = " + sb2 +
				"This show won Emmy = " + getEmmyString() + 
				"\nTotal profit for this show = " + getProfit();
	}
}