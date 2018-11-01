import java.util.ArrayList;
import java.util.List;

public class checkComposition {

	public static void main(String[] args) {
		Animals a1 = new Animals("Lion");
		Animals a2 = new Animals("Tiger");
	    List<Animals> anmls = new ArrayList<Animals>();
	    anmls.add(a1);
	    anmls.add(a2);
	    
	    Jungle jungle = new Jungle(anmls);

	    List<Animals> itr= jungle.getCount();
	    for(Animals a : itr){
	    	System.out.println(a);
	    }
	}

}

class Jungle {

	// A jungle cant exist without Animals 
	List<Animals> animals;
	
	Jungle(List<Animals> animals) {
		this.animals=animals;
	}
	public List<Animals> getCount(){
		return animals;
	}
}


class Animals {

private String nameAnimal;
	
	Animals(String nameAnimal){
		this.nameAnimal=nameAnimal;
	}
	public String toString(){
		return nameAnimal;
	}
}
