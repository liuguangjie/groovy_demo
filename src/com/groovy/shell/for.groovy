package com.groovy.shell

/**
 * Created by Administrator on 2016/5/3.
 */
def str = "dagdsaghdfd"
def rge = 1..9
def rge2 = 1..<9                // 不包含9
def list = ['ad', 'sg', 'dg']
def map = ['a':4, 'b':4, 'g':0]

for(i in str){
    print(i + " ")    //d a g d s a g h d f d
}
println()
for(i in rge){
    print(i + " ")    //1 2 3 4 5 6 7 8 9
}
println()
for(i in rge2){
    print(i + " ")    //1 2 3 4 5 6 7 8
}
println()
for(i in list){
    print(i + " ")    //ad sg dg
}
println()
for(i in map){
    print(i.key + "-" + i.value + " ")  //a-4 b-4 g-0
}