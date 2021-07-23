package File_IO_Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPhotoDemo {
    public static void main(String[] args) {
        // 数据源
        FileInputStream fin = null;
        // 目的地
        try {
            FileOutputStream fos = null;
            fin = new FileInputStream("d:\\Photo\\birthday.jpg");
            fos = new FileOutputStream("d:\\IO流练习区\\文件类练习\\wlan.jpg");
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fin.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
