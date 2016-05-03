package com.groovy.shell

/**
 * Created by Administrator on 2016/5/3.
 */
def str1 = '凤姐'
def str2 = "${str1}是NB的" // 如果变量后无空格，用大括号包裹变量名
println(str2)    // 凤姐是NB的

def str3 = '${str1}是NB的' // 静态字符串中引用变量无效
println(str3)    // ${str1}是NB的

str2 = "$str1 是无敌的"    // 如果变量后有空格，可省略大括号
println(str2)    // 凤姐 是无敌的

str2 = "芙蓉姐姐"
def str4 = "\${str2}照耀我们去'奋斗'"
println(str4)    // ${str2}照耀我们去'奋斗'

def str5 = "${str2}照耀我们去'奋斗'"
println(str5)    // 芙蓉姐姐照耀我们去'奋斗'

str5 =
        """${str2}
                    照耀我们
去'奋斗'"""
println(str5)            // 三引号保留文本的格式，如同html中的<pre>
/*
芙蓉姐姐
                    照耀我们
去'奋斗'
*/