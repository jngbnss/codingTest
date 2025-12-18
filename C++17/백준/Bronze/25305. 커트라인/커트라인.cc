#include<bits/stdc++.h>
using namespace std;
int n,k,x;
vector<int>v;

int main(){
	cin>>n>>k;
	for(int i=0;i<n;i++){
		cin>>x;
		v.push_back(x);
	}
	sort(v.rbegin(),v.rend());
	
	cout<<v[k-1];
}
	