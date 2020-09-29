package dat159.fowler;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }
    
    double determineAmount() {
    	double thisAmount = 0;
    	thisAmount+= getMovie().determineAmount(this);
    	  return thisAmount;
    }
    
    int calcFRP() {
    	return _movie.calcFRP(_daysRented);
    }
}