#include <iostream>
using namespace std;

// e.g
//n = 5
// *****
//  ****
//   ***
//    **
//     *


int main(int argc, char const *argv[])
{
	cout << "Pattern 20" << endl;
	int n;
	cin >> n;
	int i = 1;
	while(i<=n){
		//space
		int space  = i - 1;
		while(space){
			cout << " ";
			space = space - 1;
		}
		//star
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

