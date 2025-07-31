package SuperAndSubClasses;
import java.util.Scanner;

public class TotalEpisodes {
	public static int totalEpisodes(int season) {
		int total;
		int totalEpisodes = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i = 1; i <= season; i++) {
			System.out.print(i + ". Season's Number Of Episode : ");
			total = scanner.nextInt();
			totalEpisodes += total; 
		}
		return totalEpisodes;
	}
}
