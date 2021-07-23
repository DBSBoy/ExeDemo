package File_IO_Demo;

import java.io.*;

/*
*这里使用字节缓冲流进行读写，减少io次数，加快读取
* 用BufferedReader字符缓冲流也是一样的操作，不过字符缓冲流多了个读取行的方法
 */
public class BufferDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("开始时间:"+start);
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("d:\\IO流练习区\\文件类练习\\sys_dictionary_field.sql"));
            bos = new BufferedOutputStream(new FileOutputStream("d:\\IO流练习区\\文件类练习\\test4.sql"));
            int len = 0;
            byte[] b = new byte[1024];
            while ((len=bis.read(b))!=-1){
                bos.write(b,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                bos.close();
                long end = System.currentTimeMillis();
                System.out.println("结束时间:"+end);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
