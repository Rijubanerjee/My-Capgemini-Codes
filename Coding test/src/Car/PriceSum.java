package Car;

import java.util.List;

public class PriceSum {
	public static void main(String[] args) {
		List<Car> lst = CarList.getinfo();
		double sum = lst.stream().mapToDouble(e -> e.getPrice()).sum();
		System.out.println("The sum of the prices is:"+sum);
	}

}
