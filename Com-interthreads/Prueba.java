public class Prueba {
  public static void main(String[] args) {
     Chat m = new Chat();
     String[] s1 = {"Hola","Como estas?","yo tambien"};
     String[] s2 = {"Holis","Estoy bien y vos?","Buenisimo"};

     new Operador(m, true, "Operador 1", s1);
     new Operador(m, false, "Operador 2", s2);
  }
}
