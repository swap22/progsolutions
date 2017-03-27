#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <cstring>
#include <algorithm>
using namespace std;


int main() {
    int t;
    char w[100];
    cin>>t;
    while(t--){
        cin>>w;
        bool flag=false;
        int i;
        for ( i=strlen(w);i>0;i--){
            if(w[i-1]<w[i]){
                flag=true;
                break;
           }
        }   
        if(!flag)cout<<"no answer"<<endl;
        else{
            char n=w[i-1];
            char big=w[i];
            int j=i+1,index=i;
        for(;j<strlen(w);j++)
        {
            if(w[j]>n && w[j]<big)
            {
                big=w[j];
                index=j;
            }    
        }    
        
        swap(w[i-1],w[index]);
        sort(w+i,w+strlen(w));
        cout<<w<<endl;
        
} 
        
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
