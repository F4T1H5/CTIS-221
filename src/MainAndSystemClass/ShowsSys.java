package MainAndSystemClass;
import java.util.ArrayList;
import java.util.Scanner;

import SuperAndSubClasses.Films;
import SuperAndSubClasses.Shows;
import SuperAndSubClasses.TVSeries;
import SuperAndSubClasses.TotalEpisodes;


public class ShowsSys {
    private static ArrayList<Shows> showList = new ArrayList<>();
    
    public static ArrayList<Shows> getShowList() {
		return showList;
	}

	public static void addShow() {
        Scanner scanner = new Scanner(System.in);
        String choiceString = "";
        
        System.out.print("Would you like to add a movie or TV series? (Type 'film' or 'tv series', or 'no' to stop) : ");
        choiceString = scanner.nextLine();
        
        while (!choiceString.equalsIgnoreCase("no")) {
            
        	
            if (choiceString.equalsIgnoreCase("film")) {
                Films film;
                String name, releaseDate, award, castString, writerProducerString;
                castString = "";
                writerProducerString = "";
                
                double budget, imdbPoint, totalBoxOffice;
                
                ArrayList<String> cast = new ArrayList<>();
                ArrayList<String> writerProducer = new ArrayList<>();
                
                System.out.print("Name Of The Film : ");
                name = scanner.nextLine();
                
                if(isShowExists(name)) {
                	System.out.println("This show exist in the system!");
                	continue;
                }
                	
                else {
					System.out.print("Release Date Of The Film : ");
                releaseDate = scanner.nextLine();
                
                System.out.print("Budget Of The Film : ");
                budget = scanner.nextDouble();
                
                scanner.nextLine();
                System.out.print("Award Of The Film : ");
                award = scanner.nextLine();
                
                System.out.print("Casts Of The Film ('No' to Stop) : ");
                castString = scanner.nextLine();
                
                while(!castString.equalsIgnoreCase("no")) {
                	cast.add(castString);
                	System.out.print("Casts Of The Film ('No' to Stop) : ");
                	castString = scanner.nextLine();
                }
                
                System.out.print("Writer or Producer Of The Film ('No' to Stop) : ");
                writerProducerString = scanner.nextLine();
                
                while(!writerProducerString.equalsIgnoreCase("no")) {
                	writerProducer.add(writerProducerString);
                	System.out.print("Writer or Producer Of The Film ('No' to Stop) : ");
                	writerProducerString = scanner.nextLine();
                }
                
                System.out.print("IMDB Point Of The Film : ");
                imdbPoint = scanner.nextDouble();
                
                System.out.print("Total Box Office Score Of The Film : ");
                totalBoxOffice = scanner.nextDouble();
                scanner.nextLine();
                
                film = new Films(name, releaseDate, award, budget, imdbPoint, writerProducer, cast, totalBoxOffice);
                //film.calculateProfit();
                
                showList.add(film);
				}  
                
            } else if (choiceString.equalsIgnoreCase("tv series")) {
                TVSeries tvSeries;
                String emmyString;
                String name, releaseDate, award, ageRestriction, castString, writerProducerString;
                castString = "";
                writerProducerString = "";
                
                int total = 0;
                double budget, imdbPoint;
                String completedSeries;
                
                ArrayList<String> cast = new ArrayList<>();
                ArrayList<String> writerProducer = new ArrayList<>();
                
                System.out.print("Name Of The TV Series : ");
                name = scanner.nextLine();
                
                if(isShowExists(name)) {
                	System.out.println("This show exist in the system!");
                	continue;
                }
                
                else {
					System.out.print("Release Date Of The TV Series : ");
                releaseDate = scanner.nextLine();
                
                System.out.print("Budget Of The TV Series : ");
                budget = scanner.nextDouble();
                
                scanner.nextLine();
                System.out.print("Award Of The TV Series : ");
                award = scanner.nextLine();
                
                System.out.print("Casts Of The Show ('No' to Stop) : ");
                castString = scanner.nextLine();
                
                while(!castString.equalsIgnoreCase("no")) {
                	cast.add(castString);
                	System.out.print("Casts Of The TV Series ('No' to Stop) : ");
                	castString = scanner.nextLine();
                }
                
                System.out.print("Writer or Producer Of The TV Series ('No' to Stop) : ");
                writerProducerString = scanner.nextLine();
                
                while(!writerProducerString.equalsIgnoreCase("no")) {
                	writerProducer.add(writerProducerString);
                	System.out.print("Writer or Producer Of The TV Series ('No' to Stop) : ");
                	writerProducerString = scanner.nextLine();
                }
                
                System.out.print("IMDB Point Of The TV Series : ");
                imdbPoint = scanner.nextDouble();
                
                scanner.nextLine();
                System.out.print("Is This Series Completed : ");
                completedSeries = scanner.nextLine();
                
                System.out.print("What Is The Age Restriction Of The TV Series : ");
                ageRestriction = scanner.nextLine();
                
                System.out.print("How Many Seasons Does This Show Have? ");
                int season = scanner.nextInt();
                scanner.nextLine();
                
                
                total = TotalEpisodes.totalEpisodes(season);
                
                tvSeries = new TVSeries(name, releaseDate, award, budget, imdbPoint, writerProducer, cast, completedSeries, ageRestriction, total);
                //tvSeries.calculateProfit();
                emmyString = tvSeries.wonEmmy();
                tvSeries.setEmmyString(emmyString);
                showList.add(tvSeries);
				}
                
            } else if (!choiceString.equalsIgnoreCase("no")) {
                System.out.println("Invalid choice. Please enter 'film', 'tv series', or 'no'.");
            }
        
            System.out.print("Would you like to add a movie or TV series? (Type 'film' or 'tv series', or 'no' to stop) : ");
            choiceString = scanner.nextLine();
        }
    }
	
    public static String displayTVSeries() {
        StringBuilder result = new StringBuilder();
        for (Shows show : showList) {
            if (show instanceof TVSeries) {
                TVSeries tvSeries = (TVSeries) show;
                result.append(tvSeries.toString()).append("\n");
            }
        }
        return result.toString();
    }

    public static String displayFilms() {
        StringBuilder result1 = new StringBuilder();
        for (Shows show : showList) {
        	if (show instanceof Films) {
                Films films = (Films) show;
                result1.append(films.toString()).append("\n");
            }
        }
        return result1.toString();
    }
    
    public static Shows searchShow(String nameString) {
    	Shows shows = null;
    	
    	for(int i = 0; i < showList.size(); i++) {
    		if(showList.get(i).getName().equalsIgnoreCase(nameString)) {
    			shows = showList.get(i);
    			return shows;
    		}
    	}
    	return null;
    }
    
    public static boolean deleteShow(String nameString) {
    	
    	for(int i = 0; i < showList.size(); i++) {
    		if(showList.get(i).getName().equalsIgnoreCase(nameString)) {
    			showList.remove(i);
    			return true;
    		}
    	}
    	return false;
    }
    
    
    public static boolean isShowExists(String nameString) {
    	
        for (int i = 0; i < showList.size(); i++) {
            if (showList.get(i).getName().equalsIgnoreCase(nameString)) {
                return true;
            }
        }
        return false;
    }  
}
