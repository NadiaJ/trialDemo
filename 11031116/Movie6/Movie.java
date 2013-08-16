
public class Movie {
	 String movie_name;
	  int price;
	  int charges;
	  
	public Movie(String movie_name, int price) {
		this.movie_name=movie_name;
		this.price=price;
	}


	public void charge(int days)
	{
		this.charges=price*days;
	}


}
