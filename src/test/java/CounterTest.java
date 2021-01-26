/**
 * 
 */

import org.junit.*;
import org.junit.Assert;

/**
 * Test class for Counter class
 * 
 * @author [YourName]
 * @version [Current Date]
 *
 */
public class CounterTest {

	/**
	 * Test method for {@link util.Counter#increment()}.
	 */
	public util.Counter counter = null;

	@Before
	public void setUp() {
		counter = new util.Counter();
	}

	@Test
	public void testIncrement() {
		// fail("Not yet implemented");
		counter.increment();
		Assert.assertEquals(1,counter._ctr);

	}

	/**
	 * Test method for {@link util.Counter#decrement()}.
	 */
	@Test
	public void testDecrement() {
		counter.decrement();
		Assert.assertEquals(-1, counter._ctr);
	}

	/**
	 * Test method for {@link util.Counter#reset()}.
	 */
	@Test
	public void testReset() {
		counter.reset();
		Assert.assertEquals(0, counter._ctr);
	}

	@Test
	public void testIncrementToEven(){
		counter._ctr = 5;
		counter.incrementToEven();
		Assert.assertEquals(6, counter._ctr);
	}
	
	
	@Test
	public void testDecrementToEven(){
		counter._ctr = -12;
		counter.decrementToEven();
		Assert.assertEquals(-14, counter._ctr);
	}
	
	@Test
	public void testIncrementToPrime(){
		counter._ctr = 7;
		counter.incrementToPrime();
		Assert.assertEquals(11, counter._ctr);
	}
	
	@Test
	public void testDecrementToPrime(){
		counter._ctr = 37;
		counter.decrementToPrime();
		Assert.assertEquals(31, counter._ctr);
	}
	

}
