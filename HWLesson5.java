/**
 * Java 1. Lesson 5. Homework
 *
 * @author Nikolay Kasparov
 * @version dated: 12 Feb, 2018
 *
 * @link https://github.com/KasparovNikolay
 *
 * 1. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 * 2. Создать методы записи созданного массива в текстовый файл и чтения из него.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class HWLesson5  {


    public static void main(String[] args) throws Exception{
        FileWriter writer = new FileWriter("text.txt");
        Person [] person = new Person[5];
        person[0] = new Person("Ivanov Ivan","Engineer","ivivan@mailbox.com", "892312312",30000, 30 );
        person [1]= new Person("Petrov Petr","Manager","Petya101@mail.ru","89180000000",50000,50);
        person[2]= new Person("Sidorov Vladimir","Driver","Sid2012@rambler.ru","89062034241",25000,55);
        person[3]= new Person("Mevedev Ilya","Security","Ohrana232@yandex.com","89991235476",20000,60);
        person[4]= new Person("Kokorin Alexandr","Cleaner","Sashok1@google.com","89007654123",12000,28);
        for(int x = 0; x<person.length; x++) {
            if (person[x].age > 40) {
                String lineSeparator = System.getProperty("line.separator");
                writer.write("Person " + (x + 1) + " " + person[x] + lineSeparator);  // запись в фаил
            }
        }
        writer.close();
        BufferedReader fromFile = new BufferedReader(new FileReader("text.txt")); // чтение из фаила
        try {
            StringBuilder sb = new StringBuilder();
            String line = fromFile.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = fromFile.readLine();
            }
            String everything = sb.toString();
            System.out.println(sb.toString());
        } finally {
            fromFile.close();
        }
    }
}

class Person  {
    private String name;
    private String prof;
    private String mail;
    private String number;
    private int salary;
    int age;


    Person (String name, String prof, String mail, String number, int salary, int age){
        this.name = name;
        this.prof = prof;
        this.mail = mail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public String toString() {
        return name + " " + prof + " " + mail + " " + number + " " + salary + " " + age;
    }
}
