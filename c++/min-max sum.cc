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


int main(){
    long int a[5];
    /*long int b;
    long int c;
    long int d;
    long int e;*/
    long int max=0,min=999999999,sum=0,temp=0;
    for(int i=0;i<5;++i){
    cin >>a[i];
        sum+=a[i];
        if(max<a[i])max=a[i];
        if(min>a[i])min=a[i];
    }
    temp=max;
    //cout<<min<<" "<<max<<" "<<temp<<endl;
    max=sum-min;
    min=sum-temp;
    cout<<min<<" "<<max;
    
    return 0;
}
