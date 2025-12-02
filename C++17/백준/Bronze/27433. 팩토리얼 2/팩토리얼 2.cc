#include<bits/stdc++.h>
using namespace std;
long long n,ret=1;

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