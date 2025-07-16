import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] Questions = {
                "What is the capital of Canada?",
                "What is the longest river in the world?",
                "Mount Everest is located in which mountain range?",
                "Which country has the most natural lakes?",
                "What is the smallest country in the world by area?"
        };

        String[][] options = {
                {"1. Toronto", "2. Ottawa", "3. Vancouver", "4. Montreal"},
                {"1. Amazon River", "2. Yangtze River", "3. Nile River", "4. Mississippi River"},
                {"1. Andes", "2. Alps", "3. Rockies", "4. Himalayas"},
                {"1. India", "2. Canada", "3. Russia", "4. Brazil"},
                {"1. Vatican City", "2. Monaco", "3. Nauru", "4. San Marino"}
        };

        int[] answers={2,3,4,2,1};
        int score=0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("**********************************");
        System.out.println("welcome to the Geography Quiz GAme");
        System.out.println("**********************************");

        for(int i = 0; i<Questions.length; i++){
            System.out.println(Questions[i]);

            for(String A: options[i]){
                System.out.println(A);
            }
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("Correct Answer!");
                score = score+1;
            }
            else{
                System.out.println("Wrong answer");
            }

        }
        System.out.println("Your Final Score is: "+ score +" out of "+Questions.length);
    }
}