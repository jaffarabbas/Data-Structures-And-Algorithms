#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
	int n;
	cin >> n;
	bool flag = 1;
	for (int i = 2; i < n; ++i)
	{
		if(n%i==0){
			flag = 0;
			break;
		}
	}
	if(flag == 0){
		cout << "Not Prime";
	}else{
		cout << "Prime";
	}
	return 0;
}