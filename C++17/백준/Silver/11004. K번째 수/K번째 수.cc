#include<bits/stdc++.h>
using namespace std;
int n,t,ret,cnt,m,temp,a,b,k;
string s;
map<int,int>mp;
vector<int>v;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n>>k;
	for(int i=0;i<n;i++){
		cin>>temp;
		v.push_back(temp);
	}
	sort(v.begin(),v.end());
	k--;
	cout<<v[k];
	
}