#include<bits/stdc++.h>
using namespace std;
int main(){
	int ret = 300;
	int n;
	for(int i=0;i<4;i++){
		cin>>n;
		ret+=n;
	}
	if(ret<=1800){
		cout<<"Yes";
	}else{
		cout<<"No";
	}
}