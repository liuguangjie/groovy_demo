package com.groovy.shell

/**
 * Created by Administrator on 2016/5/3.
 */


def str = "hlksflkhfhs"
def rge = 1..9

while (str) {
    // str = str.previous()    // 同 -- ，按照ASCII码运算
    str = str.minus(str.getAt(str.length()-1))    // 移除最后一个字符
    println(str)
}
def i = 1
while (i in rge) {
    println(i)
    i++
}