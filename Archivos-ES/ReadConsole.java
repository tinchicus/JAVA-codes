import java.io.*;

public class ReadConsole
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader cin = null;
		try
		{
			cin = new InputStreamReader(System.in);
			System.out.println("Ingresa Caracteres, 'q' para salir");
			char c;
			do
			{
				c = (char) cin.read();
				System.out.print(c);
			} while(c != 'q');
		}
		finally
		{
			if (cin != null) cin.close();
		}
	}
}
