package es.orange;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void existe() {
		try{ 
			int res= App.add("");
			assertTrue(true);
		}catch (Exception e) {
			fail("No existe");
		}
	}
	
	@Test
	public void ceroargs() {
		int res= App.add("");
		assertTrue(res==0);		
	}
	
	@Test
	public void unarg() {
		int val=3;
		int res= App.add(""+3);
		assertTrue(res==val);
	}
	
	@Test
	public void dosargs() {
		int res=App.add("1,2");
		assertTrue(res==3);
	}
	
	@Test(expected=Exception.class)
	public void textargs() {
		int res=App.add("1,Z");		
	}
	
	@Test
	public void comaargs() {
		int res=App.add("1 , ");
		assertTrue(res==1);
	}


}
