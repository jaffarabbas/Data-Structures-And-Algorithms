#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
	cout << "Prime numbers" << endl;
	//if n will not divide reminder zero betwen 1 and n 
	//it will be prime
	int n;
	cin >> n;
	int i = 2;
	while(i<n){
		if(n%i==0){
			cout << "Not Prime" << endl;
		}else{
			cout << "Prime" << endl;
		}
		i = i + 1;
	}
	return 0;
}