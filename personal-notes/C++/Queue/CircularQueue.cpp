#include<iostream>
using namespace std;

/*
1. Fixed size
2. Front and Rear pointers are used.
*/

class CircularQueue{
    int * queue;
    int front, rear, size;

public:
    CircularQueue(int sz){
        size = sz;
        front = rear = -1;
        queue = new int[size];
    }

    bool isFull(){
        return front == (rear+1)%size;
    }

    bool isEmpty(){
        return front == -1;
    }

    void enqueue(int value){
        if(isFull()){
            cout << "Queue is full" << endl;
            return;
        }
        if(isEmpty()){
            front = rear = 0;
        }
        else{
            rear = (rear+1)%size;
        }
        queue[rear] = value;
    }

    int dequeue(){
        if(isEmpty()){
            cout << "Queue is empty" << endl;
            return -1;
        }
        int data = queue[front];

        if(front == rear){
            front = rear = -1;
        }
        else{
            front = (front + 1) % size;
        }
        return data;
    }

    void display(){
        int  i = front;
        do {
            cout << queue[i] << " " << endl;
            i = (i+1)%size;    
        } while( i != (rear + 1)%size);
    }

};


int main(){
    CircularQueue q1(5);



    q1.enqueue(1);
    q1.enqueue(2);
    q1.enqueue(3);
    q1.enqueue(4);
    q1.enqueue(5);
    q1.display();

    q1.dequeue();
    cout << endl << "New: " << endl;
    q1.display();
}