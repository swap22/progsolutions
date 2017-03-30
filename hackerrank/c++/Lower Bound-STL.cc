//https://www.hackerrank.com/challenges/cpp-lower-bound

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    vector<int>v(n);
    for(int i=0;i<n;++i){
        cin>>v[i];
    }
    int q,t;
    cin>>q;
    for(int j=0;j<q;++j){
        cin>>t;
        auto it=lower_bound(v.begin(),v.end(),t);
        cout<<(*it==t ? "Yes":"No")<<" "<<it-v.begin()+1<<endl;//output start with position 1
    }
    return 0;
}
