public class MyProgram
{
    public static void main(String[] args)
    {
        import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       String message = "";
       System.out.println("What is your name?");
       String name = input.nextLine();
       System.out.println("When is your birthday?(MM/DD/YYYY)");
       String birthday = input.nextLine();

       String yearText = birthday.substring(6);
       int year = Integer.parseInt(yearText);
       
       String[] animals = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger",
                           "Rabbit", "Dragon", "Snake", "Horse", "Goat"};

       int animalIndex = year % 12;
       String animal = animals[animalIndex];
       
     
        switch (animalIndex) {
                case 0:
                 message = "funny";
            break;

            case 1:
                message = "hard-working";
            break;

            case 2:
                message = "generous";
             break;

            case 3:
                message = "appreciative of luxury";
            break;

            case 4:
                message = "smart";
            break;

            case 5:
                message = "stubborn";
            break;

            case 6:
                message = "courageous";
            break;

            case 7:
                message = "compassionate";
            break;

            case 8:
                message = "charismatic";
            break;

            case 9:
                message = "charming";
            break;

            case 10:
                message = "energenic";
            break;

            case 11:
                message = "shy";
            break;
            
        }
       
        System.out.println("Your birthday is " + birthday +", " + name + ".");
        System.out.println("The year of the " + animal + ".");
        System.out.println("It looks like you are " + message);
        
        
    }
}
    }
}