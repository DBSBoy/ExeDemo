package File_IO_Demo;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("d:\\IO流练习区\\文件类练习\\test1.txt");
        System.out.println("文件存在吗？"+f.exists());
        // 创建目录
        File f2 = new File("d:\\IO流练习区\\文件类练习");
        System.out.println("f3是否创建目录"+f2.mkdirs());
        // 创建文件
        File f3 = new File("d:\\IO流练习区\\文件类练习\\test1.txt");
        System.out.println("f2是否创建文件"+f3.createNewFile());
        // delte()方法可以删除目录和文件，但是目录的话要为空才可以删除

    }
}
