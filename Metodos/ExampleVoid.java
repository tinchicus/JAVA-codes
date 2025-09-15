public class ExampleVoid
{

        public static void main(String[] args)
        {
                metodoRankPuntos(255.7);
        }

        public static void metodoRankPuntos(double puntos)
        {
                if (puntos >= 202.5)
                {
                        System.out.println("Rank A1");
                }
                else if (puntos >= 122.4)
                {
                        System.out.println("Rank A2");
                }
                else
                {
                        System.out.println("Rank A3");
                }
        }
}
