# -*- coding:utf-8 -*-

# -------- 书籍源码 -------- #
#查找数组中的最小数的索引
def findMinNumber(array) :
    min = array[0]
    min_index = 0
    for i in range(1, len(array)) :
        if array[i] < min :
            min = array[i]
            min_index = i
    return min_index


#选择排序
def selectSort(array) :
    newArray = []
    for i in range(len(array)) :
        min = findMinNumber(array)
        newArray.append(array.pop(min))
    return newArray


# -------- 不申请新内存代码 -------- #
def select_sort(arr):
    """
    选择排序 在原数组基础上交换
    :param arr: 待排序数组
    :return:
    """
    len_ = len(arr)
    for i in range(len_ - 1):
        for j in range(i + 1, len_):
            if arr[i] > arr[j]:
                arr[i], arr[j] = arr[j], arr[i]
    return arr

if __name__ == '__main__':
    # 书籍源码
    print(selectSort([4, 2, 5, 6, 7, 9, 1, 8, 3, 10]))
    # 不申请别的内存的代码
    print(select_sort([4, 2, 5, 6, 7, 9, 1, 8, 3, 10]))
