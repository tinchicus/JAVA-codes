public class ArgsVar
{
  public static void main(String args[])
  {
     maximo(100,3.5,2,1,54.4,15.5,20.6);
     maximo(10,6.3,new double[]{1,2,5,3,4});
  }

  static void maximo(int a, double b, double ... num )
  {
     if(num.length == 0)
     {
        System.out.println("Sin argumentos");
        return;
     }
     double res = 0;
     for(int i=0; i < num.length; i++)
     {
        if (num[i] > res)
          res = num[i];
     }
     System.out.println("a: " + a + " / b: " + b);
     System.out.println("El valor maximo es " + res);
  }
}
