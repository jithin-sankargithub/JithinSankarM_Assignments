package com.testfailandsafe;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrent {

	public static void main(String[] args) {
		Map<String,String> player = new ConcurrentHashMap<>();
		player.put("Argentina", "Messi");
		player.put("Brazil", "Neymar");
		player.put("Portugal","Ronaldo");
		player.put("Wales", "Bale");
		Set<String> keyset = player.keySet();
		Iterator<String> iterator = keyset.iterator();
		while(iterator.hasNext()) {
			player.put("Spain", "Iniesta"); //fail safe no exception
			String football = iterator.next();
			System.out.println(football+" "+player.get(football));
		}
	}

}
