// *******************************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest
{
        // -------------------------------------------------
        // main prints some expressions using the + operator
        // -------------------------------------------------
        public static void main (String[] args)
        {
         // I predict this will successfully join both parts of the sentence
         // I was correct
         System.out.println ("This is a long string that is the " +
                                 "concatenation of two shorter strings.");
         // I predict that the last part of the sentence will say "55years ago"
         // I was correct, except there wasnt a space before 55 either
         System.out.println ("The first computer was invented about" + 55 +
                                 "years ago.");
         // I predict that this will say 8 plus 5 is 85
         // I was correct
         System.out.println ("8 plus 5 is " + 8 + 5);
         // I predict that this will say 8 plus 5 is 13
         // I was correct
         System.out.println ("8 plus 5 is " + (8 + 5));
         // I predict that this will say 13equals 8 plus 5
         // I was correct, except there was a space between 13 and equals
         System.out.println (8 + 5 + " equals 8 plus 5.");
        }
}