import java.util.stream.Stream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class DuplicateCharactors
{
	public static void main(String[] args) {
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		Map<String, Long>charCountMap = 
							Arrays.stream(inputString.split(""))
									.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
;
		
		List<String> nonRepeatedChar = charCountMap.entrySet()
												.stream()
												.filter(entry ->entry.getValue() == 1)
												.map(entry ->entry.getKey())
												.collect(Collectors.toList());
												
		List<String> repeatedChar = charCountMap.entrySet()
												.stream()
												.filter(entry ->entry.getValue() > 1)
												.map(entry ->entry.getKey())
												.collect(Collectors.toList());
			
		System.out.println("Non repeating Characters"+nonRepeatedChar);
		System.out.println("charators count"+charCountMap);
		System.out.println("Duplicate charactors"+repeatedChar);
		
	}
}



