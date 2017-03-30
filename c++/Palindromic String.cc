// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/

#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main()
{
	string s,p;

	cin>>s;
    p=s;
    reverse(p.begin(),p.end());
    if(s.compare(p)==0)
    cout<<"YES";
    else cout<<"NO";
  return 0;
}
