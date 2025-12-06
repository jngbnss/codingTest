#include<bits/stdc++.h>
using namespace std;
int n,m,mx,a,b;
string s;
map<char,int>mp;
int arr[26];

int main(){
	cin>>s;
	for(auto i:s){
		if(i>=97){
			arr[i-97]++;
		}else arr[i-65]++;
	}
	int mx = -1;
	for(auto i:arr){
		mx = max(mx,i);
	}
	string ret = "";
	for(int i=0;i<26;i++){
		if(arr[i]==mx){
			ret+=(char)i+65;
		}
	}
	if(ret.size()>1) cout<<"?";
	else cout<<ret;
			
			
}