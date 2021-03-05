package a1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Deepak2 {
	
	char[] arr;
	
	Deepak2(char[ ] arr){
		
		this.arr = arr;
	}
	
	String getCountChars() {
		String charsWithCount = "";
		
	Map<Character,Integer> charCount = new HashMap<>();
	
	for(int i =0;i < this.arr.length;i++) {
		
		if( charCount.containsKey(this.arr[i]) ) {
			
			int val = charCount.get(this.arr[i]);
			val++;
			charCount.put(this.arr[i], val);
			}
		
		else {
			charCount.put(this.arr[i],1);
		}
		
	}
	
	
	Set<Character> it =  charCount.keySet();
	
	for(Character i : it) 
	{
		charsWithCount+= String.valueOf(i) + String.valueOf(charCount.get(i));
	}
	

return charsWithCount;
		
	}

}
