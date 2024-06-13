// assignment 1, cpp
#include<bits/stdc++.h>
using namespace std;

struct Students {
    int rollNumber;
    float sgpa;
    string name;
};

class SEIT{
    struct Students s1[2];
    
    public:
    void enterData(){
	    for (int i = 0; i < 2; i++){
		cout<<"Enter Roll Number: ";
		cin >> s1[i].rollNumber;
		cout << "Enter Name: ";
		cin >> s1[i].name;
		cout << "Enter sgpa: ";
		cin >> s1[i].sgpa;
    	}
    }
    
    void bubbleSort(){
	    cout << "Bubblesort in descending order: ";
	    for(int i = 0; i < 2; i++){
		if(s1[i+1].rollNumber > s1[i].rollNumber){
		    swap(s1[i] , s1[i+1]);
		}
	    }
	    for(int i=0; i < 2; i++){
		cout << "Roll Number: "; 
		cout << s1[i].rollNumber << ", "; 
	    }
	}
    void display(){
    	    cout << "Name\t\tRoll Number\t\tSGPA\n";
    	    for(int i = 0; i < 2; i++){
    	    cout << s1[i].name <<"\t\t"<< s1[i].rollNumber <<"\t\t"<< s1[i].sgpa; 
    	    }
    
    }
	
    void seqSearch(){
	
	    cout << "This program will find the student who has the spga equal to the key.\nEnter key: \n";
	    int key;
	    cin >> key;
	    for(int i=0;i<2;i++){
		int flag = 0;
		if(key == s1[i].sgpa){
		    flag++;
		}
		if(flag == 1){
		    cout << s1[i].name;
		}
	    }
	}	
};

    

int main() {
    SEIT obj1;
    int ch;
    cout << "This is a program to store data of students and to sort the data of students.\nPlease enter your choice\n1. Enter data\n2. Display Data\n3. Sequential 	search\n4. Reorder in ascending order of roll number using bubble sort\n6. Exit\n";
    while (ch < 6){
    cin >> ch;
    switch(ch){
    	case 1: obj1.enterData();
    	        cin >> ch;
    	        break;
    	        
    	case 2: obj1.display();
    		cin >> ch;
    		break;
    	case 3: obj1.seqSearch();
    		cin >> ch;
    		break;
    	case 4: obj1.bubbleSort();
    		cin >> ch;
    		break; 
    	}
    }
}
