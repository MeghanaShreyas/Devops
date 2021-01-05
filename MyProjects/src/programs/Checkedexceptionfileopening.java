package programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checkedexceptionfileopening {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("E:\\mysql\\meg.txt");			//Filenot found exception
		BufferedReader bfr= new BufferedReader(fr);
		System.out.println(bfr.readLine());								//IO exception
		Thread.sleep(5000);												//Interrupted exception
		System.out.println("I am done");
		

	}

}
