package serialiazation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial 
{
	int rollNo=10;
	String studentName="vaas";

	public static void main(String[] args) 
	{
		try
		{
	Serial s=new Serial();
	FileOutputStream fi=new FileOutputStream("file.txt");
	ObjectOutputStream ob=new ObjectOutputStream(fi);
	ob.writeObject(s);

	
		}catch(NullPointerException | ArithmeticException | IOException e)
		{
			
		}
	}

}
