//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/

#include <iostream>
#include <math.h>
using namespace std;

int main()
{
   int l,r,k;
   cin>>l>>r>>k;
   int a = (int)ceil(l / (k+0.0) );
    int b = (int)floor(r / (k+0.0) );
    int res = 0;
    if(a <= b){
        res = b - a + 1;
    }
    printf("%d\n", res);
    return 0;
}
