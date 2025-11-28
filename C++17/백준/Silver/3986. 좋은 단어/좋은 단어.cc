#include<bits/stdc++.h>
using namespace std;
int n,t,ret,cnt,m,temp;
string s;
vector<int>v;
int arr[26];


int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>t;
	while(t--){
		cin>>s;
		stack<char>stk;
		for(auto i:s){
			if(stk.empty())stk.push(i);
			else if (stk.top()==i) stk.pop();
			else stk.push(i);
		}
		if(stk.empty()) cnt++;
	}
	cout<<cnt;
	
}

