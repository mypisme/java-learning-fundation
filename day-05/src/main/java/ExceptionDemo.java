public class ExceptionDemo {
    // 最上层父类 Exception
    // 编译时异常和运行时异常
    String date = "2020-01-01";

    public static void main(String[] args) {

        //运行时异常可以不用在方法名中 throws
        throw new MyException("自定义异常");
    }
}
