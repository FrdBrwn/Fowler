import static org.junit.Assert.*;

import org.junit.Test;

public class RentalTest {
	
	@Test
	public void Rental() {
		Movie movieExample = new Movie("testmovie", 30);
		Rental toTestObject = new Rental(movieExample, 5);
			assertEquals(movieExample, toTestObject.getMovie());
			assertEquals(5, toTestObject.getDaysRented());
	}

}
