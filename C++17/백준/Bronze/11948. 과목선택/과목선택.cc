#include<bits/stdc++.h>
using namespace std;
int a,b,c,d,e,f,sum;
string s;
vector<int>v;
int main(){
	for(int i=0;i<4;i++){
		cin>>a;
		v.push_back(a);
		sum+=a;
	}
	sort(v.begin(),v.end());
	sum-=v[0];
	int mx = 0;
	for(int i=0;i<2;i++){
		cin>>a;
		mx = max(mx,a);
	}
	cout<<sum+mx;
	
}