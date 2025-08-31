package view;
import java.util.Arrays;
import quick.sorts.libQSort;

public class exs1_2_3 {

	public static void main(String[] args) {
		libQSort qs = new libQSort();
		int[] vet1 = {74,20,74,87,81,16,25,99,44,58};
		int[] vet2 = {44,43,42,41,40,39,38};
		int[] vet3 = {31,32,33,34,99,98,97,96};
		System.out.println(Arrays.toString(qs.quick(vet1, 0, 9)));
		System.out.println(Arrays.toString(qs.quick(vet2, 0, 6)));
		System.out.println(Arrays.toString(qs.quick(vet3, 0, 7)));
	}
}
