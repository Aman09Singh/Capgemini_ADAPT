import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class MovieDetails {
    private String movieName;
    private String actor;
    private String actress;
    private String genre;
    public MovieDetails() {
    	
    }
	public MovieDetails(String movieName, String actor, String actress, String genre) {
		super();
		this.movieName = movieName;
		this.actor = actor;
		this.actress = actress;
		this.genre = genre;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/*@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", actor=" + actor + ", actress=" + actress + ", genre=" + genre
				+ "]";
	}*/
    
	
}
class compareClass implements Comparator<MovieDetails>{

	@Override
	public int compare(MovieDetails arg0, MovieDetails arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class Assignment3Q10 {
	public static ArrayList<MovieDetails> md = new ArrayList<MovieDetails>();
    public static void main(String[] args) {
    	/*MovieDetails m1 = new MovieDetails("Titanic","Leonardo","Rose","History");
    	MovieDetails m2 = new MovieDetails("The Hobbit","Bilbo baggins","Emo","Fantasy");
    	MovieDetails m3 = new MovieDetails("Upside Down","Jim","Kristen","Fantasy");
    	MovieDetails m4 = new MovieDetails("Iron-man","Robert","Evadki tesulu","Sci-Fi");
    	MovieDetails m5 = new MovieDetails("SpiderMan","Tobey Marguire","Kristen","Fantasy");
    	MovieDetails m6 = new MovieDetails("Superbad","Jonah Hill","Emma Stone","Comedy");
    	MovieDetails m7 = new MovieDetails("Wrong Turn","Desmond","Eliza","History");
    	md.add(m1);
    	md.add(m2);
    	md.add(m3);
    	md.add(m4);
    	md.add(m5);
    	md.add(m6);
    	md.add(m7);*/
    }

    public static void sort(ArrayList<MovieDetails> movieDetails,Comparator<MovieDetails> movieDetailsComparator){
    	movieDetails.sort(movieDetailsComparator);
    }

    public static void printSortedMovieList(ArrayList<MovieDetails> movieDetails){
    	for(MovieDetails mds: movieDetails) {
    		System.out.println(mds);
    	}
    }
    public void addMovie(MovieDetails movie) {
    	md.add(movie);
    }

    public void removeMovies(String movieName) {
    	Iterator<MovieDetails> it = md.iterator();
    	MovieDetails rmObj = null;
    	while(it.hasNext()) {
    		rmObj = it.next();
    		String Name = rmObj.getMovieName();
    		if(Name.equals(movieName)) {
    			break; 
    		}
    	}
    	if(rmObj != null)
    	    md.remove(rmObj);
    }

    public void removeAllMovies(List<MovieDetails> movies) {
    	md.removeAll(movies);
    }

    public MovieDetails find_movie_By_mov_Name(String movieName) {
    	Iterator<MovieDetails> it = md.iterator();
    	MovieDetails fdObj = null;
    	while(it.hasNext()) {
    		fdObj = it.next();
    		String movName = fdObj.getMovieName();
    		if(movieName.equals(movName)) {
    			break;
    		}
    	}
    	return fdObj;
    }

    public List<MovieDetails> find_movie_By_Genre(String genre) {
    	List<MovieDetails> genreBased = new ArrayList<>();
    	Iterator<MovieDetails> it = md.iterator();
    	MovieDetails fdObj = null;
    	while(it.hasNext()) {
    		fdObj = it.next();
    		String gen = fdObj.getGenre();
    		if(fdObj.equals(gen)) {
    			genreBased.add(fdObj);
    		}
    	}
    	return genreBased;
    	
    }
}