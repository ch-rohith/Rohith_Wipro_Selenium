package day_8_assignment;

import java.util.Vector;
public class SumElements
{
	static int sum(Vector<Integer> v)
	{
		int total = 0;
		for (int n : v) total += n;
		return total;
	}
	public static void main(String[] args)
	{
		Vector<Integer> v1 = new Vector<>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		Vector<Integer> v2 = new Vector<>(v1);
		System.out.println(v1.equals(v2));
		System.out.println(sum(v1));
	}
}
