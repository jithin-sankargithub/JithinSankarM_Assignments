package com.springcoreassignment.q2;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/questionMapAssignment.xml")
public class TestQuestionMap {

	@Test
	public void Maptest() {
		Map<Integer,String> expected = new HashMap<>();
		expected.put(1,"Java");
		expected.put(2,"C++");
		expected.put(3,"Python");
		Map<Integer,String> actual = question.QandA_Display();
		boolean result = expected.equals(actual);
		assertTrue(result);
		
		
	}

}
