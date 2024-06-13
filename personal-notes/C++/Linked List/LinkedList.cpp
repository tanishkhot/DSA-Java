#include <iostream>
using namespace std;

class node{
    public:
    int data;
    node* next;

    node(int val){
        data = val;
        next = NULL;
    }
};

void insertAtTail(node* &head, int val){

    node* n = new node(val);  // This line declare a pointer variable called n. And creates an object of class node in Heap memory
    node* temp = head;

    if(head == NULL){
        head = n;
        return;
    }

    while(temp->next != NULL){
        temp = temp ->next;
    }
    temp -> next =n;
}

void del(node* &head, int val){
    
    node* temp = head;
    node* temp2 = head;
    while(temp->next->data != val){
        temp = temp->next;
    }
    node* todelete = temp->next;
    temp->next = temp-> next->next;

    delete todelete;

//     while(temp2->data != val){
//         temp2 = temp2 ->next;
//     }
//     temp->next = temp2;
// }
}
void display(node* head){       // simply taking head means taking head by value, not be reference, as we do not have to change anything 
    node* temp = head;
    while(temp!= NULL){
        cout << temp->data<< " ";
        temp = temp -> next;
    }
}

int main() {

    node* head = NULL;
    insertAtTail(head, 1);
    insertAtTail(head, 2);
    insertAtTail(head, 3);
    insertAtTail(head, 4);
    display(head);

    return 0;


    
}