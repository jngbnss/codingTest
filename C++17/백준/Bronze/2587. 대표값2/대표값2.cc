#include<bits/stdc++.h>
using namespace std;
int n,sum;
vector<int>v;

int main(){
	for(int i=0;i<5;i++){
		cin>>n;
		v.push_back(n);
		sum+=n;
		
	}
	sort(v.begin(),v.end());
	cout<<sum/5<<'\n'<<v[2];
}