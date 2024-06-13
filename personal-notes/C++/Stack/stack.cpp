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

bool isOperator(char c){
    return (c == '+' || c == '-' || c == '*' || c == '/');
}

int precedence(char op){
    if(op == '*' || op == '/'){
        return 2;
    }
    else if(op  == '+' || op == '-'){
        return 1;
    }
    else{
        return 0;
    }
}

string infixToPostfix(string infix){
    Stack stack;
    string postfix;

    for(char c : infix){
        if(isalnum(c)){
            postfix += c;
        }
        else if(c == '('){
            stack.push(c);
        }
        else if(c == ')'){
            while(stack.top() != '('){
                postfix += stack.top();
                stack.pop();
            }
            if(!stack.isEmpty()){
                stack.pop();            //This somehow removed the brackets and
            }                           // did not allow them to be in the postfix expression                        
        }

        else if(isOperator(c)){

            while(!stack.isEmpty() && precedence(stack.top()) >= precedence(c)){
                postfix += stack.top();
                stack.pop();
            }
            stack.push(c);
        }
    }

    while (!stack.isEmpty()) {
        postfix += stack.top();
        stack.pop();
    }

    return postfix;
}

int evaluatePostfix(string postfix){
    Stack stack2;
    int result;
    for(char c : postfix){
        if(isalnum(c)){
            stack2.push(c - '0');
        }
        else if(isOperator(c)){
            if(stack2.isEmpty()){
                cout << "Insufficient operands. Please try again.";
                exit(1);
            }


            switch (c)
            {
            case '+':
                result = stack2.topNode->data + stack2.topNode->next->data;
                break;
            
            case '-':
                result = stack2.topNode->data - stack2.topNode->next->data;
                break;

            case '*':
                result = stack2.topNode->data * stack2.topNode->next->data;
                break;    
                
            case '/':
                result = stack2.topNode->data / stack2.topNode->next->data;
                break;    
            default:
                break;
            }
            stack2.pop();
            stack2.pop();
            stack2.push(result);
        }
    }
    return stack2.topNode->data;
};


int main() {
    string infix = "(A+B)(C-D)";
    string postfix = infixToPostfix(infix);
    cout << "Infix: " << infix << "\n";
    cout << "Postfix: " << postfix << std::endl;
    int result = evaluatePostfix("12+");    
    cout << result << endl;

    return 0;


}
//Node* newNode = new Node(int val)

