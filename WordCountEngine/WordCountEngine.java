import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountEngine {
	public static List<WordCount> wordCountEngine(String doc) {
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		String[] words = doc.replaceAll("\\W", " ").toLowerCase().split("\\s+");
		
		for (String w : words) {
			if (!wordCount.containsKey(w)) {
				wordCount.put(w, 0);
			}
			
			wordCount.put(w, wordCount.get(w) + 1);
		}
		
		List<WordCount> sortedWordCount = new ArrayList<WordCount>();
		
		for (String w : wordCount.keySet()) {
			sortedWordCount.add(new WordCount(w, wordCount.get(w)));
		}
		
		Collections.sort(sortedWordCount);
		
		return sortedWordCount;
		
	}
	
	
	public static void main(String[] args) {
		String doc = "practice makes Perfect. get perfect   by  by practice. just practice!";
		
		System.out.println(wordCountEngine(doc));
	}
	
}

class WordCount implements Comparable<WordCount> {
	String word;
	int count;
	
	public WordCount(String word, int count) {
		this.word = word;
		this.count = count;
	}
	
	public int getCount() {
		return this.count;
	}
	
	@Override
	public int compareTo(WordCount anotherWord) {
		if (this.count >= anotherWord.getCount()) {
			return -1;
		} else {
			return 1;
		}	
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.word + "=" + this.count;
	}
}