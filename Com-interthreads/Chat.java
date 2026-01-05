class Chat {
  boolean flag = false;
  public synchronized void Dialogo(String msn, boolean std, String sjt) {
     if (flag == std) {
        try {
           wait();
        }
        catch(InterruptedException e) {
           e.printStackTrace();
        }
     }
     System.out.println(sjt + ": " + msn);
     flag = std;
     notify();
  }
}
