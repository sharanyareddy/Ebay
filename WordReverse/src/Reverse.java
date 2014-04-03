
public class Reverse {
	public static String reversechar(char[] in)
	{
		int start=0;
		int end=0;
		int length=in.length;
		while(end<length)
		{
			if(in[end]!=' ')
			{
				start=end;                    // Save start position of the word
				while(end<length&&in[end]!=' ')
					end++;
				
				end--;
				
				reverse(in,start,end);       // reverse the word
			}
			end++;
		}
		return new String(in);
	}
	private static void reverse(char[] s, int start, int end) {
		
		while(start<end)
		{
			char temp=s[start];            // exchange characters using temporary variable
			s[start]=s[end];
			s[end]=temp;
			start++;                       //Moving the indices towards middle
			end--;
		}
		
	}
	public static void main(String[] args) {
		char[] in={'a','b','c',' ','d','e','f',' ','g','h','i'};
		System.out.println(reversechar(in));

	}

}
