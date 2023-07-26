#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
	int n;
	cin >> n;
	int a=0,b=1;
	cout << a << " " << b << " ";
	for (int i = 0; i < n; ++i)
	{
		int sum = a + b;
		cout << sum << " ";
		a = b;
		b = sum;
	}
	return 0;
}