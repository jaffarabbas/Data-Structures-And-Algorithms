#include <iostream>
using namespace std;

// e.g
//n = 5
// 11111
//  2222
//   333
//    44
//     5


int main(int argc, char const *argv[])
{
	cout << "Pattern 21" << endl;
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
		//numbers
		int j = n - i + 1;
		while(j>0){
			cout << i;
			j = j - 1;
		}
		cout<<endl;
		i = i + 1;
	}
	return 0;
}

