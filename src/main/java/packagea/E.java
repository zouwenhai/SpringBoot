package packagea;

/**du'y
 * @ClassName E
 * @Description 子类无法继承父类的私有方法
 * @Author zouwenhai
 * @Date 2019/8/9 0:07
 * @Version 1.0
 */
public class E extends A {

    /**
     * 继承的概念，简单来说就是子类拥有父类所有的属性和方法，但是私有的属性和方法子类是无法直接访问的，只是拥有，但不能使用。
     * 从内存角度分析：子类在被创建时，会先创建一个父类对象，然后在父类对象外部加上子类独有的属性，两者结合起来形成一个子类对象。
     */

    String str1 = this.str;


    /**
     * 子类
     */



    /**
     * 子类无法继承父类的私有方法
     */


    /**
     * 子类可以继承父类的protected方法
     */


    @Override
    protected void E() {
        super.E();
    }
}


