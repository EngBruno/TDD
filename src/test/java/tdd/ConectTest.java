package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConectTest {

	private int x = 1;
	private int y = 1;
	
	@Test 
	public void metodo() {
	    int z = x + y;
	    assertEquals(2, z);
	}
	
}
