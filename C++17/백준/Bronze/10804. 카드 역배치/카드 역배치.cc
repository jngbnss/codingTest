#include<bits/stdc++.h>
using namespace std;
long long n,m,ret=1,cnt,a,b,A=100,B=100;
vector<int>v;
int main(){
	for(int i=0;i<20;i++){
		v.push_back(i+1);
	}
	
	for(int i=0;i<10;i++){
		cin>>a>>b;
		reverse(v.begin()+a-1,v.begin()+b);
	}
	for(auto i:v){
		cout<<i<<' ';
	}
		
}