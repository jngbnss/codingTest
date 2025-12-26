#include<bits/stdc++.h>
using namespace std;
int n,temp,ret;


int main(){
	cin>>n;
	vector<int>v(n+4),v1(n+4);
	for(int i=1;i<=n;i++){
		cin>>temp;
		v[i] = temp+v[i-1];
	}
	
	for(int i=1;i<=n;i++){
		cin>>temp;
		v1[i] = temp+v1[i-1];
	}
	
	for(int i=1;i<=n;i++){
//		cout<<v[i]<<' '<<v1[i]<<'\n';
		if(v[i]==v1[i]){
			ret = i;
		}
	}
cout<<ret;
}      