// link to problem https://www.hackerrank.com/challenges/cpp-maps


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    map<string,int>m; //created map
    int q;
    cin>>q;
    while(q--){
        int x;
        string s;
        cin>>x>>s;
        if(x==1){
            int y;
            cin>>y;
            m[s]+=y;
        }
        else if(x==2){
            m[s]=0;
        }
        else{
            cout<<m[s]<<endl;
        }
        
    }
    return 0;
}
