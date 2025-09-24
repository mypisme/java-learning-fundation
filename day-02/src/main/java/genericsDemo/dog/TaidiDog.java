package genericsDemo.dog;

public class TaidiDog extends Dog{
    public TaidiDog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toEat() {
        return "一只叫做" + this.getName() + "的" + this.getAge() + "岁的泰迪，正在吃骨头，边吃边蹭";
    }
}
