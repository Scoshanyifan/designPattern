package com.scosyf.designPattern.creational.singleton;

/**
 * 饱汉模式：
 */
public class FullType {

    /**
     * volatile是必须的:和重排序有关
     * 
     * 在初始化的过程中，jvm做了下面3件事：
     *      1.给helper对象分配内存
     *      2.调用构造函数
     *      3.将helper对象指向分配的内存空间
     *
     *   由于jvm的"优化",指令2和指令3的执行顺序是不一定的，当执行完指定3后，此时的instance对象就已经不是null了，
     *   但此时指令2不一定已经被执行。假设线程1和线程2同时调用getHelper()方法，此时线程1执行完指令1和指令3，
     *   线程2抢到了执行权，此时helper对象是非空的。所以线程2拿到了一个尚未初始化的helper对象，
     *   此时线程2调用这个helper就会抛出异常。
     *   
     *   
     *   线程A发现变量没有被初始化, 然后它获取锁并开始变量的初始化。
     *   由于某些编程语言的语义，编译器生成的代码允许在线程A执行完变量的初始化之前，
     *   更新变量并将其指向部分初始化的对象。线程B发现共享变量已经被初始化，并返回变量。
     *   由于线程B确信变量已被初始化，它没有获取锁。如果在A完成初始化之前共享变量对B可见
     *   （这是由于A没有完成初始化或者因为一些初始化的值还没有穿过B使用的内存(缓存一致性)），程序很可能会崩溃。
     */
    private static volatile FullType instance = null;
    
    private FullType() {}
    
    public static FullType getInstance() {
        //[1]
        if (instance == null) {
            //[2]
            synchronized (FullType.class) {
                //[3]
                if (instance == null) {
                    //[4]
                    return new FullType();
                }
            }
        }
        return instance;
    }
    
    public static void main(String[] args) {
        FullType singleton = FullType.getInstance();
        System.out.println(singleton);
    }
}
