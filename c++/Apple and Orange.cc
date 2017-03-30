#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;
int isInHouse(int s,int t,int d){
    if(((d>=s)&&(d <=t)))return 1;
    else return 0;
}

int main(){
    int ora=0,app=0;
    int s;
    int t;
    cin >> s >> t;
    int a;
    int b;
    cin >> a >> b;
    int m;
    int n;
    cin >> m >> n;
    vector<int> apple(m);
    for(int apple_i = 0;apple_i < m;apple_i++){
       cin >> apple[apple_i];
    }
    vector<int> orange(n);
    for(int orange_i = 0;orange_i < n;orange_i++){
       cin >> orange[orange_i];
    }
    for(int i=0;i<m;++i){
        if(!(apple[i]<0))
            app+=isInHouse(s, t, (apple[i]+a));
    }
    for(int j=0;j<n;++j){
        if(!(orange[j]>0))
            ora+=isInHouse(s, t,(orange[j]+b));
    }
    cout<<app<<endl;
    cout<<ora<<endl;
    
    return 0;
}
