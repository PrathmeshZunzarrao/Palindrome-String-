import java.util.Scanner;

class PalindromeString 
{
    public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter String : ");
       String s = sc.next();
       
        String rev = " ";
       
       for(int i=s.length()-1; i>=0; i--)
       {
           rev = rev + s.charAt(i);
       }
       
       System.out.print("Reverse of string : " + rev);
       
       System.out.print("\n\n\n");
       
       
       if (s == rev)
       {
           System.out.println("Palindrome String");
       }
       else
       {
           System.out.println("Not Palindrome String");
       }
    }
}