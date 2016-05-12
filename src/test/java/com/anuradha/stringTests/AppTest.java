package com.anuradha.stringTests;

import junit.framework.*;

public class AppTest extends TestCase {
	protected int value1, value2;

	// assigning the values
	protected void setUp(){


	}

	public void testSingleWord(){
		assessment a = new assessment();
		String str =  a.replaceAll("hello eric" , "eric", "erik");
		Assert.assertEquals("hello erik", str);
	}
	
	public void testSingleWordCaseSensitivity(){
		assessment a = new assessment();
		String str =  a.replaceAll("hello Eric" , "eric", "Erik");
		Assert.assertEquals("hello Erik", str);
	}


	public void testMultipleWords(){
		assessment a = new assessment();
		String str =  a.replaceAll("hello eric eric" , "eric", "erik");
		Assert.assertEquals("hello erik erik", str);

	}
	
	public void testMultipleWordsCaseSensitivity(){
		assessment a = new assessment();
		String str =  a.replaceAll("hello Eric Eric" , "eric", "Erik");
		Assert.assertEquals("hello Erik Erik", str);

	}

	public void testSingleCharacter(){
		assessment a = new assessment();
		String str =  a.replaceAll("hello eric erik" , "e", "h");
		Assert.assertEquals("hhllo hric hrik", str);
	}
	
	public void testSingleCharacterCasesensitivity(){
		assessment a = new assessment();
		String str =  a.replaceAll("hello Eric Erik" , "e", "H");
		Assert.assertEquals("hHllo Hric Hrik", str);

	}
	
	public void testSingleCharacterwithi(){
		assessment a = new assessment();
		String str =  a.replaceAll("hello Eric Erik" , "e", "i");
		Assert.assertEquals("hillo iric irik", str);
	}
	
	public void testwithSpace(){
		assessment a = new assessment();
		String str =  a.replaceAll("hello Erik" , "r", " ");
		Assert.assertEquals("hello E ik", str);
	}
	
	public void testwithMultipleSpaces(){
		assessment a = new assessment();
		String str =  a.replaceAll("hello Erik" , "e", " ");
		Assert.assertEquals("h llo  rik", str);
	}
	
	public void testwithNumber(){
		assessment a = new assessment();
		String str =  a.replaceAll("hell0 Erik" , "0", "o");
		Assert.assertEquals("hello Erik", str);
	}
}