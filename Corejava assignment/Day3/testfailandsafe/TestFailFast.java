package com.testfailandsafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestFailFast {

	public static void main(String[] args) {
		Map<String,String> player = new HashMap<>();
		player.put("Argentina", "Messi");
		player.put("Brazil", "Neymar");
		player.put("Portugal","Ronaldo");
		player.put("Wales", "Bale");
		Set<String> keyset = player.keySet();
		Iterator<String> iterator = keyset.iterator();
		while(iterator.hasNext()) {
			player.put("Spain", "Iniesta"); //Concurrent exception
			String football = iterator.next();
			System.out.println(football+" "+player.get(football));
		}
	}

}
