#include<iostream>
using namespace std;


int main() {
    int arr[5] = {1,2,3,4,5};
    int item = 2;

    int arrayLen = sizeof(arr)/sizeof(arr[0]);
    int low = 0;
    int high = arrayLen - 1;
    int result = -1;

    while (low <= high) {
        int mid = (low + high) / 2;
        if (item == arr[mid]){
            cout<<mid<<endl;  //输出的结果是下标
            return 0;
        }
        else if (item < arr[mid])
            high = mid - 1;
        else 
            low = mid + 1;
    }

    cout<<result<<endl;
    return 0;
}
