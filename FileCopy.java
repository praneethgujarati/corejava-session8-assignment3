/* Assignment 8.3: Program for file copy.
   Destination file should have same contents as Source file.
*/

import java.io.*;	// Importing java io files
class FileCopy {
	public static void main(String[] args) throws IOException {	// throws IOException to show it has IO exception
		try {
			File infile = new File(args[0]);	// Input file passed via argument 0 at command line
			FileInputStream in = new FileInputStream(infile);
			File otfile = new File(args[1]);	// Input file passed via argument 1 at command line
			FileOutputStream ot = new FileOutputStream(otfile);
			int rd;

			while ((rd = in.read()) != -1)
			{
				ot.write((byte)rd);
			}
			System.out.println("File copied successfully!");
		} catch (Exception e){System.out.println(e);}	// catch any exceptions and display on command prompt
	}
}

/*
Command line:
java FileCopy "c:\testfile.txt" "c:\output.txt"
File copied successfully!
*/