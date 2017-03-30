//https://www.hackerrank.com/challenges/cpp-sets

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


int main() {
    int q;
    cin>>q;
    set<int>s;
    while(q--){
        int x,y;
        cin>>y>>x;
        if(y==1)s.insert(x);
        else if(y==2)s.erase(x);
        else cout<<(s.count(x)?"Yes":"No")<<"\n";   
    }
    return 0;
}
