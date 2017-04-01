// https://www.hackerrank.com/challenges/deque-stl



#include <iostream>
#include <deque> 
#include <algorithm>
using namespace std;
void printKMax(int a[], int n, int k){
   //Write your code here.
    deque<int>d;
    int max=a[0];
    d.push_back(a[0]);
    for(int i=1;i<k;++i){        //creating one deque;
        d.push_back(a[i]);
        max=max>a[i] ? max : a[i];
    }
    for(int i=k;i<n;++i){
        cout<<max<<" ";
        int temp=d.front();
        d.pop_front();// removing an element from front
        if(temp == max && !d.empty()){    // condition to ignore other deque element if it is not max 
            max = *(max_element(d.begin(), d.end()));
        }
        d.push_back(a[i]); // adding element at back
       
        	max = (d.size()==1) ? a[i] : max>a[i] ? max : a[i];	//if the deque is remain for size 1 	
    }
    cout<<max;
     cout<<endl;
}
int main(){
  
   int t;
   cin >> t;
   while(t>0) {
      int n,k;
       cin >> n >> k;
       int i;
       int arr[n];
       for(i=0;i<n;i++)
            cin >> arr[i];
       printKMax(arr, n, k);
       t--;
     }
     return 0;
}
