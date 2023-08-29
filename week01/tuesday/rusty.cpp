/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    string name;
    int orderNumber;
    double price;
    
    cout << "What's your name?";
    
    // prompt the user for a name and a order number and a price
    
    
    // save the data into some variables
    cin >> name;
    cin >> orderNumber;
    cin >> price;
    
    cout << setprecision(2) << fixed;
    
    // then displays the information
    cout << "\nName: " << name;
    cout << "\nOrder Number: " << orderNumber;
    cout << "\nPrice: $" << price;

    return 0;
}
