package com.wordsCounter.services;

import java.util.Arrays;

public class CounterService {
	
	String[] englishPrepositions = {"of","with","at","from","into","during","including","until","against","among","throughout","despite",
			"towards","upon","concerning","to","in","for","on","by","about","like","throught","over","before","between","after","since",
			"without","under","within","along","following","across","behind","beyond","plus","except","but","up","out","around","down",
			"off","above","near"};	
	String[] frenchPrepositions = {"à","après","avant","avec","chez","contre","dans","de","depuis","derrière","devant","en","entre",
			"envers","environ","par","pendant","pour","sans","sauf","selon","sous","sur","vers"};
	
	
	public int numberOfCharacters(String text) {
		return text.length();
	}
	
	public long numberOfWords(String text,String filter,String lang) {
		if(filter.trim().equals("true")) {
			if(lang.equals("french")) {
				return Arrays.asList(text.split(" ")).stream().filter(x -> !Arrays.asList(frenchPrepositions).contains(x)).count();
			}else {
				return Arrays.asList(text.split(" ")).stream().filter(x -> !Arrays.asList(englishPrepositions).contains(x)).count();
			}
		}else {
			return text.split(" ").length;
		}
	}
	

}
