#include<bits/stdc++.h>
using namespace std;
int n,a,b,k;
map<char,int>mp;
vector<int>v;

int main(){
	cin>>n>>k;
	for(int i=1;i<=n;i++){
		if(n%i==0){
			v.push_back(i);
		}
	}
	if(k>v.size()) cout<<0;
	else cout<<v[k-1];
}