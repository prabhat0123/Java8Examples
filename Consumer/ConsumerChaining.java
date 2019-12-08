package Consumer;

import java.util.function.Consumer;

public class ConsumerChaining {
	
	public static void main(String[] args) {

		Consumer<Movie2019> conName = movie-> System.out.println("Movie name is : "+movie.name);
		Consumer<Movie2019> conResult = movie-> System.out.println("Movie Result is : "+movie.result);
		Consumer<Movie2019> conStor = movie-> System.out.println("Movie stored to db: "+movie);
		
		Movie2019 movie = new Movie2019("ABC","HIT");
		conName.andThen(conResult).andThen(conStor).accept(movie);
		
	}

}


class Movie2019{
	public String name;
	public String result;
	public Movie2019(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}
	@Override
	public String toString() {
		return "Movie2019 [name=" + name + ", result=" + result + "]";
	}
	
	
	
}