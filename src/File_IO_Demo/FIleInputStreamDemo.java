package File_IO_Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputStreamDemo {
    public static void main(String[] args) throws IOException {
        // FileInputStream参数里表示的文件不存在就会报错
        FileInputStream fileInputStream = new FileInputStream("d:\\IO流练习区\\文件类练习\\test1.txt");
        int b = 0;
        // read方法每次读取一个字节数据
        while ((b=fileInputStream.read())!=-1){
            System.out.println((char) b);
        }
        System.out.println("-------我是分割线--------");
        fileInputStream.close();
    }
}
