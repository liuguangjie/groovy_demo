package com.groovy.shell

/**
 * Created by Administrator on 2016/5/3.
 */
def num = 1
switch(num){
    case 1:      // 如果num == 1
        println("1")
        break        // 不中断，将继续向下判断
    case 2:
        println("2")
        break
}

switch(num){
    case 1..3:
        println("在1-3之间")    // 打印
        break
    case 4..6:
        println("在4-6之间")
        break
}

switch(num){
    case [1,2,3]:
        println("在1,2,3之间")    // 打印
        break
    case [4,5,6]:
        println("在4,5,6之间")
        break
}

def str = 'a'
switch(str){
    case "abcd":
        println("在abcd之间")
    case ["a", "b", "c"]:
        println("在a,b,c之间")    // 打印
        break
    case [4,5,6]:
        println("在4,5,6之间")
        break
}