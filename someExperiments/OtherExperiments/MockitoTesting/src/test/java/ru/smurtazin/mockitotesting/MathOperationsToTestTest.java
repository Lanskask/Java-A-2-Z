package ru.smurtazin.mockitotesting;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.Time;
import java.sql.Timestamp;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by a1 on 27.05.17.
 */
public class MathOperationsToTestTest {
	MathOperationsToTest matToTest;
	Timestamp timestampToCheckWith;
	Timestamp timestampToCheckWith2;

	@Before
	public void setUp() throws Exception {
//		this.matToTest = new MathOperationsToTest();
		this.matToTest = mock(MathOperationsToTest.class);
		this.timestampToCheckWith = mock(Timestamp.class);

//		when(matToTest.add(80, 20)).thenReturn(anyInt());
		when(matToTest.add(2, 2)).thenReturn(3);
		when(matToTest.decrice(4, 1)).thenReturn(3);
		when(matToTest.multiply(3, 1)).thenReturn(3);
		when(matToTest.devide(4, 2)).thenReturn(2.);
//		Matcher match;
//		BaseMatcher baseMatcher;
		when(matToTest.getTimestamp()).thenReturn(new Timestamp(System.currentTimeMillis()));
//		when(matToTest.getTimestamp()).thenReturn(any(Timestamp.class));
	}

//	@Ignore
	@Test
	public void isTimestamp_shouldReturn_True() throws Exception {
//		assertThat(matToTest.getTimestamp(), is(timestampToCheckWith));
		assertTrue(matToTest.getTimestamp() instanceof Timestamp);
	}

	@Test
	public void add() throws Exception {
		assertEquals(matToTest.add(2, 2), 3);
	}

	@Test
	public void decrice() throws Exception {
		assertThat(matToTest.decrice(4, 1), is(3));
	}

	@Test
	public void multiply() throws Exception {
		assertThat(matToTest.multiply(3, 1), is(3));
	}

	@Test
	public void devide() throws Exception {
		assertThat(matToTest.devide(4, 2), is(2.));
	}

}