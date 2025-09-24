package genericsDemo.dog;

public class HashiqiDog extends Dog{

    public HashiqiDog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toEat() {
        return "一只叫做" + getName() + "的" + this.getAge() + "岁的哈士奇，正在吃边吃边拆家";
    }
}
