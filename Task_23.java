import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, 
// а первая - последней.


public class Task_23 {
    public static void main(String[] args) {
        LinkedList<String> inputLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in, "Cp866");
        String srtFromCons;
        System.out.println("Введите значение для строки: \n Для выхода используйте 'print'");

        while (!(srtFromCons = scanner.nextLine()).equals("print"))
            inputLinkedList.addFirst(srtFromCons);
        scanner.close();
        System.out.println("Получился перевёрнутый LinkedList: " + inputLinkedList.toString());
    }
}