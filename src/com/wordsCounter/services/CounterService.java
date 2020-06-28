package com.wordsCounter.services;

public class CounterService {
	
	String[] englishPrepositions = {"of","with","at","from","into","during","including","until","against","among","throughout","despite",
			"towards","upon","concerning","to","in","for","on","by","about","like","throught","over","before","between","after","since",
			"without","under","within","along","following","across","behind","beyond","plus","except","but","up","out","around","down",
			"off","above","near"};	
	String[] frenchPrepositions = {"�","apr�s","avant","avec","chez","contre","dans","de","depuis","derri�re","devant","en","entre",
			"envers","environ","par","pendant","pour","sans","sauf","selon","sous","sur","vers"};
	
	
	public int numberOfCharacters(String text) {
		return text.length();
	}
	
	public int numberOfWords(String text,String filter) {
		if(filter.equals("true")) {
			return text.split(" ").stream();
		}else {
			return text.split(" ").length;
		}
	}
	

}
