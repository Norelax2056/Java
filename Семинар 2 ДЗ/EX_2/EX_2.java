package EX_2;

import java.io.*;
import java.util.*;;

public class EX_2 {
    public static void main(String[] args) throws Exception {
        int[] mas = { 105, 32, 4, 6, 7 };
        FileWriter fw = new FileWriter( "EX_2.txt" );
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                    fw.write(Arrays.toString(mas)+"\n");
                }
            }
        }
        System.out.println("запись в фаил завершена");
        fw.close();
    }
}
