import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {
        // 泛型
        // 如果没有给集合指定类型，则集合中可以添加任意类型的元素，集合中的元素类型是Object
        // 如果给集合指定类型，则集合中只能添加指定类型的元素

        // 泛型擦除
        // 泛型不能写基本数据类型 因为在装入集合中后，元素会被转成object类型
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add(1);
        arrayList.add(new DataStructure());
         System.out.println(arrayList);

        GenericsClass<String> stringGenericsClass = new GenericsClass<>();
        stringGenericsClass.setT("1");
        stringGenericsClass.showT();
    }

    private static class GenericsClass<T>{
        private T t;
        public void setT(T t){
            this.t = t;
        }
        public T getT(){
            return t;
        }
        public void showT(){
            System.out.println(t.getClass().getName());
        }

        public <E> void showE(E e){
            System.out.println(e.getClass().getName());
        }
    }
}
