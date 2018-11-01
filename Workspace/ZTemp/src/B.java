import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B{
	
	public static void main(String[] args) {
		String[] arr1 = {"gaurav","saurav","neena","Atul","saurav","Atul","neena"};
		List<String> list2 = Arrays.asList(arr1);
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(list2);
		countFrequencies(list);
		System.out.println("-----------------------------------------");
		Integer[] arr2 = {1,3,6,9,3,1,6,4,1};
		List<Integer> listTemp = Arrays.asList(arr2);
		ArrayList<Integer> listFinal = new ArrayList<Integer>();
		listFinal.addAll(listTemp);
		countFrequencies(listFinal);
	}
	
	public static <T> void countFrequencies(ArrayList<T> list){
		
		HashMap<T,Integer> hm = new HashMap<T,Integer>();
		
		for(T i : list){
			Integer tmp = hm.get(i);
			hm.put(i,(tmp==null)?1:tmp+1);
		}
		
		for(Map.Entry<T,Integer> map : hm.entrySet()){
			System.out.println(map.getKey()+" Number of times "+map.getValue());
		}
	}
}