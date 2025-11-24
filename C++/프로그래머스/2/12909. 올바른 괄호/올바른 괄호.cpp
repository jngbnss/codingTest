#include<bits/stdc++.h>
using namespace std;

bool solution(string s)
{
    bool answer = true;
    stack<char>stk;
    for(auto i:s){
        if(i=='('){
            stk.push(i);
        }else{
            if(stk.size()&&stk.top()=='(') stk.pop();
            else stk.push(i);
        }
    }
    if(stk.size()) answer = false;

    return answer;
}