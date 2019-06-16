package frieda.share;

public class FizzBuzzServiceImpl implements FizzBuzzService {

	public String getFizzBuzz(int i) {
		String result = "";

		if (i % 3 == 0)
			result += "Fizz";
		if (i % 5 == 0)
			result += "Buzz";
		if (result.length() > 0)
			System.out.println(result);
		else
			System.out.println(i);

		return result;

	}

}
