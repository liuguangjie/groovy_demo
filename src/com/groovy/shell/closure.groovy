package com.groovy.shell

/**

 闭包   特新
 * Created by Administrator on 2016/5/3.
 */

/*

def closure={

    println("hello  world !! ")
}

closure.call()
*/


def closure={param ->

    println("${param} hhh")
}

closure.call("世界你好")


def arg = "abcdefg"            // 闭包外定义的变量


closure(arg)         // Hello abcdefg !

arg = "higklmn"

closure(arg)         // Hello higklmn !

arg = "opqrst"

def closure2 = { param ->
    param = "uvwxyz"            // 不能改变闭包外定义的变量
    println("Hello ${param} !")
}

closure2(arg)         // Hello uvwxyz !

println(arg)          // opqrst，没有被闭包改变

def closure3 = { // arg ->
    arg = "Haha"                // 闭包内能访问到外部定义的变量
    println("Hello ${arg} !")
}

closure3(arg)         // Hello Haha !

println(arg)          // Haha，在闭包内被改变了


// "abcdefg".each(){ // 同下
// 给each方法传入一个闭包作为参数
"abcdefg".each{
    print(it + " ")
}    // a b c d e f g

println()
[4,5,6,6,3,2].each{
    print(it + " ")
}    // 4 5 6 6 3 2

println()
["n":114, "p":65, "q":112].each{
    print(it.key + ":" + it.value + " ")
}    // n:114 p:65 q:112

println()
["aaa":"AAA", "bbb":"BBB", "ccc":"CCC"].each{
    arg1, arg2 ->
        print( arg1 + arg2 + " ")
}   // aaaAAA bbbBBB cccCCC

println()
[["xxx":"XXX"]:1, ["yyy":"YYY"]:2, ["zzz":"ZZZ"]:3].each{
    arg1, arg2 ->
        print(arg1.keySet() + arg1.values() + arg2 + " ")
}   // [xxx, XXX, 1,  ][yyy, YYY, 2,  ][zzz, ZZZ, 3,  ]

println()
def num = [4,5,6,6,3,2].findAll{
    it > 5                        // 查找并返回大于5的数
}
println(num)    // [6, 6]

num = [4,5,6,6,3,2].any{
    it > 5                        // 只要有大于5的数，即返回true
}
println(num)    // true

num = [4,5,6,6,3,2].every{
    it > 5                        // 必须全部大于5，才返回true
}
println(num)    // false

num = [4,5,6,6,3,2].collect{    // 遍历结合
    it += 5                        // 遍历集合元素，每个元素+5
}
println(num)    // [9, 10, 11, 11, 8, 7]

num = [4,5,6,6,3,2].inject(0){  // 注入。遍历集合
a,b ->    // a接收注入的0，只注入一次。b接收遍历的集合元素
    a += b                        // 变量集合元素，累加元素
}
println(num)    // 26
