package hello_tdd;

import java.util.concurrent.Callable;

public class DoMath implements Callable<Integer> {
	
	private int i;
	private int j;

	public DoMath(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public Integer call() throws Exception {
		return this.i + this.j;
	}

	
}
