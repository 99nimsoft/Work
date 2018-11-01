import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A{
	
	public static void main(String[] args) {
		
		Integer[] arr = {3,3,3,3,4,6,1,4,9,3,7,4,3,4};
		checkIt(Arrays.asList(arr));
	}
	
	static void checkIt(List<Integer> list){
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(Integer i : list){
			Integer tmp = hm.get(i);
			hm.put(i,(tmp==null)?1:tmp+1);	
		}
		
		for(Map.Entry<Integer,Integer> m : hm.entrySet()){
			System.out.println(m.getKey()+"::"+m.getValue());
		}
		
	}
	
}


class mahList{
	
	Object[] arr;
	int size;
	
	mahList(){
		arr = new Object[10];
	}
	
	public void add(Object o){
		validatecapacity(size+1);
		arr[size++]=o;
	}
	
	public void validatecapacity(int tmp){
		if(tmp>arr.length){
			int sze = (((arr.length*3)/2))+1;
			arr=Arrays.copyOf(arr,sze);
		}
	}
	
	public Object get(int index){
		return arr[index];
	}
}