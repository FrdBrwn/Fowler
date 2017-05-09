import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	
	Customer deiMudder = new Customer("Mama");

	@Test
	public void Customer() {
		assertEquals("Mama", deiMudder.getName());
	}

}
