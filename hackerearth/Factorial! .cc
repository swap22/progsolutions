//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-factorial/


#include <iostream>
using namespace std;

int main()
{
	int N ,fac=1;
	
	cin>>N;
	
	for(int i=1; i<=N; ++i){
		fac=fac*i;
		}
	
	cout<<fac<<endl;
    return 0;
}
