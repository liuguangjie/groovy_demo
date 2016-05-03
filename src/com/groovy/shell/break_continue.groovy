package com.groovy.shell

/**
 * Created by Administrator on 2016/5/3.
 */
def lst1 = [4,56,7,5,4]
def lst2 = ['fdsg', 'afd', 'hg', 'z']

for (i in lst1) {
    print(i + "\t")
    for (j in lst2) {
        print(j + " ")
    }
    println()
}

println("11111111111111111111111111111111")

for (i in lst1) {
    print(i + "\t")

    if (i == 7)
        break    // 当遍历到7时，终止外循环，整个循环体结束

    for (j in lst2) {
        print(j + " ")
    }
    println()
}


println("\n22222222222222222222222222222222")

for (i in lst1) {
    print(i + "\t")

    if (i == 7)
        continue    // 当遍历到7时，跳过下面的子循环和换行。继续外循环，遍历集合中的下一个数值5

    for (j in lst2) {
        print(j + " ")
    }
    println()
}

println("\n3333333333333333333333333333333333333")

outside: for (n = 0; n<9; n++){
    println("\n------------" + n)
    center: for (i in lst1) {
        print(i + "\t")

        if (i == 7)
            continue outside    // 当遍历到7时，即跳转到指定名称的最外层循环，下面的子循环永远不执行

        inside: for (j in lst2) {
            print(j + " ")
        }
        println()
    }
}