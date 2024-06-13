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
        void deletion(int pos);
    
    LinkedList(){
        head = NULL;
    }
    
};


void LinkedList::insert(int val){
    Node *newNode, *temp;
    newNode = new Node;
    temp = head;
    newNode -> val = val;
    newNode -> next = NULL;
    if(head==NULL){
        head = newNode;   
    }
    else{
        while(temp->next != NULL){
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

void LinkedList::deletion(int pos){
    Node *curr;
    Node *prev;
    curr = head;
    if(pos == 1){
        Node *temp;
        temp = head;
        head = head -> next;
        delete temp;
        return;
    }
    for (int i = 0; i < pos - 1; i ++){
        prev = curr;                                        //important step
        curr = curr -> next;
    }
    prev -> next = curr -> next;

    delete curr;
}

int main(){
    LinkedList L;
    L.insert(1);
    L.insert(2);
    L.insert(3);
    L.insert(4);
    L.display();
    cout << endl;
    L.deletion(1);
    L.display();
}

























