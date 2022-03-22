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
	
				// Find war movies and put them into separate ArrayList 
				
				if(processTwo.movies.get(i).contains("Sci Fi") == true){
					
				//	System.out.println(processTwo.movies.get(i));
					
					processTwo.movieGenreSciFi.add(processTwo.movies.get(i));

				} else if (processTwo.movies.get(i).contains("Adventure") == true) {
					
					processTwo.movieGenreAdventure.add(processTwo.movies.get(i));
					

				} else if (processTwo.movies.get(i).contains("Drama") == true) {
					
					processTwo.movieGenreDrama.add(processTwo.movies.get(i));
					
				}	
				  else if (processTwo.movies.get(i).contains("War") == true) {
					  
					  processTwo.movieGenreWar.add(processTwo.movies.get(i));
  	
				}
				  else if (processTwo.movies.get(i).contains("Romance")) {
					  
					  
					  processTwo.movieGenreRomance.add(processTwo.movies.get(i));

				}
				  else if(processTwo.movies.get(i).contains("Thriller")) {
					  
					  processTwo.movieGenreThriller.add(processTwo.movies.get(i));
					  
				}
				  else if (processTwo.movies.get(i).contains("Fantasy")) {
					  
					  processTwo.movieGenreFantasy.add(processTwo.movies.get(i));

				  }
				
			}
	
	
			String output = "Director: " + process.creators.get(0) + "\n"
					+ "Composer: " + process.creators.get(1) + "\n\n"
					
					+ "Genres: " +  null + "\n\n"
					+ "Movie Title:   " + "Year Released:   " + "Rating: " ;
			
			String input = "Enter a Genre: \n"
							+ "1: Adventure\n2: Drama \n3: War \n4: Romance \n5: Thriller \n6: Fantasy \n7: Exit";
			
			
			String option = JOptionPane.showInputDialog(null, input);
			
			
			int choice = Integer.parseInt(option);
			
			switch (choice) {
				case 1: 
					System.out.println(processTwo.movieGenreAdventure);			
				break;
				case 2: 
					System.out.println(processTwo.movieGenreDrama);
				break;
				case 3:
					System.out.println(processTwo.movieGenreWar);
				break;
				case 4:
					
					processTwo.trimRomance();
					
				break;
				case 5:
					System.out.println(processTwo.movieGenreThriller);
					
				break;
				case 6:
					System.out.println(processTwo.movieGenreFantasy);
				break;
				case 7:
					System.exit(1);
				break;
			}
			
			JOptionPane.showMessageDialog(null, output);
			
			run.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

		
	}



