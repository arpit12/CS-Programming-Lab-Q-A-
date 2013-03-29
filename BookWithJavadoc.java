public class BookWithJavadoc {
   private int itemCode;
   private String title;

  public BookWithJavadoc(int itemCode, String title1) {
    setItemCode(itemCode);	// constructor var itemCode is given to setTitle function. not class var.
    setTitle(title1);		// constructor var title1 is given to setTitle function.
  }							
  public BookWithJavadoc(String title) {
    setItemCode(0);
    setTitle(title);
  }
  public int getItemCode() {
    return itemCode;
  }
  public void setItemCode (int itemCode) {
    if (itemCode > 0) this.itemCode = itemCode; 
  }
   public String getTitle() {
    return title;
  }
   public void setTitle (String title1) {
    this.title = title1;
  }
  public void display() {
    System.out.println(itemCode + " " + title);
  }
}