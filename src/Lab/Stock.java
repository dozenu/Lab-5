package Lab;

import java.io.*;

public class Stock {
    String name;
    boolean availability;
    int cost;

    Stock() throws IOException {
        String bolv;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in, "Cp1251"));
        System.out.print("\nВведите наименование товара: ");
        this.name = input.readLine();
        System.out.print("\nВведите его стоимость: ");
        this.cost = Integer.parseInt(input.readLine());
        while (true) {
            System.out.print("\nНаличие на складе (Yes/No): ");
            bolv = input.readLine();
            if ("Yes".equals(bolv)) {
                this.availability = true;
                break;
            }
            if ("No".equals(bolv)) {
                this.availability = false;
                break;
            }
            System.out.print("\nОшибка! Повторите ввод");
        }
    }

        public void InputInFile() throws IOException {
            File file = new File("document.doc");
            file.deleteOnExit(); //файл удалится после завершения работы виртуальной машины Java
            //поток для записи в файл
            FileWriter writer;
            writer = new FileWriter(file, true);
            writer.append("\nНаименование товара " + this.name + "; его стоимость: " + this.cost + "; ");
            if (this.availability)
                writer.append("есть на складе.\n");
            else writer.append("нет на складе.\n");
            writer.flush();
            writer.close();
        }

        public static void OutputOfFile() throws IOException {
            File file = new File("document.doc");
            FileReader reader;
            char buffer[];
            int numb;
            buffer = new char[1];
            reader = new FileReader(file);
            do {
                numb = reader.read(buffer);
                System.out.print(buffer[0]);
            } while (numb == 1);
            reader.close();
        }
    }
