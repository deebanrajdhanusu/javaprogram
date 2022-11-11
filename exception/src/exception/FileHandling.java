package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws Throwable {
		try {
			File f=new File("C:\\Users\\SCLPT 020\\Desktop\\R@1.txt");
			FileReader fr=new FileReader(f);
			int temp=0;
			while((temp=fr.read())!=-1) {
				System.out.print((char)(temp));
				}
			}
		catch(Exception e) {
				System.out.println("unknown file");
			}

	}

}
