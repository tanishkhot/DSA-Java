#include<iostream>
using namespace std;


// BST Does not have non-recursive code
// Doing this without object oriented 
        struct Node{
            int data;
            Node *left, *right;
            Node(int val){
                data = val;
                left = right = NULL;
            }
};

        

void insert(Node *&root, int key){
    Node *newNode = new Node(key);
    if(root == NULL){
        root = newNode;
    }
    else if (root -> data > key){
        insert(root -> left, key);
    }
    else if (root -> data < key){
        insert(root -> right, key);
    }else{
        cout << "Invalid value";
    }
}

void inOrder(Node *&root){
    if (root==NULL){
       // cout << "This does not exist";
        return;
    }
    //else {
        inOrder(root -> left);
        cout << root -> data << " ";
        inOrder(root -> right);
   // }
}

void leaf(Node *&root){
    if(root == NULL){
        cout<< "No BST";
    }
    else{
        if(root->left==NULL && root->right==NULL){
            cout<<root->data;
        }
        if (root->left){
            leaf(root->left);
        }
        if(root->right){
            leaf(root->right);
        }
    }
}

   
int height(Node *&root){
    
    if(root  == NULL){
        return -1;
    }
    return (1+max(height(root->left),height(root->right)));
}

void search(Node *&root, int key){
    if(root == NULL){
        cout<< "Not found";
        return;
    }
    if(root -> data == key){
        cout << "Key found!"<< endl;
        cout << root -> data;
    }
    else if(key < root -> data){
        search(root -> left, key);
    }
    else if( key > root -> data){
        search(root -> right, key);
    }
    
}

int main(){
    Node *root = NULL;
    insert(root,5);
    insert(root,7);
    insert(root,6);
    insert(root,4);
    inOrder(root);

    search(root, 7);
    search(root,9);
    
    leaf(root);
    cout<<endl;
    cout<<height(root);
    
    return 0;
}