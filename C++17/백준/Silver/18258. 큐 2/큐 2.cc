#include<bits/stdc++.h>
using namespace std;
int n;
queue<int>q;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	string s;
	int x;
	for(int i=0;i<n;i++){
		cin>>s;
		
		if(s=="push"){
			cin>>x;
			q.push(x);
		}
		else if(s=="pop"){
			if(q.size()){
				cout<<q.front()<<'\n';
				q.pop();
			}else cout<<-1<<'\n';
		}
		
		else if(s=="size"){
			cout<<q.size()<<'\n';
		}
		
		else if(s=="empty"){
			if(q.empty()) cout<<1<<'\n';
			else cout<<0<<'\n';
		}
		
		else if(s=="front"){
			if(q.size()) cout<<q.front()<<'\n';
			else cout<<-1<<'\n';
		}
		
		else if(s=="back"){
			if(q.size()) cout<<q.back()<<'\n';
			else cout<<-1<<'\n';
		}
	}
}