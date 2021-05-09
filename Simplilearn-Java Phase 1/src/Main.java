import java.io.File;

import java.util.Arrays;

import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner (System.in);
	static File file = new File ("C:\\Users\\danie\\eclipse-workspace\\Simplilearn\\Files");
	static String listofFiles[] = file.list();
	static boolean exit = true;
	

	public static void main(String[] args) throws Exception   {
		
		
		while(exit) {
			showMenu();
	
}
	System.out.println(" Application closed! ");
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	public static void showMenu() throws Exception  {
		
		System.out.println("******Simplilearn Assessment- Phase 1  ******* \n     ******Daniel Malkowski******     ");
		System.out.print("");
		System.out.print("");
		System.out.print("");
		System.out.println("Please choose one of the following options:");
		System.out.println("1 : Add a file to  directory");
		System.out.println("2 : Remove a file from  directory");
		System.out.println("3 : Search a file from  directory");
		System.out.println("4 : Show all files in  directory");
		System.out.println("5 : Close the application ");
		
		
		int input=scanner.nextInt();
		scanner.nextLine();
		
	   
		switch(input) {
		case  1 :
		
				useraddFile();
			
				break;
		case  2 :
				del();
				break;
		case  3 :
				search();
				break;
		case  4 :
			 	listallfiles();
			    break;
				
		case 5 :
				exit=false;
				break;
		 default : 
			 System.out.println("Invalid input , please choose options 1-4");
		}}
		
	
	/**
	 * 	
	 * @throws Exception
	 */
	public static void useraddFile() throws Exception {
		
	
	System.out.println("Please add a file... : ");	
	String path = scanner.nextLine();
	File ff = new File ("C:\\Users\\danie\\eclipse-workspace\\Simplilearn\\Files\\"+path);
	
		if(!ff.exists()) {
		if(ff.createNewFile()) {
			System.out.println("File has been succesfully created!");
			
			}
		
		}
		else {
			System.out.println("Folder already exists");
		}
		options();
		
}
	/**
	 * 
	 * @throws Exception
	 */
	public static void options() throws Exception {
	System.out.println("Return to main Menu ? y / n ");
	String option = scanner.nextLine();
	if(option.equalsIgnoreCase("y")) {
		showMenu();
	}else if (option.equalsIgnoreCase("n")) {
		System.exit(0);
	}else System.out.println("Invalid input, please choose y  or n  ! ");
	options();
	}
	
	public static void listallfiles() throws Exception{
		
		
		Arrays.sort(listofFiles);
		for(String s :listofFiles) {
		System.out.println(s);}
		options();
		}
	
		
		public static void del() throws Exception {
			System.out.println("Choose a file to delete");
			String filetoDelete = scanner.nextLine();
			File id= new File(file +"\\"+filetoDelete);
			if(id.delete()) {
				System.out.println("File succesfully deleted");
				
			}else System.out.println("File not found or unvalid filename ");
			options();
		
		
	}
		public static void search() throws Exception {
			System.out.println("Enter name of the file to be found ");
			String filename=scanner.nextLine();
			
			boolean found = Arrays.stream(listofFiles).anyMatch(filename::equalsIgnoreCase);
			if(found){
			    System.out.println("File found!");
			} else System.out.println("File not found!");
			options();
			
		}
}
	

	

	
