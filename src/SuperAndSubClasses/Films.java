package SuperAndSubClasses;
import java.util.ArrayList;
import java.util.Scanner;

public class Films extends Shows{
	
	private double totalBoxOffice;
	private double profit;
	private static int totalFilms = 0;
	
	public Films(String name, String releaseDate, String award, double budget, double imdbPoint,
			ArrayList<String> writerProducer, ArrayList<String> cast, double totalBoxOffice) {
		super(name, releaseDate, award, budget, imdbPoint, writerProducer, cast);
		this.totalBoxOffice = totalBoxOffice;
		totalFilms++;
	}

	
	public double getProfit() {
		return profit;
	}


	public void setProfit(double profit) {
		this.profit = profit;
	}


	public double getTotalBoxOffice() {
		return totalBoxOffice;
	}

	public void setTotalBoxOffice(double totalBoxOffice) {
		this.totalBoxOffice = totalBoxOffice;
	}

	public static int getTotalFilms() {
		return totalFilms;
	}

	public static void setTotalFilms(int totalFilms) {
		Films.totalFilms = totalFilms;
	}
				
	public void calculateProfit(double expenditure) {
		double profit = 0;
		
		profit = getBudget() - expenditure;
		
		setProfit(profit);
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
				"\nTotal Box Office = " + totalBoxOffice + 
				"\nCast of the Film = " + sb + 
				"Writer and Producer of the Film = " + sb2 +
				"Total profit for this film = " + getProfit();
	}
}
