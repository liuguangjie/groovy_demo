package com.groovy.shell

/**
 * Created by Administrator on 2016/5/3.
 *
 * 打印倒金字塔
 */
/*


***********
 *********
  *******
   *****
    ***
     *



*/

def num=11
def count=num
def space=1
println()
println();println()

for (i in 1..(num/2+1) ){
    for(k in 1..space){
        print(" ")
    }
    space+=1
    for(j in 1..count){
        print("*")
    }
    count-=2
    println()
}





println()
println("*********".length())











