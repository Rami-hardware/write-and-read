//C:\Users\Rami Dannah\Desktop\text.txt
package copyingfile;
import java.io.*;
import java.util.Scanner;
public class CopyingFile {
    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("write 1 read 2");
        int ch = input.nextInt();
        String x ;
        try
           {
               if (ch == 1){
                 System.out.println("enter the path: ");
                x = input.next();
                File File = new File(x);
                System.out.println("write: ");
                String i = input.next();
                FileWriter wr =new FileWriter(File);
                BufferedWriter write = new BufferedWriter(wr);
                write.write(i);
                write.close();
               }else if(ch == 2)
               {
                System.out.println("enter file patch: ");
                String e = input.next();
                File File2 = new File(e);
                System.out.println("File contact: ");
                BufferedReader Read = new BufferedReader(new FileReader(File2));
                String chr ;
               while ((chr = Read.readLine()) != null)
                   System.out.println(chr);
               }
        
        }
         catch(Exception d)
                {
                System.out.println(d);
                }
        /*File file = new File("C:\\File.txt");
       if(file.createNewFile())
           System.out.print("new file create it");
       else
           System.out.print("file exsit");*/
    
    }
    
}
