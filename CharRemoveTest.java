package JUNIT.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharRemoveTest {
	
	
	Removal rem;
	void setup() {
		 rem = new Removal();
	}
	
	
	void testNChars() {
		assertEquals("BCD",rem.remove("ABCD"));
		assertEquals("CD",rem.remove("AACD"));
		assertEquals("BCD",rem.remove("BACD"));
		assertEquals("BBAA",rem.remove("BBAA"));
		assertEquals("BAA",rem.remove("AABAA"));
	}
	
	void test1Char() {
		assertEquals("",rem.remove("A"));
		assertEquals("B",rem.remove("B"));
		
	}
	
	void testNoChar() {
		assertEquals("",rem.remove(""));
	}
	
	
}
