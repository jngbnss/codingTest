#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll temp,ret;
ll psum[15];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	for(int i=1;i<=10;i++){
		cin>>temp;
		psum[i]=psum[i-1]+temp;
	}
	
	for(int i=1;i<=10;i++){
		if(psum[i]==100){
			ret=100;
			break;
		}else if(psum[i]>100){
			if(psum[i]-100<=100-psum[i-1]){
				ret=psum[i];
				break;
			}else {
				ret=psum[i-1];
				break;
			}
		}
	}
	if(ret==0) cout<<psum[10];
	else cout<<ret;
}