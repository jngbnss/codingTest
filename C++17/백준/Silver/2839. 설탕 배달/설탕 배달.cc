#include<bits/stdc++.h>
using namespace std;
int n;
int ret=1e9;

int main(){
	cin>>n;
	for(int i = n/5;i>=0;i--){
		int temp = i;
		int remain = n-(i*5);
		if(remain%3==0){
			temp+=remain/3;
			ret = min(ret,temp);
		}
	}
	if(ret!=1e9) cout<<ret; 
	else cout<<-1;
}