package corejava;
import java.io.*;
import java.util.*;
public class ExeceptionExample2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the name");
			String name = br.readLine();
			System.out.println("The name is :"+name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
