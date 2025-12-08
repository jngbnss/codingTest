#include<bits/stdc++.h>
using namespace std;
int n,k,ret=1;

int main(){
	cin>>n>>k;
	
	for(int i=n;i>n-k;i--){
		ret*=i;
	}
	for(int i=k;i>0;i--){
		ret/=i;
	}
	cout<<ret;
}