#include <string>
#include <vector>

using namespace std;

int solution(string s) {
    int answer = 0;
    bool flag = false;
    
    for(auto i: s){
        if(i=='-'){
            flag = true;
            continue;
        }else if(i=='+'){
            continue;
        }
            
        answer*=10;
        answer+= i-'0';
        
    }
    if(flag){
        answer*=-1;
    }
    return answer;
}