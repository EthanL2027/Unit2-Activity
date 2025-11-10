public class Main {

   public static void main(String []args) {
      System.out.println("Welcome to the Magic 8 Ball! Ask me anything...");

      // Generate a random integer btwn 1-10
      double num = (int) (Math.random() * 10 + 1);
      System.out.println(num);

      double luck = Math.random();
      System.out.println(luck);

      // Conditional block to test the value of NUM
      if ( num == 10 ) {
         System.out.println("Not happening buddy");
            if (luck >= 0.5){

            }
            else if (luck < 0.5){
               System.out.println("LUCKY!");
            }
      }
      else if ( num == 9 ){
         System.out.println ("If you get lucky");
      }
      else if ( num == 8 ){
         System.out.println ("IN YOUR DREAMS!!");
      }
      else if ( num == 7 ){
         System.out.println ("YASSSSSSSSSSSSSSSSSSS");
      }
      else if ( num == 6 ){
         System.out.println ("HECK NOOOOOOOO!");
      }
      else if ( num == 5 ){
         System.out.println ("IT WILL HAPPEN... eventually");
      }
       else if ( num == 4 ){
         System.out.println ("It will happen... NEVER LOOSER!");
      }
      else if ( num == 3 ){
         System.out.println ("YESSSSSSSSSSS!");
      }
      else if ( num == 2 ){
         System.out.println ("Yes... and then you woke up IDIOT!");
      }
      else if ( num == 1 ){
         System.out.println ("Perhaps");
      }



   } // close main method
} // close class
