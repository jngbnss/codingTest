#include<bits/stdc++.h>
using namespace std;
int n,target,a,b,cnt,temp,prev,ret=1;
vector<int>v;
int main(){
	cin>>n;
	if(n==0){
		cout<<1;
		return 0;
	}
	for(int i=1;i<=n;i++){
		ret*=i;
	}
	cout<<ret;
		
	
}