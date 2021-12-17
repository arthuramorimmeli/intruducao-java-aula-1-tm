import programs.Exercicio1;
import programs.Exercicio2;
import programs.Exercicio3;

import java.util.Scanner;

public class main {

    private static Exercicio1 exercicio1;
    private static Exercicio2 exercicio2;
    private static Exercicio3 exercicio3;

    public static void main(String[] args) {
        exercicio1 = new Exercicio1();
        exercicio2 = new Exercicio2();
        exercicio3 = new Exercicio3();
        runProgram();
    }

    public static void runProgram() {
        Integer optionProgramRun = inputOptonProgramRun();
        selectProgramToRun(optionProgramRun);
    }

    private static Integer inputOptonProgramRun() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select program to run: \n" +
                "1. Run Program 1\n" +
                "2. Run Program 2\n" +
                "3. Run Program 3\n" +
                "4. Run Program 4\n" +
                "5. Run Program 5\n" +
                "0. Exit");
        return sc.nextInt();
    }

    private static void selectProgramToRun(Integer optionProgramRun) {
        switch (optionProgramRun) {
            case 1: {
                exercicio1.runProgram();
                break;
            }
            case 2: {
                exercicio2.runProgram();
                break;
            }
            case 3: {
                exercicio3.runProgram();
                break;
            }
            case 0: {
                System.exit(1);
                break;
            }
            default: {
                System.out.println("invalid program.");
                break;
            }
        }

        runProgram();
    }
}