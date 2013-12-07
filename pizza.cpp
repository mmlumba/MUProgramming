#include <iostream>
#include <string>
using namespace std;

class method{
	public:
		double small(int a){
			return a*6.99;
		}
		double medium(int a){
			return a*8.99;
		}
		double large(int a){
			return a*12.50;
		}
}
;

int main(){
	while(true){
		method m;
		double price;
		cout << "What size of pizza would you like? (1=small, 2=medium, 3=large): " << endl;
		int size;
		cin >> size;
		cout << "How many pizzas would you like? " << endl;
		int quant;
		cin >> quant;
		if (size==1){
			price = m.small(quant);
		}
		else if (size==2){
			price = m.medium(quant);
		}
		else {
			price = m.large(quant);
		}
		cout << "Your order total is: " << price << endl << "Would you like to continue? Y or N: ";
		string s;
		cin >> s;
		if (s == "N"){
			cout << "Have a nice day!";
			break;
		}
	}
}