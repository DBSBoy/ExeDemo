package File_IO_Demo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamByBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("d:\\IO流练习区\\文件类练习\\test1.txt");
        int len = 0;
        // 每次读取byte.lengtn个长度到bytes里面
        byte[] bytes = new byte[2];
/*
* 这里每次读两个，如果字节数是基数最后一次会带上上一次的数
* */
//        while ((len=fileInputStream.read(bytes))!= -1){
//            System.out.println(new String(bytes));
//        }
        while ((len=fileInputStream.read(bytes))!= -1){
            // 这里读取有效字符,每次从头开始，按每次的实际长度读取
            System.out.println(new String(bytes,0,len));
        }
        fileInputStream.close();
    }
}
