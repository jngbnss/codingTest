#include<bits/stdc++.h>
using namespace std;
int n,ret=1e9;
string s;
map<char,int>mp;

int main(){
	cin>>n;
	cin>>s;
	for(auto i:s){
		if(i=='u'||
		i=='s'||
		i=='o'||
		i=='p'||
		i=='c') mp[i]++;
	}
	vector<char>need = {'u','o','s','p','c'};
	for(auto i:need){
		ret = min(ret,mp[i]);
	}
	cout<<ret;
}	