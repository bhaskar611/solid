package android;

import java.io.*;

class Persist {
	public static void main(String args[])throws Exception{
		Student s1 =new Student(163,"mani");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\VARUN KUMAR\\eclipse-workspace\\Android_JAVA\\src\\android\\f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);

		out.writeObject(s1);
	    out.flush();

	 System.out.println("success");
 }
}