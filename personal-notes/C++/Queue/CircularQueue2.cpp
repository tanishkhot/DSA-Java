#include<iostream>
using namespace std;

class CircularQueue{
  public:
    int front, rear, size;
    int *queue;

    CircularQueue(int sz){
        size = sz;
        front = rear = -1;
        queue = new int[size];
    }


    bool isFull(){
        return  front == (rear+1) % size;
    }

    bool isEmpty(){
        return front == -1; 
    }


    void enqueue(int val){
        if(isFull()){
            cout << "Queue is full.";
            return;
        }
        if(isEmpty()){
            front = rear = 0;
        }
        else{
            rear = (rear +1) %size;
        }
        queue[rear] = val;
    };

    int dequeue(){
        if(isEmpty()){
            cout << "Queue is empty";
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
        int i = front;
        do{
            cout << queue[i] << " ";
            i = (i+1) % size; 
        } while(i != (rear+1) %size);
    }
};

int main(){

    CircularQueue q1(4);
    q1.enqueue(2);
    q1.enqueue(3);
    q1.enqueue(4);
    q1.enqueue(7);
    q1.display();

}