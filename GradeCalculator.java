import java.util.Scanner;
public class GradeCalculator {
    public static void main (String args []){
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanInput.nextInt();
        
        System.out.print("Your Grade is: ");
            if (score >= 90){
                System.out.print("A");
            } else if (score>=80){
                System.out.print("B");
            } else if (score>=70){
                System.out.print("C");
            } else if (score>=60){
                System.out.print("D");
            } else if (score<60){
                System.out.print("F");
            }
}
}