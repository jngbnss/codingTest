#include<bits/stdc++.h>
using namespace std;
int n,m,ret,a;
string s;
vector<int>v;
int main(){
	for(int i=0;i<4;i++){
		cin>>a;
		v.push_back(a);
	}
	sort(v.begin(),v.end());
	cout<<abs(v[0]+v[3]-(v[1]+v[2]));
	
}