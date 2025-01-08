

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfOcurence {

	public static void main(String[] args) {

		//------------> [1] 
		String countCharacter="bubble bumble bee";
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<countCharacter.length();i++) 
		{
			char ch=countCharacter.charAt(i);
			if(map.containsKey(ch)) 
			{
				map.put(ch, map.get(ch)+1);
			}
			else 
			{
				map.put(ch, 1);
			}
		}
		Set<Entry<Character, Integer>> result	=map.entrySet();
		result.stream().filter(v -> v.getValue()>1).forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));
		
		
		
		
		
		
		
		//------------> [2] input= OPENTEXT output=OPEN1EX2
		
		String input="bubble";
		char target='b';
		String output="";
		if(input.indexOf(target)==-1)
		{
			System.out.println("target char not found.");
			System.exit(0);
		}
		 char[] charArray=input.toCharArray();
		 int count=0;
//		 for(int i=0;i<charArray.length;i++) 
//		 {
//			 if(charArray[i]==target) 
//			 {
//				 count++;
//				 output=output+count;
//			 }
//			 else
//			 {
//				 output=output+charArray[i];
//			 }
//		 }
		// ----------------------------- Using regex 
		 for(int i=0; i<input.length();i++) 
		 {
			 char ch=input.charAt(i);
			 if(ch==target) 
			 {
				 count++;
				 input=input.replaceFirst(String.valueOf(ch), String.valueOf(count));
			 }
		 }
		 System.out.println(input);
	}
}
