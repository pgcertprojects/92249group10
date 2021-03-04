import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by enya_ on 26/02/2021
 * UPDATE PROGRAM COMMENTS ABOUT PROGRAM HERE
 **/
public class TestClass
{



   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      UserInterface userInterface = new UserInterface(scanner);


      long startTime = System.currentTimeMillis();
      userInterface.start();
      long endTime = System.currentTimeMillis();

      // calculate time difference
      long timeDiff = endTime - startTime;
      System.out.println("Test time is " + timeDiff/1000.0 + " seconds ");






   }//main
}//class


