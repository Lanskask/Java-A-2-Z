package ru.smurtazin.mockitotesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by a1 on 27.05.17.
 */
public class MathOperationsToTestTest {
	MathOperationsToTest matToTest;

	@Before
	public void setUp() throws Exception {
//		this.matToTest = new MathOperationsToTest();
		this.matToTest = mock(MathOperationsToTest.class);
	}

	@Test
	public void add() throws Exception {
//		assertThat(matToTest.add(1, 2), is(3));
		when(matToTest.add(1, 2)).thenReturn(3);
	}

	@Test
	public void decrice() throws Exception {
//		assertThat(matToTest.decrice(4, 1), is(3));
		when(matToTest.decrice(4, 1)).thenReturn(3);
	}

	@Test
	public void multiply() throws Exception {
//		assertThat(matToTest.multiply(3, 1), is(3));
		when(matToTest.multiply(3, 1)).thenReturn(3);
	}

	@Test
	public void devide() throws Exception {
//		assertThat(matToTest.devide(4, 2), is(2.));
		when(matToTest.devide(4, 2)).thenReturn(2.);
	}

}