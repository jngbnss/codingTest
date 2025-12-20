#include<bits/stdc++.h>
using namespace std;
int n,k;
int ret = -1e9;
int psum[204];

int main(){
	cin>>n>>k;
	for(int i=1;i<=n;i++){
		int temp;
		cin>>temp;
		psum[i] = psum[i-1]+temp;
	}
	
	for(int i=k;i<=n;i++){
		ret =max(ret,psum[i]-psum[i-k]);
	}
	cout<<ret;
}