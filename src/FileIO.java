package src;

import java.io.*;

public class FileIO {
	
	//read files
	public static String FileIO(String filepath) throws Exception{
		File fpath = new File(filepath);
		BufferedReader br = new BufferedReader(new FileReader(fpath));
		String output = "" ;
		String st;
		while ((st=br.readLine()) != null) {
			output += st;
		}
		br.close();
		return output;
	}
	
	//write files
	public static void FileIO(String filepath, String content){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));
			bw.write(content);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//list files in a directory
	public static String[] listfile(String folderpath){
		File folder = new File(folderpath);
		String[] files = folder.list();
		for (String file: files) {
			System.out.println(file);
		}
		return files;
	}
	

	public static void main(String[] args) throws Exception {
		//write a file
		FileIO("text/test.txt", "This a test file.");
		
		//list files in a directory/		listfile("text");
		
		//read file
		System.out.println(FileIO("text/test.txt"));
	}
}