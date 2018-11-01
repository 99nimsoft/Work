
class Dog3{
	
	public static void main(String[] args) {
		
		String a = "This Is my India";
		System.out.println(m1(a));
	}
	
	static String m1(String a){
		String temp="";
		char[] tmp = a.toCharArray();
		for(int i = tmp.length-1;i>=0;i--){
			temp += tmp[i];
		}
		return temp;
	}
}