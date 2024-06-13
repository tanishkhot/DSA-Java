#include <fstream>
#include <iostream>
#include <vector>
using namespace std;

class Student {
public:
    int rollNumber;
    float sgpa;
    string name;

    Student() = default;
    void getInput();
};

void Student::getInput() {
    cout << "Enter name: ";
    cin >> name;
    cout << "Enter SGPA: ";
    cin >> sgpa;
    cout << "Enter roll number: ";
    cin >> rollNumber;
}

void addStudent(vector<Student>& studentDatabase) {
    Student newStudent;
    newStudent.getInput();
    studentDatabase.push_back(newStudent);
}

void printStudents(const vector<Student>& studentDatabase) {
    for (const auto& student : studentDatabase) {
        cout << "Name: " << student.name << ", Roll Number: " << student.rollNumber << ", SGPA: " << student.sgpa << endl;
    }
}

void saveToFile(const vector<Student>& studentDatabase) {
    ofstream outFile("Students.txt");
    outFile << "Name\t\tRoll Number\t\tSGPA\n";
    for (const Student& student : studentDatabase) {
        outFile << student.name << "\t\t" << student.rollNumber << "\t\t" << student.sgpa << "\n";
    }
    outFile.close();
    cout << "Data saved to file." << endl;
}


void modifyStudent(vector<Student>& studentDatabase) {
    int rollNo;
    cout << "Enter the roll number of the student to modify: ";
    cin >> rollNo;

    for (Student &student : studentDatabase) {
        if (student.rollNumber == rollNo) {
            cout << "Enter new name: ";
            cin >> student.name;
            cout << "Enter new SGPA: ";
            cin >> student.sgpa;
            cout << "Student details updated.\n";
            return;
        }
    }

    cout << "Student with roll number " << rollNo << " not found.\n";
}


int main() {
    vector<Student> studentDatabase;
    int choice;

    do {
        cout << "1. Add Student\n2. Display Students\n3. Save to File\n4. Exit\nEnter choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                addStudent(studentDatabase);
                break;
            case 2:
                printStudents(studentDatabase);
                break;
            case 3:
                saveToFile(studentDatabase);
                break;
            case 5:
                modifyStudent(studentDatabase);
                break;
            case 4:
                cout << "Exiting program." << endl;
                break;
            
            default:
                cout << "Invalid choice. Please try again." << endl;
        }
    } while (choice != 4);

    return 0;
}
