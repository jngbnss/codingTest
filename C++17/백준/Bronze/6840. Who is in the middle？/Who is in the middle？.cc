#include<bits/stdc++.h>
using namespace std;
int n,a,b,c,d,ret;
vector<int>v;
int main(){
	for(int i=0;i<3;i++){
		cin>>a;
		v.push_back(a);
	}
	sort(v.begin(),v.end());
	cout<<v[1];
}