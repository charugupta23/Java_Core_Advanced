package Files;

import java.io.File;
import java.io.IOException;

public class Fileexists {
    public static void main(String[] args) throws IOException, InterruptedException {
       for(int i=1;i<10;i=i+2) {
           String filename = "abc"+i;
           File file = new File(System.getProperty("user.dir") + "/Files/" +filename+".txt");

           if (file.exists()) {
               System.out.println("File exists");
           } else {
               file.createNewFile();
               System.out.println("File does not exist already new file created..");
           }
            Thread.sleep(2000);
           System.out.println("wait for 2 second");
       }


       /*File f = new File(System.getProperty("user.dir")+"/Files3");

        if(!f.exists()) {
            System.out.print("No Folder");
            f.mkdir();
            System.out.print("Folder created");
        }*/
    }
}
