public class swappingExample
{
        public static void main(String[] args)
        {
                int a = 30;
                int b = 45;
                System.out.println("Antes de cambiarlo, a = "
                                 + a + " y b = " + b);
                funcionSwap(a,b);
                System.out.println(
                        "\n**Ahora antes y despues del cambio los" +
                        " valores seran los mismos**");
                System.out.println("Despues del cambio, a = "
                        + a + " y b = " + b);
        }

        public static void funcionSwap(int a, int b)
        {
                System.out.println(
                        "Antes del cambio(Dentro), a = " + a
                        + " y b = " + b);
                int c = a;
                a = b;
                b = c;
                System.out.println(
                        "Despues del cambio(Dentro), a = " + a
                        + " y b = " + b);
        }
}
