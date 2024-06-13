#include<iostream>
using namespace std;

// We have to write 2 main functions, heapify, and heapsort


void heapify(int arr[], int n, int i){
    int largest = i;
    int left = (2*i) +1;
    int right = (2*i) +2;
    

    if(left < n && arr[left] > arr[largest]){
        largest = left;
    } 

    if(right < n && arr[right] > arr[largest]){
        largest = right;
    }

    if(largest != i){
        swap(arr[0], arr[i]);
        heapify(arr, n, largest);
    }
}


//Write this twice
void heapsort(int arr[], int n, int i){
    
    //Do this only to heapsort it out once:
    for(int i = n/2 -1; i >= 0; i--){
        heapify(arr, n, i);
    }

    //Do this to actually swap and find elements:
    for(int i = n-1; i >=0; i--){
        swap(arr[0], arr[i]);

        heapify(arr, i , 0);
    }
}

