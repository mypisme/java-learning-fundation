import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Objects;

public class FIleDemo {
    public static void main(String[] args) throws IOException {
//        File file = new File("D:\\");
//        String parent = "adsf";
//        String son = "asdf";
//        File file1 = new File(parent, son);
//
//        System.out.println(file1);
//
//        String mdPath = "D:\\md_files\\clash节点.md";
//        File file2 = new File(mdPath);
//        System.out.println(file2.isFile());
//        System.out.println(file2.length());
//        System.out.println(file2.getName());
//        new SimpleDateFormat("yyyy年MM月dd日");
//
//
//        System.out.println(new SimpleDateFormat("yyyy年MM月dd日").format(file2.lastModified()));
//
//        String newFilePath = "D:\\md_files\\new.md";
//        File file3 = new File(newFilePath);
//        System.out.println(file3.createNewFile());
//
//        String mdDirPath = "D:\\md_files";
//        File file4 = new File(mdDirPath);
//        File[] files = file4.listFiles();
//        for (File file5 : files) {
//            System.out.println(file5);
//        }
//
//        for (File listRoot : File.listRoots()) {
//            System.out.println(listRoot);
//        }

        String dirPath = "C:\\Users\\Administrator\\Documents\\WeChat Files";
        File file = new File(dirPath);
        HashMap<String, Integer> stringIntegerHashMap = main1(file);
        for (String type : stringIntegerHashMap.keySet()) {
            System.out.println(type + ":" + stringIntegerHashMap.get(type));
        }
    }

    public static HashMap<String, Integer> main1(File files) {

        HashMap<String, Integer> fileTypeMap = new HashMap<>();
        for (File file : Objects.requireNonNull(files.listFiles())) {
            if (file.isFile()) {
                String fileType = file.getName().substring(file.getName().lastIndexOf(".") + 1);
                if (fileTypeMap.containsKey(fileType)) {
                    fileTypeMap.put(fileType, fileTypeMap.get(fileType) + 1);
                } else {
                    fileTypeMap.put(fileType, 1);
                }
            } else {
                HashMap<String, Integer> fileTypeMapTmp = main1(file);
                for (String typeTmp : fileTypeMapTmp.keySet()) {
                    if (fileTypeMap.containsKey(typeTmp)){
                        fileTypeMap.put(typeTmp, fileTypeMap.get(typeTmp) + fileTypeMapTmp.get(typeTmp));
                    }
                    else {
                        fileTypeMap.put(typeTmp, fileTypeMapTmp.get(typeTmp));
                    }
                }
            }
        }
        return fileTypeMap;
    }
}
