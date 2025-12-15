#include<bits/stdc++.h>
using namespace std;
int n,ret;

int main(){
	vector<int>v;
	for(int i=1;i<10;i++){
		v.push_back(i);
	}
	for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
			v.push_back(v[i]*v[j]);
		}
	}
	cin>>n;
	for(auto i:v){
		if(i==n){
			cout<<1;
			return 0;
		}
	}
	cout<<0;
}