import java.util.Scanner;
public class Chapter3 {
    // Declare the Chapter 3 Milestone 1 method here
    public void milestone1(int num1, int num2) {
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        for(int c = num1; c < num2; c++) {
            if(c % 2 == 0 && c != num1) System.out.print(c + " ");
            if((c + 1) % num1 == 0) {
                System.out.print((c + 1));
                break;
            }
        } 
        System.out.println();
    }
    
    // Declare the Chapter 3 Milestone 2 method here
    public void milestone2(Scanner scanner) {
        System.out.println("Enter some numbers: ");
        double c = 0, input = 0, total = 0;

        do {
            input = scanner.nextInt();
            if (input < 0) break;
            total += input;
            c++;
        } while (input > 0);

        double average = (total / c);
        average = Math.round(average * 100.0) / 100.0;
        System.out.println("The average is: " + average);
    }

    public void milestone3(int num1, int num2, int answer) {
        if (num1 * num2 == answer)
            System.out.println("Correct!");
        else
            System.out.println("Incorrect, the answer was " + (num1 * num2));
    }
}