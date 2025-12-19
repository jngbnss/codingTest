#include<bits/stdc++.h>
using namespace std;
int t,n;
const int MAX = 1000000;
int arr[MAX + 1];
void go(){
	arr[0]=arr[1] = 1;
	for(int i=2;i*i<=MAX;i++){
		if(arr[i]==0){
			for(int j=i*i;j<=MAX;j+=i){
				arr[j] = 1;
			}
		}
	}
}

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	go();

	cin>>t;
	while(t--){
		cin>>n;
		int cnt =0;
		for(int i=2;i<=n/2;i++){
			if(arr[i]==0&&arr[n-i]==0) cnt++;
		}
		cout<<cnt<<'\n';
	}
}
		