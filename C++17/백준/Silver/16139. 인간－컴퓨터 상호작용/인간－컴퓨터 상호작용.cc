#include<bits/stdc++.h>
using namespace std;
string s;
long long n,a,b,cnt;
char c;
string psum[200004];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>s;
	for(int i=1;i<=s.size();i++){
		psum[i] = psum[i-1]+s[i-1];
	}
	for(int i=1;i<=s.size();i++){
//		cout<<i<<" : "<<psum[i]<<'\n';
	}
	cin>>n;
	for(int i=0;i<n;i++){
		cnt = 0;
		cin>>c>>a>>b;
		for(auto i:psum[b+1]){
			if(i==c) cnt++;
		}
		
//		cout<<cnt<<' ';
		
		for(auto i:psum[a]){
			if(i==c) cnt--;
		}
		cout<<cnt<<'\n';
	}
}