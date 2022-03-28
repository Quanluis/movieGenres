package movieGenres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProcessMovieFiles {
	
	// Global variables
	
	public String file = "src/movieGenres/movies.txt";
	
	public String dramaMovies;
	public String adventureMovies;
	public String warMovies;
	public String romanceMovies;
	public String thrillerMovies;
	public String fantasyMovies;
	public String scifiMovies;
	
	
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
				
				if(processTwo.movies.get(i).contains("Sci Fi")){
					
					processTwo.movieGenreSciFi.add(processTwo.movies.get(i));
				
					
				} else if (processTwo.movies.get(i).contains("Adventure")) {
					
					processTwo.movieGenreAdventure.add(processTwo.movies.get(i));
					

				} else if (processTwo.movies.get(i).contains("Drama")) {
					
					processTwo.movieGenreDrama.add(processTwo.movies.get(i));
					
				}	
				  else if (processTwo.movies.get(i).contains("War")) {
					  
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
		
			String input = "Enter a Genre: \n"
							+ "1: Adventure\n2: Drama \n3: War \n4: Romance \n5: Thriller \n6: Fantasy \n7: Sci-Fi \n8: Exit";
			
			
			String option = JOptionPane.showInputDialog(null, input);
			
			
			int choice = Integer.parseInt(option);
			
			switch (choice) {
				case 1: 
					
					int adventureLength = processTwo.movieGenreAdventure.size();
					
					for(int i = 0; i < adventureLength; ++i) {
					
					adventureMovies += "\n" + processTwo.movieGenreAdventure.get(i);
						
					};
					
					String output1 = "Director: " + process.creators.get(0) + "\n"
							+ "Composer: " + process.creators.get(1) + "\n\n"
							
							+ "Genres: " + "Adventure"  + "\n\n"
							+ "Movie Title:   " + "Year Released:   " + "Rating: \n" +
							adventureMovies;

					JOptionPane.showMessageDialog(null, output1);
						
				break;
				case 2: 

					int dramaLength = processTwo.movieGenreDrama.size();
					
					for(int i = 0; i < dramaLength; ++i) {
					
					dramaMovies += "\n" + processTwo.movieGenreDrama.get(i);
						
					};
					
					String output2 = "Director: " + process.creators.get(0) + "\n"
							+ "Composer: " + process.creators.get(1) + "\n\n"
							
							+ "Genres: " +  "Drama" + "\n\n"
							+ "Movie Title:   " + "Year Released:   " + "Rating: \n" +
							dramaMovies;

					JOptionPane.showMessageDialog(null, output2);
					
					
				break;
				case 3:
					
					int warLength = processTwo.movieGenreWar.size();
					
					for(int i = 0; i < warLength; ++i) {
					
					warMovies += "\n" + processTwo.movieGenreWar.get(i);
						
					};
					
					String output3 = "Director: " + process.creators.get(0) + "\n"
							+ "Composer: " + process.creators.get(1) + "\n\n"
							
							+ "Genres: " +  "War"  + "\n\n"
							+ "Movie Title:   " + "Year Released:   " + "Rating: \n" +
							warMovies;

					JOptionPane.showMessageDialog(null, output3);
					
				break;
				case 4:
					
					int romanceLength = processTwo.movieGenreRomance.size();
					
					for(int i = 0; i < romanceLength; ++i) {
					
					romanceMovies += "\n" + processTwo.movieGenreRomance.get(i);
						
					};
					
					String output4 = "Director: " + process.creators.get(0) + "\n"
							+ "Composer: " + process.creators.get(1) + "\n\n"
							
							+ "Genres: " +  "Romance" + "\n\n"
							+ "Movie Title:   " + "Year Released:   " + "Rating: \n" +
							romanceMovies;

					JOptionPane.showMessageDialog(null, output4);
					
				break;
				case 5:
					
					int thrillerLength = processTwo.movieGenreThriller.size();
					
					for(int i = 0; i < thrillerLength; ++i) {
					
					thrillerMovies += "\n" + processTwo.movieGenreThriller.get(i);
						
					};
					
					String output5 = "Director: " + process.creators.get(0) + "\n"
							+ "Composer: " + process.creators.get(1) + "\n\n"
							
							+ "Genres: " +  "Thriller" + "\n\n"
							+ "Movie Title:   " + "Year Released:   " + "Rating: \n" +
							thrillerMovies;

					JOptionPane.showMessageDialog(null, output5);
					
				break;
				case 6:
					
					int fantasyLength = processTwo.movieGenreFantasy.size();
					
					for(int i = 0; i < fantasyLength; ++i) {
					
					fantasyMovies += "\n" + processTwo.movieGenreFantasy.get(i);
						
					};
					
					String output6 = "Director: " + process.creators.get(0) + "\n"
							+ "Composer: " + process.creators.get(1) + "\n\n"
							
							+ "Genres: " +  "Fantasy" + "\n\n"
							+ "Movie Title:   " + "Year Released:   " + "Rating: \n" +
							fantasyMovies;

					JOptionPane.showMessageDialog(null, output6);
					
				break;
				case 7:
					
					int scifiLength = processTwo.movieGenreSciFi.size();
					
					for(int i = 0; i < scifiLength; ++i) {
					
					scifiMovies += "\n" + processTwo.movieGenreSciFi.get(i);
						
					};
					
					String output7 = "Director: " + process.creators.get(0) + "\n"
							+ "Composer: " + process.creators.get(1) + "\n\n"
							
							+ "Genres: " +  "Sci Fi" + "\n\n"
							+ "Movie Title:   " + "Year Released:   " + "Rating: \n" +
							scifiMovies;

					JOptionPane.showMessageDialog(null, output7);
					
				break;
				case 8:
					System.exit(1);
				break;
			}
			
//			JOptionPane.showMessageDialog(null, output);
			
			run.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

		
	}



