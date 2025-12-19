#include<bits/stdc++.h>
using namespace std;
int n;
const int mx= 15485863;
long long arr[mx+1];
void go(){
	arr[0] = arr[1] = 1;
	for(int i=2;i*i<=mx;i++){
		if(arr[i]==0){
			for(int j=i*i;j<=mx;j+=i){
				arr[j] =1;
			}
		}
	}
}

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);
	cin>>n;
	go();
	int cnt =0;
	for(int i=0;;i++){
		if(arr[i]==0){
			cnt++;
//			cout<<cnt<<" : "<<i<<' '<<arr[i]<<'\n';
			if(cnt==n){
				cout<<i;
				return 0;
			}
		}
	}
}