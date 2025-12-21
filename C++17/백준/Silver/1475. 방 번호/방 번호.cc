#include<bits/stdc++.h>
using namespace std;
string s;
map<char,int>mp;
int cnt;

int main(){
	cin>>s;
	for(auto i:s){
		mp[i]++;
	}
	
	for(int i=0;i<10;i++){
		if(i==6||i==9) continue;
		cnt = max(cnt,mp[char(i+'0')]);
	}
	int temp = mp['6']+mp['9'];
	int ret = temp/2;
	if(temp%2!=0) ret++;
	cnt = max(cnt,ret);
	cout<<cnt;
}