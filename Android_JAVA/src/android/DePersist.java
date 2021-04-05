package android;

import java.io.*;
class DePersist{
 public static void main(String args[])throws Exception{
  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\VARUN KUMAR\\\\eclipse-workspace\\\\Android_JAVA\\\\src\\\\android\\\\f.txt"));
  Student s=(Student) in.readObject();
  System.out.println(s.id+" "+s.name);

  in.close();
 }
}