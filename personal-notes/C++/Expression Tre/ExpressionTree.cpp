#include<iostream>
#include<string>
using namespace std;


class Stack{

    class Node {
    public:    
    int data;
    Node *next;

    Node(int val){
        data = val;        //data = val; not val = data. The data is something that stays inside the Node. We have to assign value to it.
        next = nullptr;
        }
    };


    public:
    Node *topNode;
    Stack(){
        topNode = nullptr;      //Why do we do this?
    }

    void push(int val){
        Node* newNode = new Node(val);        //this syntax is important to know. This is what matters. What is this? Go in depth.
        newNode -> next = topNode;
        topNode = newNode;
    }

    void pop(){
        Node* temp = topNode;
        topNode = topNode->next;
        delete temp;
    }

    int top(){
        if (topNode != nullptr){        //what is the difference between the topnode->next == nullptr and topNode == nullptr
            return topNode -> data;
        }
        else{
            return -1;
        }
    }

    bool isEmpty(){
        if(topNode == nullptr){
            return true;
        }
        else{
            return false;
        }
    }
};


class TreeNode{
    public:
        string value;
        TreeNode *left, *right;

        TreeNode(string postfix){
            value  = postfix;
            left = right = nullptr;
        }  
};

class ExpressTree{
    public:
        TreeNode* buildExpressionTree(const string postfix){
                Stack st;
                for(char ch : postfix){
                    if(isalpha(ch) || isdigit(ch)){
                        st.push(new TreeNode(string(1,ch)));

                    }
                }
        }
}