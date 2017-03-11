import java.io.*;

public class Serializare {

	public static void main(String[] args) {
		Employee e = new Employee();
	      e.name = "Arnold Schwarzenegger";
	      e.address = "3110 Main St Ste 300, Santa Monica";
	      e.SSN = 11122333;
	      e.number = 101;
	      
	      try {
	         FileOutputStream fileOut = new FileOutputStream("Ex1.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Datele serializate sunt salvate in Ex1.ser");
	      }catch(IOException i) {
	         i.printStackTrace();
	      }

	}

}
