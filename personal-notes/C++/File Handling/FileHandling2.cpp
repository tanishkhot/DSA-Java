#include<iostream>
#include<vector>
#include<fstream>
using namespace std;


class Student{
  public:
    string name;
    int rollNumber;
    float sgpa;

    Student(){}
    void getInput();    
};

void Student::getInput(){
    cout<<"Enter name: ";
    cin >> name;

    cout << "Enter roll number: ";
    cin >> rollNumber;

    cout << "Enter spga: ";
    cin >> sgpa;
}

void addStudent(vector<Student> studentDatabase){
    Student newStudent;
    newStudent.getInput();
    studentDatabase.push_back(newStudent);
}

void printStudents(const vector<Student> & studentDatabase){
    for(const Student& student : studentDatabase){
    cout << "Name: " << student.name << "Roll number: " << student.rollNumber << "SGPA: " << student.sgpa << endl;
    }
}

void saveToFile(const vector<Student> & studentDatabase){
    ofstream outFile("Students2.txt");
    outFile << "Name: \t\tRoll Number: \t\tSGPA: "<<endl;
    for(const Student &student : studentDatabase){
        outFile << student.name << "\t\t" << student.rollNumber << "\t\t" << student.sgpa << "\n";
    } 
    outFile.close();
    cout << "Data saved successfully." << endl;
}

void modifyStudent(vector<Student> &studentDatabase){
    int rollNumber;
    cout << "Enter the roll number that you want to modify: " << endl;
    cin >> rollNumber;
    for(Student& student : studentDatabase){
        if(student.rollNumber == rollNumber){
        
        cout<<"Enter name: ";
        cin >> student.name;

        cout << "Enter roll number: ";
        cin >> student.rollNumber;

        cout << "Enter spga: ";
        cin >> student.sgpa;
        }
    }
}


void deleteRecord(vector<Student> &studentDatabase){
    int rollNumber;
    cout << "Enter the record you want to delete: " << endl;
    cin >> rollNumber;

    bool found = false;
    for(Student &student : studentDatabase){
        for(int i = 0 ; i < studentDatabase.size(); i++){
            if(studentDatabase[i].rollNumber == rollNumber){
                studentDatabase.erase(studentDatabase.begin() + i);
                found = true;
                break;
            }
        }
    }
    
}
