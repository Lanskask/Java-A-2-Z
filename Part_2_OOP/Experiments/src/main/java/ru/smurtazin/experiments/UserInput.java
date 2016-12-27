package jdbc;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * Created by a1 on 22.12.16.
 */
public class UserInput {

    public void askAndWriteTaskID() {
        String task_id = System.console().readLine("Choose id of the task you want to delete: ");
        System.out.println("Your id is: " + task_id);
    }
    public String makeStringTaskID() {
//        String task_id = System.console().readLine("Choose id of the task you want to delete: ");
        // String answer = "Your id is: " + task_id;
//        return answer;

        String task_id = new Scanner(System.in).nextLine();
        return "task_id: " + task_id;
    }

    /*public static void main(String args[]) throws IOException {
        Console console = System.console();
        BufferedReader reader = new BufferedReader(console.reader());
        main2(reader, console.writer());
    }*/

    /*public void main2() throws IOException {
        Console console = System.console();
        BufferedReader reader = new BufferedReader(console.reader());
        String str = reader.readLine("Choose id of the task you want to delete: ");
        System.out.println("halo "+str);
    }*/


}
