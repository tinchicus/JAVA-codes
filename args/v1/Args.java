public class Args
{
  public static void main(String[] args)
  {
     for(int i=0, j=1; i < args.length; i++, j++)
        System.out.println("arg #" + j + ": " + args[i]);
  }
}
