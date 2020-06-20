package day06;

import java.io.*;

public class PWriter {
    public static void main(String[] args) throws  Exception{

        FileInputStream fis = new FileInputStream("c.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        System.out.println(str);

        FileOutputStream fos = new FileOutputStream("d.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        PrintWriter pw =new PrintWriter(osw,true);
        pw.write(str);
        System.out.println("复制成功");
        pw.close();
    }
}
