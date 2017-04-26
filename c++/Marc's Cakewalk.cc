//https://www.hackerrank.com/challenges/marcs-cakewalk

#include <bits/stdc++.h>

using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> calories(n);
    for(int calories_i = 0; calories_i < n; calories_i++){
       cin >> calories[calories_i];
    }
    // your code goes here
    long long int sum=0;
    sort(calories.begin(),calories.end());
    reverse(calories.begin(),calories.end());
   
    for(int i=0;i < calories.size();i++){
        sum+=calories[i]*pow(2,i);
    }
    cout<<sum;
    return 0;
}