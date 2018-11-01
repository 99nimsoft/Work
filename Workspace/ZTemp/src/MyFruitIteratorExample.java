public class MyFruitIteratorExample {
    public static void main(String[] args) {
        
        MyOwnArrayList fruitList = new MyOwnArrayList();
        fruitList.add("Mango");
        fruitList.add("Strawaberry");
        fruitList.add("Papaya");
        fruitList.add("Watermalon");
        
        for(int i=0;i<fruitList.size();i++){
        	System.out.println(fruitList.get(i));
        }
    }
}