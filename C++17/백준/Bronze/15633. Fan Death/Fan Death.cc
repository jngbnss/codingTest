#include<bits/stdc++.h>
using namespace std;
int n,ret;
int main(){
	cin>>n;
	for(int i=1;i<=n;i++){
		if(n%i==0) ret+=i;
	}
	cout<<ret*5-24;
}