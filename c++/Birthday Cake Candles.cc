//https://www.hackerrank.com/challenges/birthday-cake-candles

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
    int n;
    cin >> n;
  
    int temp,count=0,current=0;
    while(cin>>temp){//untill last input extracted
        if(temp>current){
            current=temp;
            count=1;//if current is not maximum then start count again 
        }
        else if(temp==current)++count;
    }
    cout<<count;
    return 0;
}