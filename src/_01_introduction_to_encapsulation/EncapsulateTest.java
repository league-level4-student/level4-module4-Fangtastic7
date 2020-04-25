package _01_introduction_to_encapsulation;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class EncapsulateTest {
EncapsulateTheData obj = new EncapsulateTheData();

@Test
public void testitemsReceived() {
	try {
		obj.setitemsReceived(5);
		assertEquals(5, obj.getitemsReceived());
		obj.setitemsReceived(-1);
		assertEquals(0, obj.getitemsReceived());
		//fail("There is an error ");
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("No value set.");
	}
}

@Test
public void testdegreesTurned() {
	try {
		obj.setdegreesTurned(5f);
		assertEquals(5f, obj.getdegreesTurned());
		obj.setdegreesTurned(35.5f);
		assertEquals(35.5, obj.getdegreesTurned());
		obj.setdegreesTurned(-1.0f);
		assertEquals(0f, obj.getdegreesTurned());
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("not a float");
	}
}

@Test
public void testnomenclature() {
	try {
		obj.setnomenclature("bob");
		assertEquals("bob", obj.getnomenlature());
		obj.setnomenclature("");
		assertEquals(" ", obj.getnomenlature());
	} catch(Exception e) {
		e.printStackTrace();
	}
}

@Test
public void testmemberOb() {
	try {
		obj.setmemberOb(1);
		assertEquals(1, obj.getmemberOb());
		obj.setmemberOb("bob");
		Object ob1 = obj.getmemberOb();
		assertFalse(ob1 instanceof String);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
