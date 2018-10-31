package ACO.App;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@Test
	public void accountTest() {
		AccountDetails testAccount = new AccountDetails("john", "smith", 123456);
		
	}

	@Test
	public void featureTest() {
		int count = 0;
		
		HashMap<Integer, AccountDetails> hmap = new HashMap<Integer, AccountDetails>();
		
		AccountDetails testAccount = new AccountDetails("john", "smith", 123456);
		AccountDetails testAccount1 = new AccountDetails("john", "sssmith", 123452236);
		
		
		hmap.put(0, testAccount);
		hmap.put(1, testAccount1);
		
		for (int i = 0; i <= hmap.size() - 1; i++) {
			if (hmap.get(i).getFirstName().equals("john")) {
				
				count++;
			}
		}
		
		Assert.assertEquals(2, count);
	}
}