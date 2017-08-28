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

print(selectSort([4,2,5,6,7,9,1,8,3,10]))