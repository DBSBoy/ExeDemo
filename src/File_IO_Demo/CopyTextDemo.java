package File_IO_Demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
*读取文本使用字符流,字符输出流在io关闭之后就不会操作流对象，缓冲区的数据就不会写到目的地，所以要先flush()再close
 */
public class CopyTextDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
          fr = new FileReader("d:\\IO流练习区\\文件类练习\\test2.doc");
          // 字符输出流的文件对象参数不存在就会报错
          fw = new FileWriter("d:\\IO流练习区\\文件类练习\\test3.doc");
            copyText(fr,fw);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fr.close();
                fw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void copyText(FileReader fr, FileWriter fw) throws IOException {
        int len =0;
        char[] c = new char[1024];
        while ((len=fr.read(c))!=-1){
            fw.write(c,0,len);
        }
        fw.flush();
    }
}
