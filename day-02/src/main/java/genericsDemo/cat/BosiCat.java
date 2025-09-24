package genericsDemo.cat;

public class BosiCat extends Cat {
    public BosiCat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toEat() {
        return "一只叫做" + this.getName() + "的" + this.getAge() + "岁的波斯猫，正在吃小饼干";
    }
}
