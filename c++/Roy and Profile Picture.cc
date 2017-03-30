// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/roy-and-profile-picture/

#include <iostream>
using namespace std;

int main()
{
    int l,n,w,h;
    cin>>l;
    cin>>n;
    for(int i=0;i<n;++i){
        cin>>w>>h;
        if(l>w || l>h)cout<<"UPLOAD ANOTHER"<<endl;
        else{
            if(w==h)cout<<"ACCEPTED"<<endl;
            else cout<<"CROP IT"<<endl;
        }
    }
    return 0;
}