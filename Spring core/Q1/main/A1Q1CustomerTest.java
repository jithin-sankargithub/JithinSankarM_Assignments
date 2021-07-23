package com.thespringcoreassignment;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/Beans1.xml")
public class A1Q1CustomerTest {
	
	@Autowired
	Customer customer;

	@Test
	public void testDisplay() {
		
		String[] expected = {"Ashik","Tokyo","Japan"};
		String[] actual =customer.Display();
		assertArrayEquals(expected,actual);
		
	}

}
