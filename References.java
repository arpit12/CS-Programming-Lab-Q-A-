public class References
{
  static void f(References h) {
    System.out.println("h inside f(): " + h.toString());
  }
  
 

  public static void main(String[] args) {
    
    References p = new References();
    System.out.println("p inside main(): " + p.toString());
    f(p);
  }
}