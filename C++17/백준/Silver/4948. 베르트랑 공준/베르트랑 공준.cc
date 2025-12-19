#include<bits/stdc++.h>
using namespace std;
int n;
bool arr[250000];

void go(){
	arr[0]=1;
	arr[1] = 1;
	for(int i=2;i*i<250000;i++){
		if(arr[i]==0){
			for(int j=i*i;j<=250000;j+=i){
				arr[j]=1;
			}
		}
	}
}
	

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	go();
	while(true){
		cin>>n;
		if(n==0) return 0;
		int cnt =0;
		for(int i=n+1;i<=2*n;i++){
			if(arr[i]==0) cnt++;
		}
		cout<<cnt<<'\n';
	}
}
		