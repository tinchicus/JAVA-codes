class Operador implements Runnable {
  Chat m;
  String[] s;
  String n;
  boolean f;
  Operador(Chat c, boolean e, String i, String[] t) {
     this.m = c;
     this.s = t;
     this.f = e;
     this.n = i;
     new Thread(this, "Dialogo").start();
  }
  public void run() {
     for(int i=0; i < s.length; i++)
        m.Dialogo(s[i], f, n);
  }
}
