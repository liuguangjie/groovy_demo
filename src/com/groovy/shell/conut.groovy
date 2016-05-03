package com.groovy.shell

//------------------数字运算部分------------------------
def num1 = 1

// 一般运算表达式
def num2 = 2 + num1
println(num2)// 3

// 数字默认是Integer类的实例，可直接调用方法
num2 = 4.plus(num1) // 相加
println(num2)// 5

num2 = num2 / ( num1 + 1 )
println(num2) // 2.5
num2 = 6.div(3)// 早版本的 divide 方法改为 div 。6/3
println(num2) // 结果为整数 2，而不是浮点数 2.0
num2 = 5.multiply(9) // 乘法 5*9
println(num2)// 45

num2 = 5.minus(9)// 减法 5-9
println(num2)// -4

num2 = 15.mod(9)// 取余 5%9
println(num2)// 6

num2 = 13.intdiv(5)// 取商的整数位
println(num2) // 2

num2 = num2++
println("先赋值，后++ ：" + num2)// 2

num2 = ++num2
println("先 ++，后赋值：" + num2) // 3

num2 = num2.next() // 同 ++num2，先++改变自己，然后赋值
println(num2) // 4
num2 = num2.next()
println(num2)// 5

//-------------------关系表达式-------------------------
def num3 = 24
def num4 = 24
println(num3.equals(num4))// 判断值相等，同 == 。true
println(num3 == num4) // 两个值是否相等      true
println(!num3.equals(num4))// 判断值不相等        false
println(num3 <=> num4)// 0，比较大小。num3大于num4返回1，num3小于num4返回-1，相等返回0
println(num3.compareTo(num4)) // 0，比较大小，同 <=>