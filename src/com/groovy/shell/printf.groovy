package com.groovy.shell

/**
 * Created by Administrator on 2016/5/3.
 */

print("不换行")
print("，接着")
println()    // 换行

println("行内换行\n结尾自动换行")

def str = "'插入的'"
println('${str}')
print("${str}" + "\n")
print("${str}" + "\n")

// %d整型
printf("%d + %d = %d \n", 1, 2, 1+2)           // 1+2=3
printf("%d + %d = %d \n", [1, 2, 1+2])        // 标准写法

// %f浮点
printf("%f + %f = %f \n", 1.0, 2.0, (1.0+2.0))   // 1.000000 + 2.000000 = 3.000000
printf("%f + %f = %.2f \n", 1.0, 2.0, (1.0+2.0)) //保留2位小数：1.000000 + 2.000000 = 3.00

// %s字符串
printf("%s是美女\n", "凤姐")       // 默认按照参数打印
printf("%5s是美女\n", "ABC")       // 参数字串占5个字符的位置，字串不足5位，左侧补空格
printf("%-5s是美女\n", "A凤姐C")   // 右侧补空格，似乎一个汉字占一位

print("输入名字：")
name = new BufferedReader(new InputStreamReader(System.in)).readLine()
println("你的名字是：" + name)

print("输入年龄：")
def age = new BufferedReader(new InputStreamReader(System.in)).readLine()
println("你的年龄是：" + age)
