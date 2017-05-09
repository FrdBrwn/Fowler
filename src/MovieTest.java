import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {

	Movie toTestMovie = new Movie("Transformers", 20);
	
	@Test
	public void Movie() {
		assertEquals("Transformers", toTestMovie.getTitle());
		assertEquals(20, toTestMovie.getPriceCode());
	}
	
	@Test
	public void setPriceCode() {
		toTestMovie.setPriceCode(22);
		assertEquals(22, toTestMovie.getPriceCode());
	}

}
