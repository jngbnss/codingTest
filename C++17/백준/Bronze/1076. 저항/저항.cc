#include<bits/stdc++.h>
using namespace std;
string a,b,c;
long long ret;
map<string,long long>mp1,mp;
int main(){
	cin>>a>>b>>c;
	mp["black"]=0;
	mp["brown"]=1;
	mp["red"]=2;
	mp["orange"]=3;
	mp["yellow"]=4;
	mp["green"]=5;
	mp["blue"]=6;
	mp["violet"]=7;
	mp["grey"]=8;
	mp["white"]=9;
	mp1["black"]=1;
	mp1["brown"]=10;
	mp1["red"]=100;
	mp1["orange"]=1000;
	mp1["yellow"]=10000;
	mp1["green"]=100000;
	mp1["blue"]=1000000;
	mp1["violet"]=10000000;
	mp1["grey"]=100000000;
	mp1["white"]=1000000000;
	ret = mp[a]*10+mp[b];
	ret*=mp1[c];
	cout<<ret;
}