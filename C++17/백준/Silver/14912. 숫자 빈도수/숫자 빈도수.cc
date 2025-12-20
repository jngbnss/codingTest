#include<bits/stdc++.h>
using namespace std;
int n,cnt,t;

int main(){
	cin>>n>>t;
	for(int i=1;i<=n;i++){
		int temp = i;
		while(temp>0){
			if(temp%10==t) cnt++;
			temp/=10;
		}
	}
	cout<<cnt;
}