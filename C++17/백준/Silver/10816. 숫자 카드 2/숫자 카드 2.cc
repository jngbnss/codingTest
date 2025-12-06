#include<bits/stdc++.h>
using namespace std;
long long n,m,k,sum,temp,mx=-4001,mn=4001;
vector<int>ret;
deque<int>v;
map<int,int>mp;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>temp;
		mp[temp]++;
	}
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>m;
		cout<<mp[m]<<' ';
	}
		
}
