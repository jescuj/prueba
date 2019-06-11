package es.orange;

import static org.junit.Assert.*;

import org.junit.Test;

public class Add1001Test {

	@Test
	public void mayor1000() {
		int res=App.add("1,1001");
		assertEquals (res,1);
	}

}
