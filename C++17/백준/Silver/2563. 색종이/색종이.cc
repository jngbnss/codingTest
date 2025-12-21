#include<bits/stdc++.h>
using namespace std;
int n;
int arr[104][104];
int main(){
	cin>>n;
	int a,b;
	while(n--){
		cin>>a>>b;
		int l = 10;
		for(int i=b;i<l+b;i++){
			for(int j=a;j<l+a;j++){
				arr[i][j] = 1;
			}
		}
	}
	
	int cnt =0;
	for(int i=0;i<100;i++){
		for(int j=0;j<100;j++){
			if(arr[i][j] ==1) cnt++;
//			cout<<arr[i][j]<<' ';
		}
		//cout<<'\n';
	}
	cout<<cnt;
}