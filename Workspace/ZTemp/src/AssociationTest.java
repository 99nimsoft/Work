
public class AssociationTest {

	public static void main(String[] args) {
		Movie m = new Movie("Matrix");
		Actor a = new Actor("Reeves");
		
		System.out.println(a.getActorName()+" is actor in "+m.getMovieName());
	}

}


class Movie{
	private String movie;
	
	Movie(String movie){
		this.movie=movie;
	}
	public String getMovieName(){
		return this.movie;
	}
	
}

class Actor{
	private String actor;
	
	Actor(String actor){
		this.actor=actor;
	}
	public String getActorName(){
		return this.actor;
	}
}