package ru.smurtazin.mockitotesting;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by a1 on 27.05.17.
 */
public class MathOperationsToTest {

	int a, b;
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());

	MathOperationsToTest(Timestamp timestamp, int a, int b) {
		this.timestamp = timestamp;
		this.a = a;
		this.b = b;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int decrice(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double devide(int a, int b) {
		return a / b;
	}


}
