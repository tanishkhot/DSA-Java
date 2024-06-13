#include<iostream>
using namespace std;


void heapify(int arr[], int n, int i){      //n is only used to limit the index of the array
    int largest = i;
    int left = (2*i) +1;
    int right = (2*i) +2;

    if(left < n && arr[left] > arr[largest]){
        largest = left;     
    }

    if(right < n && arr[right] > arr[largest]){
        largest = right;
    }

    if(largest != i){               //Everything here is in condition, so honestly, all that we are doing, is 
        swap(arr[i],arr[largest]);  //brining the largest element at index 0; If we do that, the rest is sorted out
        heapify(arr, n, largest);     
    }

    
}

void heapsort(int arr[], int n){
    for(int i = (n/2) - 1; i >= 0; i--){
        heapify(arr, n, i);
    }

    for(int i = n-1 ; i >= 0; i--){
        swap(arr[0], arr[i]);

        heapify(arr, i, 0);
    }
}

void printArray(int arr[], int n){
    for(int i =0; i < n ; i++){
        cout << arr[i] << " ";
    }
}

int main(){
    int arr[5] = {12,53,23,67,11};
    printArray(arr,5);
    cout<< endl<<endl;
    heapsort(arr,5);
    printArray(arr,5);
}