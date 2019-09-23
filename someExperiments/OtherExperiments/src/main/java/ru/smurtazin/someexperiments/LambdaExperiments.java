package ru.smurtazin.someexperiments;

interface MyNumber {
	double getValue();
}

interface NumericTest {
	boolean test(int n);
}
/**
 * Created by a1 on 22.05.17.
 */
public class LambdaExperiments {

	void run() {
		MyNumber myNum;
		myNum = () -> 123.234;
		NumericTest isEven = (n) -> (n % 2) == 0;
		System.out.println("Fix val: " + myNum.getValue() );

		myNum = () -> Math.random() * 100;
		System.out.println("Rand val: " + myNum.getValue() );
		System.out.println("Rand val: " + myNum.getValue() );
	}

	public static void main(String[] args) {
		LambdaExperiments main = new LambdaExperiments();
		main.run();
	}
}