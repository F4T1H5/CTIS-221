package SuperAndSubClasses;
import java.util.ArrayList;

import Interface.ShowsInterface;

public abstract class Shows implements ShowsInterface{
	protected String name;
	protected String releaseDate;
	protected String award;
	protected double budget;
	protected double imdbPoint;
	ArrayList<String> writerProducer;
	ArrayList<String> cast;
	
	public Shows(String name, String releaseDate, String award, double budget, double imdbPoint,
			ArrayList<String> writerProducer, ArrayList<String> cast) {
		this.name = name;
		this.releaseDate = releaseDate;
		this.award = award;
		this.budget = budget;
		this.imdbPoint = imdbPoint;
		this.writerProducer = writerProducer;
		this.cast = cast;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getImdbPoint() {
		return imdbPoint;
	}

	public void setImdbPoint(double imdbPoint) {
		this.imdbPoint = imdbPoint;
	}	
	
	public abstract void calculateProfit(double expenditure) ;

	public String toString() {
		return "*****Show Information*****" +
				"\nName = " + name +
				"\nRelease Date = " + releaseDate +
				"\nBudget = " + budget +
				"\nAwards = " + award + 
				"\nIMDB Point = " + imdbPoint;
	}	
}
