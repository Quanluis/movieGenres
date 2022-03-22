package movieGenres;

import java.util.ArrayList;

public class movies extends Creators {
	
	ArrayList<String> movies = new ArrayList<>();
	ArrayList<String> movieGenreWar = new ArrayList<>();
	ArrayList<String> movieGenreThriller = new ArrayList<>();
	ArrayList<String> movieGenreSciFi = new ArrayList<>();
	ArrayList<String> movieGenreRomance = new ArrayList<>();
	ArrayList<String> movieGenreAdventure = new ArrayList<>();
	ArrayList<String> movieGenreDrama = new ArrayList<>();
	ArrayList<String> movieGenreFantasy = new ArrayList<>();
	
	
	public String movieTitle;
	public String yearReleased;
	public String Genre;
	public String rating;
	
	
	public void trimRomance() {
		
		
		//
		System.out.println("Output" + movieGenreRomance.get(0));
		System.out.println(movieGenreRomance);
		
	}
	
}
