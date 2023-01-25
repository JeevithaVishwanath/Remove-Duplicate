package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListRemoveDuplicateString {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		
		String[] split = text.split(" ");
		
		List<String> word=new ArrayList<String>();
		
		for (int i = 0; i < split.length; i++) {
			word.add(split[i]);
		
		}
		
		Collections.sort(word);
		System.out.println(word);
		for (int i = 0; i < word.size()-1; i++) {
			if(word.get(i)==word.get(i+1)) {
				count+=1;
			}
			if(count>1) {
				word.remove(i);
			
		}
	
		
		}
		System.out.println(word);

	}

}
