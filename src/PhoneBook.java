import java.io.*;
import java.util.Properties;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in,
                System.console().charset()));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {

        }
        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("ОШибка при чтении файла.");
        }

        do {
            System.out.println("Введите новое имя" + "(quit для завершения) : ");
            name = br.readLine();
            if (name.equals("quit")) {
                System.out.println("Введите номер: ");
                number = br.readLine();
                ht.setProperty(name, number);
                changed = true;
            }
        } while (!name.equals("quit"));
        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Телефонный справочник");
            fout.close();
        }
        do {
            System.out.println("Введите интересующее имя" + "(quit для завершения) :");
            name = br.readLine();
            if (name.equals("quit")) {
                number = (String) ht.get(name);
                System.out.println(number);
            }
        } while (!name.equals("quit"));
    }
}
