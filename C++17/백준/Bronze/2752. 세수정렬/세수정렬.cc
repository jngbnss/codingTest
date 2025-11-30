#include<bits/stdc++.h>
using namespace std;
int n,a,b,c;
vector<int>v;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	for(int i=0;i<3;i++){
		int temp;
		cin>>temp;
		v.push_back(temp);
	}
	sort(v.begin(),v.end());
	for(auto i:v){
		cout<<i<<' ';
	}
}