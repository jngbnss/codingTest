#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
string s;
long long n,a,b,cnt;
char c;
//string psum[3000000];
int psum[26][200001];
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>s;
	for(ll i=1;i<=s.size();i++){
		for(int c = 0;c<26;c++){
			psum[c][i] = psum[c][i-1];
		}
		psum[s[i-1]-'a'][i]++;
	}
//	for(ll i=1;i<=s.size();i++){
////		cout<<i<<" : "<<psum[i]<<'\n';
//	}
	cin>>n;
	for(ll i=0;i<n;i++){
		cnt = 0;
		cin>>c>>a>>b;
		int idx =c -'a';
		cout<<psum[idx][b+1]-psum[idx][a]<<'\n';
//		
//		for(auto i:psum[b+1]){
//			if(i==c) cnt++;
//		}
//		
////		cout<<cnt<<' ';
//		
//		for(auto i:psum[a]){
//			if(i==c) cnt--;
//		}
//		cout<<cnt<<'\n';
	}
}