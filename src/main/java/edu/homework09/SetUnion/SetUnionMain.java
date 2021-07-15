package edu.homework09.SetUnion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetUnionMain {

	public static <T> Set<T> unite(Set<T> set1, Set<T> set2) {
		Set<T> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}

	public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
		Set<T> result = new HashSet<T>(set1);
		result.retainAll(set2);
		return result;
	}

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 5, 7, 9, 13, 15, 18, 21);
		List<Integer> list2 = Arrays.asList(1, 4, 3, 6, 8, 9, 13, 14, 15, 17, 21);
		Set<Integer> set1 = new HashSet<>(list1);
		Set<Integer> set2 = new HashSet<>(list2);

		System.out.println(SetUnionMain.unite(set1, set2));
		System.out.println(SetUnionMain.intersect(set1, set2));

	}

}
