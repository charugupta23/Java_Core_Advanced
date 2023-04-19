package FileOperations;

import java.io.FileInputStream;
import java.io.IOException;

public class Writeinfile {
    public  static  void main(String... a){
        try {
            FileInputStream fin = new FileInputStream("abc.txt");
            int i = 0;
            while ((i = fin.read()) != -1){
                System.out.println();

            }
            fin.close();
        }
            catch (IOException e){
                e.printStackTrace();
            }

        }

    }


