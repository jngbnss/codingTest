#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;

long long solution(long long n) {
    long long answer = 0;
    vector<int>v;
    while(n>0){
        v.push_back(n%10);
        n/=10;
        
        
        
    }
    sort(v.rbegin(),v.rend());
    for(auto i:v){
        answer*=10;
        answer+=i;
    }
    return answer;
}