package lockedMe;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;


public class mainFile {

	public static void main(String[] args) throws IOException {
					HandleFiles.welcomeScreen();			
				}
					
			public static void selectOptions() {
				String[] arr = {
						"1. Add a File",
						"2. Delete a File",
						"3. Search a File",
						"4. Exit"
				};

				int[] arr1 = {1,2,3,4};
				
				for(int i=0; i < arr1.length; i++) {
					System.out.println(arr[i]);
				};
	}

}
