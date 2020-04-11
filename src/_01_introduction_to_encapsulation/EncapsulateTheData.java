package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.ItemSelectable;

import org.junit.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private int itemsReceived; // must not be negative. All negative arguments get set to 0.
	private float degreesTurned; // must be locked between 0.0 and 360.0 inclusive. If it is out of bounds, then
									// set the degrees to 0.
	private String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	int getitemsReceived() {
		return itemsReceived;
	}

	public void setitemsReceived(int item) {
		if (item < 0) {
			item = 0;
		}
		this.itemsReceived = item;
	}

	float getdegreesTurned() {
		return degreesTurned;
	}

	public void setdegreesTurned(float degrees) {
		if (degrees < 0.0f || degrees > 360.0f) {
			System.out.println(degrees);
			degrees = 0.0f;
		}
		this.degreesTurned = degrees;
	}
	
	String getnomenlature() {
		return nomenclature;
	}
	
	public void setnomenclature(String word) {
		if(word.equals("")) {
			word = " ";
		}
		this.nomenclature = word;
	}
	
	Object getmemberOb() {
		return memberObj;
	}
	
	public void setmemberOb(Object var) {
		if(var instanceof String ) {
			var = new Object();
		}
		this.memberObj = var;
	}


}
