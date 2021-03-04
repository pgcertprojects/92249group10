import java.util.Scanner;


/**
 * Created by enya_ on 26/02/2021
 * UPDATE PROGRAM COMMENTS ABOUT PROGRAM HERE
 **/
public class UserInterface
{
   private Scanner scanner;
   private String[] topics = {"\n (1)Variables / Data Input / Selection\n",  "(2)Control Statements\n", "(3)Classes & Objects\n", "(4)Arrays\n", "(5)Exit\n"}; //TODO - add more topics

   public UserInterface(Scanner scanner) {
      this.scanner = scanner;
   }//Alternative constructor

   public void start() {

      System.out.println ("Welcome to the Java Revision Quiz!");
      System.out.println("Enter your name to to continue: ");
      String name = scanner.nextLine();
      System.out.println ("Welcome " + name.toUpperCase() + " let's begin!");


      while(true)
      {
         //ask user to select a topic
         System.out.println("Which of the following topics would you like to test yourself on? Enter 1-5\n");
         for (String topic : topics)
         {
            System.out.print(topic + " ");
         }
         String input = scanner.nextLine();


         if (input.equals("2"))
         {
            //run the Control Statement topic quiz
            ControlStatementTopic controlRound = new ControlStatementTopic();
            controlRound.askQs();
            controlRound.printScore();


         } else if (input.equals("4"))
         {
            //run the Array topic quiz
            ArrayTopic arrayRound = new ArrayTopic();
            arrayRound.askQs();
            arrayRound.printScore();

         } else if (input.equals("5"))
         {
            //call toString method
            System.out.println ("Goodbye!");
            //Exit program
            break;

         } else

            System.out.println("Invalid Choice. Please try again");
      }

      //TODO - if user selects other topics



   }//start











}//class



