def quicksort(array) :
    if len(array) < 2 :
        return array
    else :
        pivot = array[0]
        less = [i for i in array[1:] if i <= pivot]
        greate = [i for i in array[1:] if i > pivot]
        return quicksort(less) + [pivot] + quicksort(greate)


array = [1,5,2,3,7,6]

print(quicksort(array))