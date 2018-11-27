import java.util.ArrayList;

public class ArrayListDemo{

	public static ArrayList<Integer> combine(ArrayList<Integer> one, ArrayList<Integer> two){

		ArrayList<Integer> combined = new ArrayList<Integer>();
		for(int i=0; i<one.size(); i++){
			combined.add(one.get(i));
		}
		for(int i=0; i<two.size(); i++){
			combined.add(two.get(i));
		}
		return combined;
}
	public static void print(ArrayList<Integer> list){

		for(int i=0; i<list.size(); i++)
			if(list.size()-1 == i)
				System.out.print(list.get(i));
			else
			System.out.print(list.get(i)+", ");

			System.out.println();
}

	public static void main(String [] args){

		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();

		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		b.add(1);

		System.out.println(combine(a,b));
		print(a);








	}
}