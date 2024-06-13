#include <iostream>
# define V 5
using namespace std;

int minKey(int key[], bool mstSet[]){
    int min = INT_MAX;
    int min_index;

    for(int i = 0; i < V; i++){
        if(mstSet[i] == false && key[i] < min){
            min = key[i];
            min_index = i;
        }
    }
    return min_index;
}

void primMST(int graph[V][V]){
    int parent[V];
    int key[V];
    bool mstSet[V];

    for(int i = 0; i < V; i++){
        mstSet[i] = false;
        key[i] = INT_MAX;
    }

}