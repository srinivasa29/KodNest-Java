public class program2 {
    public static void main(String[] args) {

        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        // Write your code here.
        double value = solvedProblems;
        int wholePercentage = (int) exactPercentage;
        double average = (double) solvedProblems / practiceDays;
        boolean daily;
        if(average>=9.0){
            daily=true;
        }
        else{
            daily=false;
        }

        System.out.println("Report Value: " + value);
        System.out.println("Whole Percentage: " + wholePercentage);
        System.out.println("Average Per Day: " + average);
        System.out.println("Daily Target Reached: " + daily);
    }
}