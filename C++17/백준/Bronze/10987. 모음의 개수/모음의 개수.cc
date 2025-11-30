#include<bits/stdc++.h>
using namespace std;
int n,x,y,ret,sum,l,a,b,c,d;
string s;
vector<int>v,v1;

void check(string s){
	for(auto i:s){
		if(i=='a'
		||i=='e'
		||i=='i'
		||i=='o'
		||i=='u'
		)ret++;
	}
}

int main(){
	cin>>s;
	check(s);
	cout<<ret;
}