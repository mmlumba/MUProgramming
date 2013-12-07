/* Marian Lumba
IT-320-A
November 22, 2013
Homework 4
*/

#include <iostream>
#include <string>
using namespace std;

class method {
public:
	double area (string s, double a){ //formal parameter is (string s, double a)
		//parameter signature is whatever parameters are in the parentheses
		double shape = 0;
		if (s == "circle"){
			shape = circle(a);
		}
		else if(s == "square"){
			shape = square(a);
		}
		return shape;
	}
	double area (string s, double a, double b){ //subprogram declaration is double area (string s, double a, double b)
		double shape = 0;
		if (s == "rectangle"){
			shape = rectangle(a,b);
		}
		else if (s == "triangle"){
			shape = triangle(a,b);
		}
		else if (s == "parallelogram"){
			shape = parallelogram(a,b);
		}
		else{
			shape = ellipse(a,b);
		}
		return shape;
	}
	double area (string s, double a, double b, double c){ //subprogram declaration is also subprogram header
		double shape = 0;
		if (s == "trapezoid"){
			shape = trapezoid(a,b,c);
		}
		return shape;
	}
	double circle(double r){
		return 3.14159*r*r;
	}
	double square(double s){
		return s*s;
	}
	double rectangle(double w, double h){
		return w*h;
	}
	double triangle(double b, double h){
		return 0.5*b*h;
	}
	double parallelogram(double b, double h){
		return b*h;
	}
	double ellipse(double a, double b){
		return 3.14159*a*b;
	}
	double trapezoid(double a, double b, double h){
		return 0.5*(a+b)*h;
	}
}
;

int main(){
	while(true){
		cout << "Please select your choice to calculate the area: " << endl << "1. Circle" << endl << "2. Square" << endl << "3. Rectangle" << endl << "4. Triangle" << endl << "5. Parallelogram" << endl << "6. Ellipse" << endl << "7. Trapezoid" << endl << "8. Quit" << endl;
		method m;
		int choice;
		int q = 0;
		int a;
		double c;
		cin >> choice;
		if (choice == 1){
			cout << "How many circles would you like to find the area of? (1-10)" << endl;
			cin >> q;
			int circle_array[q];
			for (int i = 0; i < q; i++){
				cout << "Please enter the radius of circle " << (i+1) << ": " << endl;
				cin >> circle_array[i];
			}
			cout << "Results of your choice" << endl;
			for (int i = 0; i < q; i++){
				cout << "Circle " << (i+1) << ": Radius =" << circle_array[i] << ", Area =" << m.area("circle", circle_array[i]) << endl; //actual parameter is ("circle", circle_array[i])
				//m.area is subprogram call
			}
		}
		if (choice == 2){
			cout << "How many squares would you like to find the area of? (1-10)" << endl;
			cin >> q;
			int square_array[q];
			for (int i = 0; i < q; i++){
				cout << "Please enter the size of square " << (i+1) << ": " << endl;
				cin >> square_array[i];
			}
			cout << "Results of your choice" << endl;
			for (int i = 0; i < q; i++){
				cout << "Square " << (i+1) << ": Size =" << square_array[i] << ", Area =" << m.area("square", square_array[i]) << endl;
			}
		}
		if (choice == 3){
			cout << "How many rectangles would you like to find the area of? (1-10)" << endl;
			cin >> q;
			int width_array[q];
			int height_array[q];
			for (int i = 0; i < q; i++){
				cout << "Please enter the width of rectangle " << (i+1) << ": " << endl;
				cin >> width_array[i];
				cout << "Please enter the height of rectangle " << (i+1) << ": " << endl;
				cin >> height_array[i];
			}
			cout << "Results of your choice" << endl;
			for (int i = 0; i < q; i++){
				cout << "Rectangle " << (i+1) << ": width =" << width_array[i] << ", height =" << height_array[i] << ", Area =" << m.area("rectangle", width_array[i], height_array[i]) << endl;
			}
		}
		if (choice == 4){
			cout << "How many triangles would you like to find the area of? (1-10)" << endl;
			cin >> q;
			int base_array[q];
			int height_array[q];
			for (int i = 0; i < q; i++){
				cout << "Please enter the base of triangle " << (i+1) << ": " << endl;
				cin >> base_array[i];
				cout << "Please enter the height of triangle " << (i+1) << ": " << endl;
				cin >> height_array[i];
			}
			cout << "Results of your choice" << endl;
			for (int i = 0; i < q; i++){
				cout << "Triangle " << (i+1) << ": base =" << base_array[i] << ", height =" << height_array[i] << ", Area =" << m.area("triangle", base_array[i], height_array[i]) << endl;
			}
		}
		if (choice == 5){
			cout << "How many parallelograms would you like to find the area of? (1-10)" << endl;
			cin >> q;
			int base_array[q];
			int height_array[q];
			for (int i = 0; i < q; i++){
				cout << "Please enter the base of parallelogram " << (i+1) << ": " << endl;
				cin >> base_array[i];
				cout << "Please enter the height of parallelogram " << (i+1) << ": " << endl;
				cin >> height_array[i];
			}
			cout << "Results of your choice" << endl;
			for (int i = 0; i < q; i++){
				cout << "Parallelogram " << (i+1) << ": base =" << base_array[i] << ", height =" << height_array[i] << ", Area =" << m.area("parallelogram", base_array[i], height_array[i]) << endl;
			}
		}
		if (choice == 6){
			cout << "How many ellipses would you like to find the area of? (1-10)" << endl;
			cin >> q;
			int major_array[q];
			int minor_array[q];
			for (int i = 0; i < q; i++){
				cout << "Please enter the radius of the ellipse major axis " << (i+1) << ": " << endl;
				cin >> major_array[i];
				cout << "Please enter the height of the ellipse minor axis " << (i+1) << ": " << endl;
				cin >> minor_array[i];
			}
			cout << "Results of your choice" << endl;
			for (int i = 0; i < q; i++){
				cout << "Ellipse " << (i+1) << ": major axis =" << major_array[i] << ", minor axis =" << minor_array[i] << ", Area =" << m.area("ellipse", major_array[i], minor_array[i]) << endl;
			}
		}
		if (choice == 7){
			cout << "How many trapezoids would you like to find the area of? (1-10)" << endl;
			cin >> q;
			int s1_array[q];
			int s2_array[q];
			int height_array[q];
			for (int i = 0; i < q; i++){
				cout << "Please enter the first side of the trapezoid " << (i+1) << ": " << endl;
				cin >> s1_array[i];
				cout << "Please enter the second side of the trapezoid " << (i+1) << ": " << endl;
				cin >> s2_array[i];
				cout << "Please enter the height of the trapezoid " << (i+1) << ": " << endl;
				cin >> height_array[i];
			}
			cout << "Results of your choice" << endl;
			for (int i = 0; i < q; i++){
				cout << "Trapezoid " << (i+1) << ": side 1 =" << s1_array[i] << ", side 2 =" << s2_array[i] << ", height =" << height_array[i] << ", Area =" << m.area("trapezoid", s1_array[i], s2_array[i], height_array[i]) << endl;
			}
		}
		if (choice == 8){
			cout << "Thank you for using Marian's awesome program. Have a fabulous day!";
			break;
		}
	}
}
// to compile: g++ -o program hw4.cpp
// to execute: ./program

