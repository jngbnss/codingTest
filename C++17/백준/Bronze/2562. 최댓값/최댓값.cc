#include<bits/stdc++.h>
using namespace std;
int n,ret,a,b,idx;
int main(){
	for(int i=1;i<10;i++){
		cin>>n;
		ret = max(ret,n);
		if(ret ==n) idx = i;
	}
	cout<<ret<<'\n'<<idx;
}