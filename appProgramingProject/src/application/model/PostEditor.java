package application.model;

import java.io.*;
import java.util.*;

public class PostEditor{
	
	//checks if database.txt exists and creates it if not
	public void fileSetup() throws IOException {
		
		File database = new File("database.txt");
		
		if(database.createNewFile()) {
			System.out.println("database file successfully created");
		}
		else {
			System.out.println("database file already exists");
		}
		
	}
	
	//formats username and tweet and then writes to database.txt
	public void sendTweet(String tweet, String username) throws IOException {
		
		File database = new File("database.txt");
		
		//formats string and checks if max char(120)
		String formatted = username.trim() + "," + tweet.trim() + "\n";
		if (formatted.length() > 120) {
			formatted = formatted.substring(0,120);
		}
		
		//appends to database.txt
		FileWriter file = new FileWriter(database, true);
		
		file.write(formatted);
		file.close();
		
	}
	
	//reads database.txt into string arraylist and then returns info to be displayed
	//as a string
	public String readTweet() throws FileNotFoundException {
		
		ArrayList<String> tweets = new ArrayList<String>();
		
		File database = new File("database.txt");
		Scanner sc = new Scanner(database);
		
		//reads database.txt into arraylist
		while(sc.hasNext()) {
			tweets.add(sc.nextLine());
		}
		
		//formats data for displaying in text area
		String formatted = "";
		for(int i = 0; i < tweets.size(); i++) {
			
			String raw = tweets.get(i);
			String[] arr = raw.split(",",2);
			
			String processed = "@" + arr[0] + " - \n"  + arr[1] + "\n" + "- - - - - - - - - - -\n";
			formatted = formatted + processed;
		}
		
	
		sc.close();
		
		//returns formatted string
		return formatted;
	}
}
