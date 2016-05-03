package com.groovy.po

/**
 * Created by Administrator on 2016/5/3.
 */
class Dog extends Animal{
//    def foot    //
//    def ear     // 尽管Dog没有声明ear，但从Animal中继承了来
    def booty

    def bark () {
        println("狗狗汪汪叫")
    }

    // 此方法和父类中同名，重写
    def eat() {
        return null
    }

    String toString () {
        super.toString() + ", Dog[屁股:${booty}]"
    }

}
