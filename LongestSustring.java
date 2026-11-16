//Find the longest substring wihtout repeating characters
import java.util.*;
public class Main
{
    public static void printLongestSubstring(String s)
  {
    int n = s.length();
    int l = 0, r = 0;
    HashSet<Character> visited = new HashSet<>();
    int maxStr = 0;
    int maxL = 0, maxR = 0;
    while (r < n) {
      if (!visited.contains(s.charAt(r))) {
          
        visited.add(s.charAt(r));
        if (r - l + 1 > maxStr) {
          maxStr = r - l + 1;
          maxL = l;
          maxR = r;
        }
        r++;
      }
      else {
        visited.remove(s.charAt(l));
        
        l++;
      }
    }
    System.out.println("MaxLength of substring is "+(maxR-maxL));
    for (int i = maxL; i <= maxR; i++) {
      System.out.print(s.charAt(i));
    }
    System.out.println();
  }
	public static void main(String[] args) {
		System.out.println("Hello World");
		String s = "javastringapplication";
        //System.out.println(longestUniqueSubstr(s));
        printLongestSubstring(s);
	}
}


///output: MaxLength of substring is : 7
 // vastring
