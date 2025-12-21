#include<bits/stdc++.h>
using namespace std;
int n;
int arr[100004];
map<int,int>mp;
set<int>st;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		int temp;
		cin>>temp;
		if(mp[temp]!=0) continue;
		mp[temp]++;
	}
	for(auto i:mp){
		cout<<i.first<<' ';
	}
}