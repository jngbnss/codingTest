#include<bits/stdc++.h>
using namespace std;
int n,ret;
int main(){
	for(int i=0;i<5;i++){
		cin>>n;
		ret+=n*n;
	}
	cout<<ret%10;
}