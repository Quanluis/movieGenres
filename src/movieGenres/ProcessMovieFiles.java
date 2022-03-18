package movieGenres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProcessMovieFiles {
	
	// Global variables
	
	public String file = "src/movieGenres/movies.txt";
	
	
	// Methods
	
	public void runThroughFile() {
		
		Creators process = new Creators();
		movies processTwo = new movies();
		
		
		try {
			
			File movieFile = new File(this.file);
			Scanner run = new Scanner(movieFile);
			
			// Adds the creators of the list to the Creators ArrayList
			
			process.creators.add(run.nextLine());
			process.creators.add(run.nextLine());
		
			
			// Runs through the text file on each line

			while(run.hasNext()) {
				
		
			processTwo.movies.add(run.nextLine());
			
			}
			
			int length = processTwo.movies.size();
			
			for(int i =0; i < length; i++) {
	
				
				System.out.println(processTwo.movies.get(i));
	
				
			}
			
			String output = "Director: " + process.creators.get(0) + "\n"
					+ "Composer: " + process.creators.get(1) + "\n\n"
					
					+ "Genres: " +  null + "\n\n"
					+ "Movie Title:   " + "Year Released:   " + "Rating: " ;
			
			
			JOptionPane.showMessageDialog(null, output);
			
			//System.out.println(processTwo.movieGenreWar);
			
			
			run.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}



