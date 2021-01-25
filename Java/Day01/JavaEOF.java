/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class JavaEOF
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 1;
		while(sc.hasNext()){
    		System.out.println("Line "+counter+":" + " " + sc.nextLine());
    		counter++;
		}
	}

}
