
public class Palindrome
{
   
    public String word;
    public boolean isPalindrome;

    /**
     * Constructor for objects of class palindrome
     */
    public Palindrome(String wd)
    {
        this.word = wd;
    }
    
    public boolean testWord() {
        //Logic to test palindrome
        for (int i =0; i< word.length(); i++) {
             System.out.println(word.substring(i,i+1));
            }
            
            
            //Set instance variable
        return isPalindrome;
    }
    }

