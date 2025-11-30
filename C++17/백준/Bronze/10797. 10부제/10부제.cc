#include<bits/stdc++.h>
using namespace std;
long long n,a,b,c,sum,mn=1e9,ret=0;
vector<int>v;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	for(int i=0;i<5;i++){
		cin>>a;
		v.push_back(a);
	}
	for(auto i:v){
		if(i==n) ret++;
	}
	cout<<ret;
		
	
}