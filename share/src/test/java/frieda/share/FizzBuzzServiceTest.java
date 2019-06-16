package frieda.share;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Tdd Test
 */
@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzServiceTest {
	@InjectMocks
	FizzBuzzServiceImpl service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getFizzBuzz_Fizz_Response() {
		assertEquals("Fizz", service.getFizzBuzz(3));
	}

	@Test
	public void getFizzBuzz_Buzz_Response() {
		assertEquals("Buzz", service.getFizzBuzz(5));
	}

	@Test
	public void getFizzBuzz_FizzBuzz_Response() {
		assertEquals("FizzBuzz", service.getFizzBuzz(15));
	}

	@Test
	public void getFizzBuzz_Empty_Response() {
		assertEquals("", service.getFizzBuzz(2));
	}

}
