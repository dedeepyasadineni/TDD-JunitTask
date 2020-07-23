package com.epam.tddjunit;

import org.junit.Test;

import junit.framework.TestCase;

public class RemovingAatfrst2charsTest extends TestCase {
	@Test
	public void test() {
		RemovingAatfrst2chars a=new RemovingAatfrst2chars();
		assertEquals("BCD",a.remove("ABCD"));
		assertEquals("CD",a.remove("AACD"));
		assertEquals("BCD",a.remove("BACD"));
		assertEquals("BBAA",a.remove("BBAA"));
		assertEquals("BAA",a.remove("AABAA"));
	}

}
