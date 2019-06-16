package frieda.share;

/**
 * FizzBuzz Main
 *
 */
public class Main {

	public static void main(String[] args) {
		FizzBuzzServiceImpl service = new FizzBuzzServiceImpl();
		service.getFizzBuzz(3);
	}
}
