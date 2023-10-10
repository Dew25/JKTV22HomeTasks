/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometasks;

import tasks.ArrayBooks;
import tasks.ArraySum;
import java.util.Scanner;
import tasks.NumberParser;
import tasks.TemperatureCnverter;

/**
 *
 * @author Melnikov
 */
public class App {
    private final Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
    }

    public App(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void run() {
        boolean repeat = true;
        do{
            System.out.println("Выберите задачу: ");
            System.out.println("0. Закончить программу");
            System.out.println("1. Конвертор температуры");
            System.out.println("2. Парсер числа");
            System.out.println("3. Среднее арифметическое массива");
            System.out.println("4. Массив книг");
            
            System.out.print("Номер задачи: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из прогрммы");
                    repeat=false;
                    break;
                case 1:
                    TemperatureCnverter temperatureCnverter = new TemperatureCnverter(scanner);
                    temperatureCnverter.doConvert();
                    break;
                case 2:
                    NumberParser numberParser = new NumberParser(scanner);
                    numberParser.doParse();
                    break;
                case 3:
                    ArraySum arraySum = new ArraySum(scanner);
                    arraySum.printResult();
                    break;
                case 4:
                    ArrayBooks arrayBooks;
                    arrayBooks = new ArrayBooks();
                    arrayBooks.showBooks();
                    break;
                default:
                    System.out.println("Выберите номер из списка");
            }
            
        }while(repeat);
    }
    
}
