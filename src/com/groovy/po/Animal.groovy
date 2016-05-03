package com.groovy.po

/**
 * Created by Administrator on 2016/5/3.
 */
abstract class Animal {
    def foot
    def ear
    def abstract eat ()
    String toString () {
        "Animal[脚:${foot}，耳朵:${ear}]"
    }
}
