package seminar2;

import java.util.Scanner;

public class ConsoleInput {
    private static final Scanner scanner = new Scanner(System.in);
    public static float inputFloat(){
       return inputFloat("");
    }
    public static float inputFloat(String invite){
        while (true){
            try{
                System.out.print(invite);
                return Float.parseFloat(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Введите число в правильном формате вещественного - допустимы только цифры и точка");
            }
        }
    }
}
