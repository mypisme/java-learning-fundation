import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    // 主正则表达式，验证条件1-6和8
    private static final String PASSWORD_REGEX =
            "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-])(?!.*(.)\\1)[\\x00-\\x7F]{8,20}$";

    // 用于检查禁止序列的正则表达式（条件7），这里只检查几个常见序列，不区分大小写
    private static final String FORBIDDEN_SEQUENCES_REGEX =
            ".*(qwerty|asdfgh|zxcvbn|123456).*";

    public static boolean validatePassword(String password) {
        // 检查主正则
        boolean mainCheck = Pattern.matches(PASSWORD_REGEX, password);
        // 检查是否包含禁止序列（不区分大小写）
        boolean hasForbidden = Pattern.compile(FORBIDDEN_SEQUENCES_REGEX, Pattern.CASE_INSENSITIVE)
                .matcher(password)
                .matches();
        new Object();
        return mainCheck && !hasForbidden;

    }

    public static void findStr(){
        String str = "阿斯顿发你马有鹏啊手动阀士大夫艰苦马有鹏发射点发射点法发上帝看见你卡文马有鹏啊手动阀手动阀马有鹏";
        Pattern p = Pattern.compile("马有鹏");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static void main(String[] args) {
        findStr();
    }
}