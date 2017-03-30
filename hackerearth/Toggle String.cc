    //https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/
	
	#include <iostream>
    #include <string>
    using namespace std;

    int main()
    {
    	string a;
    	int p;
    	cin>>a;
   
    	for(int i=0;i<a.size();++i){
    		p=(int) a[i];

    		if(p<91&&p>64)
    		{
    			a[i]+=32;
    		}

    		else if(p>96&&p<96+27)
    		  	a[i]-=32;
    	}

        cout << a;
        return 0;
    }