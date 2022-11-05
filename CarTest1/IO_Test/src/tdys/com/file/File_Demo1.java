package tdys.com.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.SimpleTimeZone;

public class File_Demo1 {
    public static void main(String[] args) {
        File f=new File("D:\\code\\CarTest1\\IO_Test\\src\\date.txt");
        long size=f.length();
        System.out.println(size);
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        long time=f.lastModified();
        System.out.println("最后修改的时间："+new SimpleDateFormat("yyy/MM//dd HH:mm:ss").format(time));
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());

    }
}
