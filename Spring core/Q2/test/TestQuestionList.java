package com.springcoreassignment.q2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/questionListAssignment.xml")
public class TestQuestionList {

	@Test
	public void Listtest() {
		List<String> expected = new ArrayList<>();
		expected.add("Java");
		expected.add("C++");
		expected.add("Python");
		List<String> actual = question.QandADisplay();
		boolean result = expected.equals(actual);
		assertTrue(result);
		
		
	}

}
