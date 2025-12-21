#include<bits/stdc++.h>
using namespace std;
int a[104][104],b[104][104],ret[104][104];
int y,x,n,m;

int main(){
	cin>>n>>m;
	y =n;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			cin>>a[i][j];
		}
	}
	cin>>n>>m;
	x=m;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			cin>>b[i][j];
		}
	}
	
	for(int i=0;i<y;i++){
		for(int j=0;j<x;j++){
			for(int k=0;k<n;k++){
				ret[i][j] += a[i][k]*b[k][j];
			}
		}
	}
	
	for(int i=0;i<y;i++){
		for(int j=0;j<x;j++){
			cout<<ret[i][j] <<' ';
		}cout<<'\n';
	}
}
	