#include<bits/stdc++.h>
using namespace std;
int n,ret;

int main(){
	cin>>n;
	for(int i=5;i<=n;i*=5){
		ret+=n/i;
	}
	cout<<ret;
}
		