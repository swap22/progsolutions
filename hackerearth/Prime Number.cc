//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/prime-number-8/

#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    int n;
   bool flag=false;
    cin>>n;
    
    for(int i=2;i<=n;i++){
         flag=false;
        for(int j=2;j<=sqrt(i);j++){
            
            if(i%j==0){
                flag=true;
                break;
            }
        }
        if(!flag && n!=1){
            cout<<i<<" ";
           
        }
    }
    return 0;
}