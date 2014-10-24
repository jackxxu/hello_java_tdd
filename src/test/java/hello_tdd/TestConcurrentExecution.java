package hello_tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConcurrentExecution {

	@Test
	public void test_execution_renders_current_results() throws Exception {
		ConcurrentExecutor executor = new ConcurrentExecutor();
		assertEquals(executor.sum(1, 2), 3);
	}
}
