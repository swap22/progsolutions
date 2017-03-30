link to the question https://www.hackerrank.com/challenges/c-tutorial-stringstream

#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
    int num;
    char ch;
    vector<int>res;//  vector to store the int
    stringstream s (str);//stringstream object to deal with the modification of the string
       while (s >> num){//While the stringstream object does not hit a null byte & Extract the comma seperated ints with the extraction >> operator
           res.push_back(num);
        if (s.eof()) {
            break;
        }
        s >> ch;
           
       } 
    return res;
    // Complete this function
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}
