import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.*;
import java.util.*;

public class Test1 {
    // 爬取数据
    public static void main(String[] args) throws IOException {
        String familyNamePath = "https://hanyu.baidu.com/shici/detail?from=aladdin&pid" +
                "=0b2f26d4c0ddb3ee693fdb1137ee1b0d&smp_names=termBrand2%2Cpoem1";
        String boyNamePath = "http://www.haoming8.cn/baobao/10881.html";
        String girlNamePath = "http://www.haoming8.cn/baobao/7641.html";

        // 爬取网页内容
        String familyNameStr = HttpUtil.get(familyNamePath);
        String boyNameStr = HttpUtil.get(boyNamePath);
        String girlNameStr = HttpUtil.get(girlNamePath);

        // 提取关键信息
        List<String> familyNameList = ReUtil.findAll("([^>]{4})(?:，|。)", familyNameStr, 1);
        List<String> boyNameList = ReUtil.findAll("([\\u4e00-\\u9fa5]{2})(?:、)", boyNameStr, 1);
        List<String> girlNameList = ReUtil.findAll("([\\u4e00-\\u9fa5]{2})(?: )", girlNameStr, 1);

        // 处理姓氏姓名信息
        ArrayList<String> familyList = new ArrayList<>();
        ArrayList<String> boyNames = new ArrayList<>();
        ArrayList<String> girlNames = new ArrayList<>();
        for (String s : boyNameList) {
            if (boyNames.contains(s)) {
                continue;
            }
            boyNames.add(s);
        }
        for (String s : girlNameList) {
            if (girlNames.contains(s)) {
                continue;
            }
            girlNames.add(s);
        }

        for (String s : familyNameList) {
            for (int i = 0; i < s.length(); i++) {
                familyList.add(s.charAt(i) + "");
            }
        }

        // 生成信息 姓名-性别-年龄
        HashSet<String> nameInfos = getNameInfo(familyList, boyNames, girlNames, 70, 50);

        // 写入文件
        FileUtil.writeLines(nameInfos, new File("D:\\临时\\取名表.txt"), "utf-8");

    }


    private static HashSet<String> getNameInfo(ArrayList<String> familyList, ArrayList<String> boyList,
                                               ArrayList<String> girlList, int boyNum, int girlNum) {
        HashSet<String> nameList = new HashSet<>();
        HashSet<String> boyNames = new HashSet<>();
        HashSet<String> girlNames = new HashSet<>();
        while (boyNames.size() != boyNum) {
            Collections.shuffle(familyList);
            Collections.shuffle(boyList);
            Random rand = new Random();
            int index = rand.nextInt(10) + 18;
            boyNames.add(familyList.getFirst() + boyList.getFirst() + "-男-" + index);
        }

        while (girlNames.size() != girlNum) {
            Collections.shuffle(familyList);
            Collections.shuffle(girlList);
            Random rand = new Random();
            int index = rand.nextInt(8) + 18;
            girlNames.add(familyList.getFirst() + girlList.getFirst() + "-女-" + index);
        }

        nameList.addAll(boyNames);
        nameList.addAll(girlNames);
        return nameList;
    }
}
