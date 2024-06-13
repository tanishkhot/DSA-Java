#include<iostream>
using namespace std;

class Node{
  public:
    int data;
    bool lbit, rbit;
    Node *left, *right;

    Node(int value){
        data = value;
        lbit = rbit = 0;
        left = right = nullptr;
    }
};

class ThreadedBinaryTree{
    public: 
    Node *root;
    ThreadedBinaryTree(){
            root = nullptr;
    }

    void insert(int key){

        Node *newNode = new Node(key);    

        if(root == nullptr){
            root = newNode;
            return;
        }


        Node *current = root;
        Node *parent = nullptr;


        //To find the node where we can insert data:
        while(current != nullptr){          
            parent = current;
            if(key < current->data){
                if(current -> lbit == false){
                    current = current -> left;
                }
                else {
                    break;
                }
            }
            else{
                if(current->rbit == false){
                    current = current -> right;
                }
                else{
                    break;
                }   
            }
        }

        if(key < parent -> data){
            newNode -> left = parent -> left;
            newNode->right = parent;
            parent -> lbit = true;
            parent -> left = newNode;
        }
        else {
            newNode->right = parent->right;
            newNode->left = parent;
            parent->rbit = true;
            parent->right = newNode;
        }

    }

    void inOrder() {
        Node* current = leftMost(root);
        while (current != nullptr) {
            cout << current->data << " ";
            if (current->right) current = current->right;
            else current = leftMost(current->right);
        }
        cout << endl;
    }


    Node* leftMost(Node* node) {
        if (node == nullptr) return nullptr;
        while (node->lbit == false) node = node->left;
        return node;
    }
};


int main() {
    ThreadedBinaryTree tbt;

    tbt.insert(10);
    tbt.insert(5);
    tbt.insert(20);
    tbt.insert(3);
    tbt.insert(7);

    cout << "In-order Traversal: ";
    tbt.inOrder();

    return 0;
}
