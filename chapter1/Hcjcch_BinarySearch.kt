package com.hcjcch.datastructure

/**
 * BinarySearch
 *
 * @author huangchen
 * @date 2018/1/2
 */
fun main(args: Array<String>) {
    println(binarySearch(listOf(1, 3, 5, 7, 9, 13, 14, 17, 19), 6))
    println(binarySearch(listOf(1, 3, 5, 7, 9, 13, 14, 17, 19), 13))
    println(binarySearch(listOf(1, 3, 5, 7, 9, 13, 14, 17, 19), 29))
}

/**
 * 二分搜索
 *
 * @param list 已排序的数组
 * @param target 待查询的目标值
 * @return 目标值在列表中的索引，从0开始，未查询到时返回-1
 */
fun binarySearch(list: List<Int>, target: Int): Int {
    var lowIndex = 0
    var highIndex = list.size - 1
    while (lowIndex <= highIndex) {
        val middle = (lowIndex + highIndex) / 2
        val guess = list[middle]
        when {
            guess == target -> return middle
            guess < target -> lowIndex = middle + 1
            else -> highIndex = middle - 1
        }
    }
    return -1
}