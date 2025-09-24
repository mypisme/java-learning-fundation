import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DataStructure {
    // 栈 先进后出 后进先出
    // 队列 先进先出
    // 数组 顺序存储  查询快，插入删除慢
    // 链表 链式存储  查询慢，插入删除快 每个节点记录下一个节点的指针和数据
        // 链表中的节点是独立的对象，在内存中是不连续的
        // 双向链表 查询效率比单向链表高

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    public void arrayListSty(String[] args) {
        // 利用空参创建数组，在底层创建一个默认长度为0的数组

        // 添加第一个元素，会创建一个从长度为10的数组
        arrayList.add(1);
        // 存满时，会扩容1.5倍
        System.out.println(arrayList.size());
    }

    public void linkedListSty(String[] args) {
        // node 数据 上一个节点及下一个节点的指针
        // linkedList实际上是一个双向链表

        // 链表创建第一个节点的过程 源码分析
            // 首先创建一个node，其头节点和尾节点都为null
            // 然后创建一个头节点，其数据为1，头节点的指针指向node
            // 然后创建一个尾节点，其数据为1，尾节点的指针指向node
        linkedList.add(1);
        // 链表创建第二个节点的过程
            // 创建一个node，其数据为2 将第一个节点的node地址赋给当前node的前一个节点指针
            // 更新尾节点指针为当前node的地址
            // 将上一个node的后一个节点指针指向当前node
        linkedList.add(2);
        System.out.println(linkedList.size());
    }

    public void iteratorSty(String[] args) {
        // 迭代器 创建ArrayList的内部类对象
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        // 迭代器是一个指针，指向集合中的某个元素
        // 迭代器是一个对象，对象中有一个指针，指向集合中的某个元素
        // 迭代器对象创建过程
            // 创建一个迭代器对象，迭代器对象中包含一个指针，指向集合中的第一个元素
        // 迭代器对象使用过程
            // 迭代器对象调用next方法，指针指向下一个元素
            // 迭代器对象调用hasNext方法，判断指针是否指向集合中的最后一个元素
        // 迭代器对象使用完毕
    }
}
