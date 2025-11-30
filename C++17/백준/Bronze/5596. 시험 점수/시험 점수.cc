#include<bits/stdc++.h>
using namespace std;
int n,x,y,ret,sum;
vector<int>v,v1;

int main(){
	for(int i=0;i<4;i++){
		cin>>n;
		v.push_back(n);
	}
	
	for(int i=0;i<4;i++){
		cin>>n;
		v1.push_back(n);
	}
	int ret1=0;
	for(auto i:v){
		ret+=i;
	}
	for(auto i:v1){
		ret1+=i;
	}
	cout<<max(ret,ret1);
	
}