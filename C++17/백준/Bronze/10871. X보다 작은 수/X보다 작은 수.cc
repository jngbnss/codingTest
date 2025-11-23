#include<bits/stdc++.h>
using namespace std;
int n,a,b,ret,x,temp;
int A,B,C;
vector<int>v;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n>>x;
	for(int i=0;i<n;i++){
		cin>>temp;
		if(temp<x){
			v.push_back(temp);
		}
	}
	for(auto i:v){
		cout<<i<<' ';
	}
}