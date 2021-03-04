import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Created by enya_ on 26/02/2021
 * UPDATE PROGRAM COMMENTS ABOUT PROGRAM HERE
 **/
abstract class AbstractTopic
{
   DecimalFormat df = new DecimalFormat(" #,##0.00 '%'");
   public Scanner scanner;
   protected String topic;
   public int totalScore = 20;
   public static int round = 0;
   public final int ROUNDS = 4;
   public int topicScore;
   //a list to store all the questions and answers for this round





   public ArrayList<QuestionAndAnswer> questionsAndAnswers;

   public AbstractTopic(){
      this.questionsAndAnswers = new ArrayList<>();
      this.topicScore = 0;
      this.scanner = new Scanner(System.in);
   }//default constructor


   public void askQs (){
      System.out.println("\nHere are the questions on " + topic + ":\n");

      // loop through each question in the list for that topic
      for (QuestionAndAnswer q : questionsAndAnswers) {
         q.askQ();
         if (q.isCorrect(scanner.nextLine()))
         {
            System.out.println("Correct answer!");
            topicScore++;
         }//if
         else System.out.println("Wrong answer!");

      }//for


   }//askQs



   //Increment the round number at the end of every category
   public static void incrementRound() {

      round++;
   }


   public void printScore() {
      System.out.println("You scored " + topicScore + " out of 5 " + " on the " + topic + " questions");



   }//printScore





}//class

