//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/

#include <iostream>
#include <math.h>
using namespace std;

int main()
{
long long int n, i,res=1,a[1000];

cin>>n;
for( i=0; i<n; ++i){
	cin>>a[i];
	res=fmod((res*a[i]) , (1000000000+7));
}

cout << res;
    return 0;
}
