import java.util.stream.Stream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main
{
	public static void main(String[] args) {
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		Map<String, Long>charCountMap = 
							Arrays.stream(inputString.split(""))
									.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream() // Stream the map entries
                .filter(entry -> entry.getValue() > 1) // Filter out unique characters
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // Collect into final map
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

o/p : Non repeating Characters[]
charators count{a=3, c=2, t=2, e=2, o=2}
Duplicate charactors[a, c, t, e, o]

