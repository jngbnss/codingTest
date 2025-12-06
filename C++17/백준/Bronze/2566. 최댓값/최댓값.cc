#include<bits/stdc++.h>
using namespace std;
int n,m,mx,a,b;
int arr[103][103];

int main(){
	for(int i=0;i<9;i++){
		for(int j=0;j<9;j++){
			cin>>arr[i][j];
			mx= max(mx,arr[i][j]);
			if(mx==arr[i][j]){
				a = i,b=j;
			}
		}
	}
	cout<<mx<<'\n'<<a+1<<' '<<b+1;
			
}