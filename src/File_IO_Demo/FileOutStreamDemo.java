package File_IO_Demo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamDemo {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象,每次创建都会先清空这个file对象对应的文件的数据
        // FileOutputStream第二个参数是布尔类型，表明是否需要追加，true就表示追加，就不会清空初始数据
        FileOutputStream fos = new FileOutputStream("d:\\IO流练习区\\文件类练习\\test1.txt");
        // 字符串转换为字节数组
        byte[] b = "我要买一台电脑".getBytes();
        // 写出字节数组数据，写到test1文件
        fos.write(b);
        byte[] b2 = "RTX3050".getBytes();
        // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
        fos.write(b2,3,4);
        // 关闭资源
        fos.close();
    }
}
