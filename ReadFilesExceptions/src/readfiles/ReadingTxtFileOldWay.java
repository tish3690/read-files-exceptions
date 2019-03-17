package readfiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTxtFileOldWay {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileReader fr = new FileReader("Numbers.txt");  //if not in the same package, show the path to it
		
		BufferedReader br = new BufferedReader(fr);  //reads line by line
		
//		System.out.println(br.readLine());  //readLine throws IOException
		
//		for(int i = 1; i <= 1000; i++) {
//			System.out.print(i + "-");
//			System.out.println(br.readLine());
//		}
		
		String line = "";
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
		fr.close();
	}

}
