#include<iostream>
using namespace std;

class node{
public: 
    int data;
    node *next;
};

class sll{
  private:
    node *head;
  public:
    void create();
    void deletion();
    void insert();
    void reverse();
    void search();
    void display();
};                              //In C++, you need to put a semicolon at the end of every class defintion

void sll :: create(){
    node *temp, *New;
    int val;
    bool flag;
    char ans = 'y';
    flag = true;
    do{
        cout << "\nEnter the data: "<<endl;
        cin >> val;
        // Allocate memory to new nodes
        New = new node;
        if (New == NULL)
            cout << "\nUnable to allocate memory\n";
        New -> data = val;
        New -> next = NULL;
        if(flag == true){ //Executed only for the first time
            head = New;
            temp = head;
            flag = false;
        }
        else{
            // temp keeps track of most recently created node
            temp -> next = New;
            temp = New;
        }
        cout << "\nDo you want to enter more elements?(y/n)";
        cin >> ans;
    } while(ans == 'y' || ans == 'Y');
}

void sll :: display() {
    if (head == nullptr) {
        cout << "The list is empty." << endl;
        return;
    }
    node *temp = head;
    cout << "Linked List: ";
    while(temp != nullptr) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL" << endl;
}


int main(){
    sll list;    
    list.create();
    list.display();
    return 0;

}