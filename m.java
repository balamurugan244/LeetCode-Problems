 class Developer extends Employee {
   void code(){
    System.out.println("Developer is coding");
   }
 }
 public class m{
    public static void main(String[] args) {
        Developer d= new Developer();
        d.work();
        d.code();
    }
 }