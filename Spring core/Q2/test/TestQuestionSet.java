package com.springcoreassignment.q2;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/questionSetAssignment.xml")
public class TestQuestionSet {

	@Test
	public void Settest() {
		Set<String> expected = new HashSet<>();
		expected.add("Java");
		expected.add("C++");
		expected.add("Python");
		Set<String> actual = question.QandA_Display();
		boolean result = expected.equals(actual);
		assertTrue(result);
		
		
	}

}
