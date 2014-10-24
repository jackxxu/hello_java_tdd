package hello_tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test_app() {
		assertTrue(true);
	}
	
	@Test
	public void test_app_sum_method() {
		App app = new App();
		assertEquals(app.sum(1, 2), 3);
	}
	
	@Test
	public void test_static_sum() throws Exception {
		assertEquals(App.sum2(1, 2), 3);		
	}
	
	@Test
	public void testName() throws Exception {
		
	}

}
