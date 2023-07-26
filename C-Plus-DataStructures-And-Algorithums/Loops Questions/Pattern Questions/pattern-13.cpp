#include <iostream>
using namespace std;

// e.g
//n = 5
// ABCDE
// FGHIJ
// KLMNO
// PQRST
// UVWXY

void method1(int n){
	int i = 1;
	char ch;
	int count = 1;
	while(i<=n){
		int j = 1;
		while(j<=n){
			ch = 65 + count - 1;
			cout << ch;
			count = count + 1;
			j = j + 1;
		}
		cout<<endl;
		i = i + 1;
	}
}

void method2(int n){
	int i = 1;
	int count = 1;
	while(i<=n){
		int j = 1;
		while(j<=n){
			char ch ='A' + count - 1; 
			cout << ch;
			count = count + 1;
			j = j + 1;
		}
		cout<<endl;
		i = i + 1;
	}
}

int main(int argc, char const *argv[])
{
	cout << "Pattern 13" << endl;
	int n;
	cin >> n;
	method1(n);
	cout<<endl;
	method2(n);
	return 0;
}

