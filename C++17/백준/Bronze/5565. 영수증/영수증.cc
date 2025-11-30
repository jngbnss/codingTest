#include<bits/stdc++.h>
using namespace std;
int n,x,y,ret,sum;

int main(){
	cin>>sum;
	for(int i=0;i<9;i++){
		cin>>n;
		ret+=n;
	}
	cout<<sum-ret;
}