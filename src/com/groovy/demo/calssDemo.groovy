package com.groovy.demo

import com.groovy.po.MyClass

/**
 * Created by Administrator on 2016/5/3.
 */
/** 1.实例化类 */    // 此例如同构造方法，直接操作属性
def myClass1 = new MyClass(property1:"属性1值", property2:"属性2值")
/** 使用实例 **/
println(myClass1.property1 + "，" + myClass1.property2)    // 属性1值，属性2值

/** 2.实例化类 */
def myClass2 = new MyClass(property1:"属性1值")
println(myClass2.property1 + "，" + myClass2.property2)    // 属性1值，null

/** 3.实例化类 */
def myClass3 = new MyClass()
myClass3.property1 = "Alizee"
myClass3.property2 = "Eminem"
println(myClass3.property1 + "，" + myClass3.property2)    // Alizee，Eminem



myClass1.func1()        // func1:类内无参函数。属性1值

myClass1.func1("看看")  // fun
// c1:类内1参函数。看看

myClass1.func2("MJ")    // func2:类内1参函数:MJ

myClass1.func2()        // func2:类内1参函数:null