import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;

public class testFile {

	Bowling g = new Bowling();
	java.util.List<int []> list;
	
	//Check if the values change
	@Test
	public void test1() {
		int a = 11;
		int b = 11;
		int [] pins = g.frameRandom(a, b);

		assertNotEquals(pins[0], 11);
		assertNotEquals(pins[1], 11);
	}
	//Check if the random numbers are in the range 1-10
	@Test
	public void test2() {
		int a = 11;
		int b = -1;
		int [] pins = g.frameRandom(a, b);
		boolean bool = false;
		
		if((pins[0] > -1 || pins[0] < 11) && (pins[1] > -1 || pins[1] < 11))
		{
			bool = true;
		}
		
		assertTrue(bool);
	}
	//Check if we create objects in game() and that there are in the range 1-12
	@Test
	public void test3() {
		java.util.List<int []> list = g.game();
		assertNotEquals(list.size(), 0);
		assertTrue(rightRange(list.size()));
	}
	//Help function to check if it's in the right range
	boolean rightRange(int i) {
		boolean bool = false;
		if(i >= 9 && i < 12)
			bool = true;
		return bool;
	}
	@Test
	public void test4() {
		int a = -1;
		a = g.gameScore();
		
		assertNotEquals(a, -1);
	}
	@Test
	public void test5() {
		
		boolean bool = g.strike(10);
		boolean bool2 = g.strike(9);
		assertTrue(bool);
		assertFalse(bool2);
	}
	@Test
	public void test6() {
		boolean bool = g.spare(10);
		boolean bool2 = g.spare(9);
		assertTrue(bool);
		assertFalse(bool2);
	}
	@Test
	public void test7() {
		g.init81points();
		assertEquals(g.gameScore(), 81);
	}
	@Test
	public void test8() {
		g.init94points();
		assertEquals(g.gameScore(), 94);
	}
	@Test
	public void test9() {
		g.init88points();
		assertEquals(g.gameScore(), 88);
	}
	@Test
	public void test10() {
		g.init103points();
		assertEquals(g.gameScore(), 103);
	}
	@Test
	public void test11() {
		g.init300points();
		assertEquals(g.gameScore(), 300);
	}
	@Test
	public void test12() {
		g.init279points();
		assertEquals(g.gameScore(), 279);
	}
	@Test
	public void test13() {
		g.init135points();
		assertEquals(g.gameScore(), 135);
	}
	@Test
	public void test14() {
		g.init98points();
		assertEquals(g.gameScore(), 98);
	}
	@Test
	public void test15() {
		g.init120points();
		assertEquals(g.gameScore(), 120);
	}
	@Test
	public void test16() {
		g.init68points();
		assertEquals(g.gameScore(), 68);
	}
	@Test
	public void test17() {
		g.init60points();
		assertEquals(g.gameScore(), 60);
	}
	@Test
	public void test18() {
		g.init0points();
		assertEquals(g.gameScore(), 0);
	}
	@Test
	public void test19() {
		g.list.clear();
		assertEquals(g.gameScore(), 0);
	}
	@Test
	public void test20() {
		g.init100points();
		assertEquals(g.gameScore(), 100);
	}
	@Test
	public void test21() {
		g.init110points();
		assertEquals(g.gameScore(), 110);
	}
	@Test
	public void test22() {
		g.init299points();
		assertEquals(g.gameScore(), 299);
	}
	



}
