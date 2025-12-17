#include<bits/stdc++.h>
using namespace std;
int n,cnt;

int main(){
	cin>>n;
	for(int i=1;i<=n;i++){
		int temp = i;
		int ret = 0;
		while(temp>0){
			ret+= temp%10;
			temp/=10;
		}
//		cout<<ret;
		if(i%ret==0) cnt++;
	}
	cout<<cnt;
}