import java.io.*;

public class Archivos
{
  public static void main(String[] args)
  {
  try
  {
     String dirs = "./test";
     String archivos;
     File d = new File(dirs);
     d.mkdirs();
     for(int i=0; i < 3; i++)
     {
        archivos = dirs + "/archivo" + i + ".txt";
        OutputStream sal = new FileOutputStream(archivos);
        sal.close();
     }
     String[] contenido = d.list();
     for(String cont : contenido)
        System.out.println(cont);
  }
  catch(IOException e)
  {
     System.out.println("Oh no! Algo ocurrio!!!");
  }
  }
}
