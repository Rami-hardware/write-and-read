/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingfile;
import java.io.*;
public class NewMain {
   public static void main(String[] args) throws IOException {
       File file = new File("new File");
       if(file.createNewFile())
           System.out.print("new file create it");
       else
           System.out.print("file exsit");
    }
    
}
