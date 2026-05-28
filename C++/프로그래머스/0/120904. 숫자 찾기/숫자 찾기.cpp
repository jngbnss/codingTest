#include <string>
#include <vector>
#include<iostream>

using namespace std;

int solution(int num, int k) {
    int answer = -1;
    string n = to_string(num);
    char a = k+'0';
    int idx = 1;
    for(auto i:n){
        if(i==a){
            answer = idx;
            break;
        }
        idx++;
    }
    
    return answer;
}