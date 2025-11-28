#include<bits/stdc++.h>
using namespace std;
int n,t,ret,cnt,m,temp;
string s;
vector<int>v;
int arr[26];


int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n>>m;
	for(int i =0;i<n;i++){
		cin>>temp;
		v.push_back(temp);
	}
	sort(v.begin(),v.end());
	vector<int>v1 = v;
	sort(v.rbegin(),v.rend());
	// combi 
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(v[i]+v1[j]==m) cnt++;
		}
	}
	cout<<cnt/2;
}

