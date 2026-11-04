import java.util.stream.Stream;

public class Main
{
	public static void main(String[] args) {
		Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
				.limit(10)
				.map(f -> f[0])
				.forEach(i ->System.out.print(i+" "));

	}
}
o/p : 0 1 1 2 3 5 8 13 21 34 
