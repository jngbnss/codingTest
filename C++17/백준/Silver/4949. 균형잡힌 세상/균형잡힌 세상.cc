#include<bits/stdc++.h>
using namespace std;
string s,ret;

int main(){
	while(true){
		getline(cin,s);
		if(s=="."){
			return 0;
		}
		
		stack<char>stk;
		for(auto i:s){
			if(i=='(') stk.push(i);
			else if(i=='[') stk.push(i);
			else if(i==']'){
				if(stk.size()&&stk.top()=='[') stk.pop();
				else stk.push(i);
			}else if(i==')'){
				if(stk.size()&&stk.top()=='(') stk.pop();
				else stk.push(i);
			}
		}
		if(stk.size()) cout<<"no\n";
		else cout<<"yes\n";
	}
}