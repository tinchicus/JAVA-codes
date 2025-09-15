public class Este
{

  int num = 10;
  Este()
  {
     System.out.println("Ejemplo de this.");
  }
  Este(int num)
  {
     this();
     this.num = num;
  }
  public void saludar()
  {
     System.out.println("Bienvenido a tinchicus.com");
  }
  public void imprimir()
  {
     int num = 20;
     System.out.println("local num = " + num);
     System.out.println("instancia num = " + this.num);
     this.saludar();
  }

  public static void main(String[] args)
  {
     Este o1 = new Este();
     o1.imprimir();
     Este o2 = new Este(30);
     o2.imprimir();
  }

}
