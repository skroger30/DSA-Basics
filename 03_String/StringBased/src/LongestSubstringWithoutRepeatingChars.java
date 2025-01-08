

public class LongestSubstringWithoutRepeatingChars {

	public static void main(String[] args) {
	 LongestSubstringWithoutRepeatingChar("abbbadacccdce");

	}

	public static void LongestSubstringWithoutRepeatingChar(String input) 
	{
		String data=input;
		String getSubstring=""+data.charAt(0);
		for(int i=1;i<data.length();i++) 
		{
			char ch=data.charAt(i);
			boolean repeated=false;
			for(int j=0;j<getSubstring.length();j++) 
			{	
				if(ch==getSubstring.charAt(j)) 
				{
					repeated=true;
					break;
				}
			}
			if(!repeated)
			{
				getSubstring=getSubstring+ch;
			}
		}
		
		System.out.println("LongestSubstring = "+getSubstring);
		System.out.println("Length of LongestSubstring = "+getSubstring.length());
	}
}
