#include <iostream>
using namespace std;

// e.g
//n = 5
// *****
// ****
// ***
// **
// *


int main(int argc, char const *argv[])
{
	cout << "Pattern 19" << endl;
	int n;
	cin >> n;
	int i = 1;
	while(i<=n){
		int j = n - i + 1;
		while(j>0){
			cout << "*";
			j = j - 1;
		}
		cout<<endl;
		i = i + 1;
	}
	return 0;
}

