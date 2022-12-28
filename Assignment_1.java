import java.util.*;

public class Assignment_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your overall score (0,100)\n");

        while (!input.hasNextDouble()){

            System.out.println("Not Valid Try Again:");
            input.nextLine();

        }

        double OverallScore = input.nextDouble();

        if (0<= OverallScore && OverallScore <=100){

            if(90<=OverallScore){
                System.out.println("Overall Score : " + OverallScore + "\nGrade: AA" + "\nState: Passed");
            }
            else if(85<=OverallScore){
                System.out.println("Overall Score : " + OverallScore + "\nGrade: AB" + "\nState: Passed");
            }
            else if(80<=OverallScore){
                System.out.println("Overall Score : " + OverallScore + "\nGrade: BA" + "\nState: Passed");
            }
            else if(75<=OverallScore){
                System.out.println("Overall Score : " + OverallScore + "\nGrade: BB" + "\nState: Passed");
            }
            else if(70<=OverallScore){
                System.out.println("Overall Score : " + OverallScore + "\nGrade: CB" + "\nState: Passed");
            }
            else if(65<=OverallScore){
                System.out.println("Overall Score : " + OverallScore + "\nGrade: CC" + "\nState: Passed");
            }
            else if(60<=OverallScore){
                System.out.println("Overall Score : " + OverallScore + "\nGrade: DC" + "\nState: Passed");
            }
            else if(50<=OverallScore){
                System.out.println("Overall Score : " + OverallScore + "\nGrade: DD" + "\nState: Passed");
            }
            else {
                System.out.println("Overall Score : " + OverallScore + "\nGrade: FF" + "\nState: Failed");
            }

        }
        else{

            System.out.println("not valid\n");

        }

    }
}
