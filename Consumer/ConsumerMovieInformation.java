package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMovieInformation {
	
	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<>();
	
		movies.add(new Movie("Movie-1","Hero-1","Heroein-1"));
		movies.add(new Movie("Movie-2","Hero-2","Heroein-2"));
		movies.add(new Movie("Movie-3","Hero-3","Heroein-3"));
		movies.add(new Movie("Movie-4","Hero-4","Heroein-4"));
		
		Consumer<Movie> con = (movie) -> {
			System.out.println(movie.name);	
			System.out.println(movie.hero);	
			System.out.println(movie.heroein);
			System.out.println("-------");
		};
		for(Movie movie:movies ) {
			con.accept(movie);
		}
		
	}

}


class Movie {
	String name;
	String hero;
	String heroein;
	
	public Movie(String name, String hero, String heroein) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroein = heroein;
	}
}