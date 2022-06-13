package lockedMe;

import java.io.File;
import java.util.Scanner;

public class HandleFiles {

	public static void welcomeScreen() {
		int input;
		Scanner sc = new Scanner(System.in);
		Boolean run = true;
		while(run = true) {
			
		System.out.println("Welcome to Company Locker Pvt Ltd");
		System.out.println("Developer Name: " + "Mandar Garve" );
		System.out.println("Press 1 to get the File Names from the Directory in Sorted Manner");
	    System.out.println("Press 2 For Business level Operations");
	    System.out.println("Press 3 to Close the Application");
		
		input = sc.nextInt();
		
		switch (input) {

		case 1:
		System.out.println("File names from the current Directory");
		File currFile = new File("E:\\Main Project");
		
		  File[] listOfFiles = currFile.listFiles();
           int count = currFile.list().length;
           for (int i = 0; i < count; i++) {
                if (listOfFiles[i].isFile()) {
                    System.out.println(listOfFiles[i].getName());
                } else if (listOfFiles[i].isDirectory()) {
                    System.out.println(listOfFiles[i].getName());
                }
            }	
		break;
		
		case 2:
		System.out.println("Business level Operations \n");
		int input2;
		boolean running = true;
		mainFile.selectOptions();
		
		while(running = true) {
			
			input2 = sc.nextInt();
			switch(input2) {
			case 1:
				// File add
				System.out.println("Enter the name of the file to Add \n");
				
				Operations.addFile();
				mainFile.selectOptions();
				break;
				
			case 2:
				// Remove File 
				System.out.println("Enter File name to remove \n");
				Operations.remove();
				mainFile.selectOptions();
				break;
				
			case 3:
				// Search File
				System.out.println("Search Your File Here \n");
				Operations.searchFile();
				mainFile.selectOptions();
				break;
				
			case 4:
				// Exit
				System.out.println("Redirecting the the Maun Menu \n");
				running = false;
				welcomeScreen();
				break;
			}
		}
		break;
		
		case 3:
	        System.out.println("Closing the Application");
            run = false;
        	System.exit(0);
            
        default: 
        	System.out.println("Please Enter a valid option");
        	break;
       
		}							
		}							
	}
}
