反射是为了解决在程序的运行期，不import某个实例，比如Person，但是需要调用它的方法的情况
除了int等基本类型外，Java的其他类型全部都是class（包括interface），例如： String Object Runnable Exception...
可以看出，class（包括interface）的本质是数据类型（Type）。无继承关系的数据类型无法赋值：
Number n = new Double(123.456); // OK
String s = new Double(123.456); // compile error!

而class是由JVM在执行过程中动态加载的。JVM在第一次读取到一种class类型时，将其加载进内存。

每加载一种class，JVM就为其创建一个Class类型的实例，并关联起来。注意：这里的Class类型是一个名叫Class的class。它长这样：

public final class Class {
    private Class() {}
}

