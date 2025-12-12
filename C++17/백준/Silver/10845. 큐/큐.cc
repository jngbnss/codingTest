#include<bits/stdc++.h>
using namespace std;
int n,x;
queue<int>stk;
vector<long long>v;
string s;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>s;
		if(s=="push"){
			cin>>x;
			stk.push(x);
		}
		else if(s=="pop"){
			if(stk.size()){
				cout<<stk.front()<<'\n';
				stk.pop();
			}else cout<<-1<<'\n';
		}
		else if(s=="size"){
				cout<<stk.size()<<'\n';
			
		}
		else if(s=="empty"){
			if(stk.size()){
				cout<<0<<'\n';
			}else cout<<1<<'\n';
		}
		else if(s=="front"){
			if(stk.size()){
				cout<<stk.front()<<'\n';
			}else cout<<-1<<'\n';
		}
		else if(s=="back"){
			if(stk.size()){
				cout<<stk.back()<<'\n';
			}else cout<<-1<<'\n';
		}
	}
}