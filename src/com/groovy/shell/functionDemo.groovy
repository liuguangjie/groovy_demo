package com.groovy.shell

/**
 * Created by Administrator on 2016/5/3.
 */


/*
def func(){
    println("hello !!!")
}

func()
*/

// --------- 使用默认参数 -------------
def func(name1="SB", name2="二货", name3="脑残"){
    println("\n您好" + name1)
    println("您好" + name2)
    println("您好" + name3 + "\n")
}

func()    // 全部使用默认参数
func("Sno")    // 使用第2和第3个默认参数
func("Sno", "2PUC")    // 使用最后一个默认参数
func("Sno", "2PUC", "Eminem")    // 改变全部参数

def list=[5,6,1,-5,9]

def dosort(li,iSort=true){
    if(iSort){
        li.sort()
    }
    println(li)
}

dosort(list)
println(list)