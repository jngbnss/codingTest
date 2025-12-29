#include<bits/stdc++.h>
using namespace std;
int n,k;

int main(){
	cin>>n;
	
	for(int i=1;i<=100;i++){
		if(1+i+i*i==n){
			cout<<i;
			return 0;
		}
	}
}