package com.groovy.po

/* 关键字：class
// 紧跟类名
// 紧跟大括号 */
class MyClass {
    // def 声明属性。默认是 public
    def property1
    def property2

    // 构造方法无 def 声明
    // 名称和类相同
    // 可以重载
    MyClass(){    // 默认无参构造方法
    }

    MyClass(property1, property2){    // 重载的有参构造方法
        // 本类属性 = 参数
        this.property1 = property1
        this.property2 = property2
    }

    def func1 () {
        println("func1:类内无参函数。" + property1)
    }

    /** 方法重载 **/
    def func1 (arg) {
        println("func1:类内1参函数。" + arg)
    }

    def func2 (arg) {
        println("func2:类内1参函数:${arg}")
    }


    // 明确定义了返回值类型
    String toString () {
        // 最后一行作为一个有效数据，可以省略 return
        "MyClass:[property1=${property1}, property2=${property2}]"
    }
}
