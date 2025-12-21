#include<bits/stdc++.h>
using namespace std;
int n,temp;
vector<int>v;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	cin>>n;
	while(n--){
		cin>>temp;
		v.push_back(temp);
	}
	sort(v.rbegin(),v.rend());
	for(auto i:v){
		cout<<i<<'\n';
	}
}