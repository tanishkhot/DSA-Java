#include <iostream>
#include <stack>
#include <string>
using namespace std;


class TreeNode{
    public:
    char value;
    TreeNode *left;
    TreeNode *right;

    TreeNode(char val){
        value = val;
        left = right = nullptr;
    }
};

bool isOperand(char ch){
    return isdigit(ch) || isalpha(ch);
}

bool isOperator(char ch){
    return ch == '+' || ch == '-'  || ch == '*' || ch == '/';
}

TreeNode* buildExpressionTree(const string& postfix){
    stack<TreeNode*> st;
    
    for(char ch :  postfix){
        if(isOperand(ch)){
            st.push(new TreeNode(ch));
        }
        else if(isOperator(ch)){
            TreeNode *newNode = new TreeNode(ch);
            newNode->left = st.top(); st.pop();
            newNode->right = st.top();st.pop();

            st.push(newNode);
        }
    }

    return st.empty() ? nullptr : st.top();
}
void recursiveInOrder(TreeNode* root) {
    if (root == nullptr) {
        return;
    }

    // First, deal with the left child
    recursiveInOrder(root->left);

    // Then, visit the current node
    cout << root->value << " ";

    // Finally, deal with the right child
    recursiveInOrder(root->right);
}


int main(){

    
    recursiveInOrder(buildExpressionTree("832+5*-"));
}