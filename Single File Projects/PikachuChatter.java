// PikachuChatter calls on methods to output text
public class PikachuChatter {

   public static void main (String[] args) {
      // calls pikachu method with argument
      pikachu("Pika pika pika chu pika chu peeeee ka pika chu!");
      pikachu("Pika? Pika pika pika chu peeeee ka chu!");
   }

   // parameter is in pikachu method
   public static void pikachu(String dialogue) {
      // code to be executed when called upon
      System.out.println(dialogue);
      System.out.println("(\\__/)");
      System.out.println("(o^.^)");
      System.out.println("z(_(\")(\")");
      System.out.println("");
   }
}