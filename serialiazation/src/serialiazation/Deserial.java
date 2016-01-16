package serialiazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial 
{

	public static void main(String[] args)
	{
		try
		{
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("file.txt"));
		Serial s2=(Serial)oi.readObject();
		System.out.println(s2.rollNo);
		System.out.println("hi");

	}catch(IOException| ClassNotFoundException  e)
		{
		e.getMessage();
		}
	}

}
