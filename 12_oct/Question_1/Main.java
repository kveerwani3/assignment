package 12_Oct;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] {44,51,12,956,1,233,726,13,90,100,175,43};
		System.out.println("Given Array : ");
		System.out.println(Arrays.asList(arr));
		ComputeMaxElement cme=(x)->{
			Integer[] copy = Arrays.copyOf(x, x.length);
			Arrays.sort(copy);
			return copy[x.length-1];
		};
		Integer max = cme.max(arr);
		System.out.println("\nMax element : "+max);
	}
}