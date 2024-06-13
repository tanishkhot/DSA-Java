#include<iostream>
using namespace std;

class LinkedList{
    struct Node{
        int val;
        Node *next;      
    };
    
    public:
    Node *head;
    void insert(int val);
    void display();
    
    LinkedList(){
        head = NULL;
        
    }
};

void LinkedList::insert(int val){
    Node *newNode = new Node;
    Node *temp;
    temp = head;
    newNode -> val = val;
    newNode -> next = NULL;
    if(head == NULL){
        head = newNode;
    }
    else {
        while(temp -> next != NULL){
            temp = temp -> next;
        }
        temp -> next = newNode;
    }
}

void LinkedList::display(){
    Node *temp;
    temp = head;
    while(temp != NULL){
        cout << temp -> val << " -> ";
        temp = temp -> next;
    }
}

int main() {
    LinkedList Obj;
    Obj.insert(1);
    Obj.insert(2);
    Obj.insert(3);
    Obj.display();
}