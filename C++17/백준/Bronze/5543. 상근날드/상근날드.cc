#include<bits/stdc++.h>
using namespace std;
int n,a,b,c,sum,mn=1e9,ret=-50;
vector<int>v;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	for(int i=0;i<3;i++){
		int temp;
		cin>>temp;
		mn = min(mn,temp);
	}
	ret+=mn;
	mn = 1e9;
	for(int i=0;i<2;i++){
		int temp;
		cin>>temp;
		mn = min(mn,temp);
	}
	ret+=mn;
	cout<<ret;
		
	
}