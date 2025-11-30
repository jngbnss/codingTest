#include<bits/stdc++.h>
using namespace std;
int n,x,y,ret;

int main(){
	for(int i=0;i<4;i++){
		cin>>n;
		ret+=n;
	}
	
	cout<<ret/60<<'\n'<<ret%60;
	
}