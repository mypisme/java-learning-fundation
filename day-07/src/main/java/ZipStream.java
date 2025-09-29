import cn.hutool.core.io.FileUtil;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipStream {
    // 压缩流
    public static void main(String[] args) throws IOException {

//        File src = new File("D:\\临时\\斗地主完整代码");
//        File descParent = src.getParentFile();
//        File desc = new File(descParent, src.getName() + ".zip");
//
//        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(desc));
//        toZip(src, zos, src.getName());
//
//        zos.close();
        huToolTest();

    }

    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();

        for (File file : files) {
            if (file.isFile()){
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(entry);

                FileInputStream fis = new FileInputStream(file);
                int len;
                while ((len = fis.read()) != -1){
                    zos.write(len);
                }
                fis.close();
                zos.closeEntry();
            } else {
                toZip(file, zos, name + "\\" + file.getName());
            }
        }

    }

    public static void huToolTest(){
        File file = FileUtil.file("D:\\", "临时", "asdf", "a.txt");
        System.out.println(file);
        FileUtil.touch(file);

        ArrayList<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "1", "2", "3", "4", "5", "6", "7", "8", "9");
        FileUtil.writeLines(stringList, file, StandardCharsets.UTF_8);

    }
}
