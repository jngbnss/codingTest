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
		||i=='A'
		||i=='E'
		||i=='I'
		||i=='O'
		||i=='U'
		
		
		)ret++;
	}
}

int main(){
	while(true){
		getline(cin,s);
		if(s=="#") return 0;
		ret = 0;
		check(s);
		cout<<ret<<'\n';
	}
}