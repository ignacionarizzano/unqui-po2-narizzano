package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	
	private Counter counter;
	
	@BeforeEach
	public void setUp( ) {
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	@Test
	public void testEvenNumbers() {
		int amount = counter.getEvenOcurrences();
		
		assertEquals(amount,1);
	}
	@Test
	public void testOddNumbers() {
		int amount = counter.getOddOcurrences();
		
		assertEquals(amount,9);
	}
	@Test
	public void testMultipleNumbers() {
		int amount = counter.getMultipleOcurrences(1);
		
		assertEquals(amount,10);
	}
}

