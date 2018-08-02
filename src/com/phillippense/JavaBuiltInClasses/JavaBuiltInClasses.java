package com.phillippense.JavaBuiltInClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class JavaBuiltInClasses {

	public static void main(String[] args) throws Exception {
		
		String[] songs = new String[5];
				songs[0] = "Rock With You";
				songs[1] = "Smooth Criminal";
				songs[2] = "Wanna Be Startin' Something";
				songs[3] = "Thriller";
				songs[4] = "Beat It";
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < songs.length; i++) {
			sb.append(songs[i]);
			sb.append(", ");
		}
		System.out.println(sb);
		
		String fileContentsRead = "";

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("songs.txt"));
			for(String line : songs) {
			writer.write(line);
			writer.newLine();
			}
			writer.close();
			
			BufferedReader in = new BufferedReader(new FileReader("songs.txt"));
			String line = in.readLine();
			while(line != null) {
				System.out.println(line);
				line = in.readLine();
			}
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
