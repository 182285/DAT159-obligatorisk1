package dat159.fowler;

public abstract class Movie {
    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }

    public String getTitle() {
        return _title;
    }
    
    public abstract double determineAmount(Rental each);

    public int calcFRP(int days) {
    	return 1;
    }
  
}
