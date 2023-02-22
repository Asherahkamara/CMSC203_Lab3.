import java.util.Scanner;

public class MovieDriver 
{
	public static void main(String[] args) 
	{   //movie object
		Movie objectMovie=new Movie();
		// scanner object 
		Scanner userInput=new Scanner(System.in);
		// string for movie title 
		String theMovieTitle;
		//string for the movie rating
		String ratingOfMovie;
		//string for response
		String reply;
		// while loop for user input
		while(true) 
		{	//display message to user
			System.out.println("Please enter the name of the movie ");			
			
			//store the input 
			theMovieTitle=userInput.nextLine();
			
			//call setTitle method 
			objectMovie.setTitle(theMovieTitle);
			
			//ask user for movie rating
			System.out.println("Please enter the rating of the movie. (G, PG,PG13,R) ");
			
			// store input
			ratingOfMovie=userInput.nextLine();
			
			// uses the movie object to call the set rating method 
			objectMovie.setRating(ratingOfMovie);
			
			// ask user for number of tickets sold
			System.out.println("Enter the number of tickets that were sold for this movie? ");
			
			// create movie ticket int and sets to what the return of the parseInt
			int movieTickets=Integer.parseInt(userInput.nextLine());
			

				objectMovie.setSoldTickets(movieTickets);
			
			System.out.println(objectMovie.toString());
			
			System.out.println("\nWant to enter another movie? (yes or no)");
			
			reply=userInput.nextLine();
			
			if(reply.equalsIgnoreCase("YES"))
			//sends the program back to the beginning of the while loop	
			continue;
			// ends the program 
			else
			break;
		}
		System.out.println("Thank you and goodbye");
	}

}
	