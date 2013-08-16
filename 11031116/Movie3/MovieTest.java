import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;


public class MovieTest extends TestCase {

	public void testMovieCharge(){
		Movie movie=new Movie("Despicable Me 2",200);
		movie.charge(7);
		assertEquals(1400,movie.charges);
		
	}
}
