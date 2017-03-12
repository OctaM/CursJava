public class Main 
{
	public static void main(String args[])
	{
		int numitor, numarator;
		
		try
		{
			numitor = 0;
			numarator = 10 / numitor;
			System.out.println("S-a efectuat impartirea. Rezultatul este " + numarator);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Nu se poate imparti un numar la zero.");
		}
	}
}
