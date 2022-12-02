// FormLetterWriter.java

public class FormLetterWriter
{
    public static void main(String[] args)
    {
        displaySalutation("James");     // one parameter
        displayLetter();
        System.out.println("--------------------------------\n");
        displaySalutation("James", "Cornell");   // this will override the function with 1 parameter and use 2 parameters instead
        displayLetter();
        System.out.println("--------------------------------\n");
    }
    public static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Ms. " + lastName);
    }
    public static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName + ",");
    }
    public static void displayLetter()
    {
        System.out.println("\nThank you for your recent order.");
    }

}
