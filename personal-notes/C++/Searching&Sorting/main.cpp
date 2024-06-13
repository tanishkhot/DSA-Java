#include<iostream>

using namespace std;

struct Students{
    string name;
    int rollNumber;
    float sgpa;

    Students(string name, int rn, float spga){
        name = name;
        rollNumber = rn;
        sgpa = sgpa;
    }
};


void bubbleSort(Students stud[], int n){        //n is the size of the array
    for(int i = 0; i< n-1; i++){
        for(int j =0 ; j < n-1 ;j++){
            if(stud[j].rollNumber > stud[j+1].rollNumber){
                Students temp = stud[j];
                stud[j] = stud[j+1];
                stud[j+1] = temp;
            }
        }
    }
}

void swap(int *a, int*b){
    int t = *a;
    *a = *b;
    *b = t;
}


int partition(int arr[],int low, int high){
    int pivot = arr[high];
    int i = low-1;
    for(int j =low; j < high; j ++){
        if(arr[j] < pivot){
            i++;
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i+1], &arr[high]);
    return (i+1);
}
void quickSort(int arr[], int low, int high){
    if(low < high){
        int partitionIndex = partition(arr, low, high);

        quickSort(arr,low, partitionIndex-1);
        quickSort(arr, partitionIndex+1, high);
    }

}

int main(){
   /* cout << "Create a database: "<< endl;

    Students studentDatabase[5] = {     //similar to int arr[5];
        {"Alics", 23, 10},
        {"Alics", 23, 10},
        {"Alics", 23, 10},
        {"Alics", 23, 10},
        {"Alics", 23, 10}
    };                   
*/
    int arr[] = {2,3,1,4,7,8,0}; 
    quickSort(arr, 0 ,6);
    

    for(int i = 0; i < 7; i++){
        cout << arr[i] << " ";
    }
}