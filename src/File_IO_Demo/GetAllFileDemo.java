package File_IO_Demo;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class GetAllFileDemo {
    public static void main(String[] args) {
        File dir = new File("d:\\KuGou");
        Arrays.asList(dir.list()).stream().forEach(System.out::println);;
        System.out.println("---------------------");
        Arrays.asList(dir.listFiles()).stream().forEach(System.out::println);;
        System.out.println("---------------------");
        System.out.println("遍历文件");
        findAllFile(dir);
    }
    // 遍历所有文件，如果一个文件下有几个文件目录，遍历完其中一个再遍历另一个
    public static void findAllFile(File file){
        if(!file.isDirectory()){
            return;
        }
        File[] files = file.listFiles();
        for(File f:files){
            if(f.isDirectory()){
                findAllFile(f);
            }else {
                System.out.println(f.getName());
            }
        }
    }
}
