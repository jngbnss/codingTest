#include<bits/stdc++.h>
using namespace std;
int n,ret;

int main(){
	cin>>n;
	ret =2;
	for(int i=0;i<n;i++){
		ret = ret*2-1;
	}
	cout<<ret*ret;
}