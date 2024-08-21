import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ваше имя?");
        String name = sc.next();

        System.out.println("Ваш возраст?");
        String age = sc.next();

        FileWriter fileWriter = new FileWriter("users.txt");

        fileWriter.write(name + "\n");
        fileWriter.write(age + "\n");

        fileWriter.close();

        FileReader fileReader = new FileReader("users.txt");
        Scanner fl = new Scanner(fileReader);

        System.out.println("Name is " + fl.nextLine());
        System.out.println("Age is " + fl.nextLine());

    }
}