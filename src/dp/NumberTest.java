/**
 * 
 */
package dp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author HP
 *
 */
class NumberTest {
	Number num;

	//@Test
	//void test() {
	//	fail("Not yet implemented");
	//}
	@BeforeEach
	void setUp() {
		num =new Number(18);
	}
	@AfterEach
	void collapse() {
		num = null;
	}
	
	@Test
	public void isZero() {
		assertEquals(false,num.isZero());
	}
	public void isPositive() {
		assertEquals(true,num.isPositive());
	}
	public void isNegative() {
		assertEquals(false,num.isNegative());
	}
	public void isOdd() {
		assertEquals(false,num.isOdd());
	}
	public void isEven() {
		assertEquals(true,num.isEven());
	}
	public void isPrime() {
		assertEquals(false,num.isPrime());
	}
	public void isArmstrong() {
		assertEquals(false,num.isArmstrong());
	}
	
	public void getFactorial() {
		assertEquals(6.402373705728E15,num.getFactorial());
	}
	public void getSqrt() {
		assertEquals(4.242640687119285,num.getSqrt());
	}
	public void getSqr() {
		assertEquals(324,num.getSqr());
	}
	public void sumDigits() {
		assertEquals(9,num.sumDigits());
	}
	public void getReverse() {
		assertEquals(81,num.getReverse());
	}
}
