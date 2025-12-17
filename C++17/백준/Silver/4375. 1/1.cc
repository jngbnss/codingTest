#include<bits/stdc++.h>
using namespace std;
int n,ret,cnt;

int main(){
	while(cin>>n){
		ret = 1;
		cnt = 1;
		while(true){
			if(ret%n==0){
				cout<<cnt<<'\n';
				break;
				
			}else{
				ret*=10;
				ret+=1;
				ret%= n;
				cnt++;
			}
		}
	}
}