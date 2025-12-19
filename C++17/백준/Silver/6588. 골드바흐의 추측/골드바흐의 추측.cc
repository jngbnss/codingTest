#include<bits/stdc++.h>
using namespace std;
const int mx=1000004;
int n,a,b;
int arr[mx];

void go(){
	arr[0]=arr[1] = 1;
	for(int i=2;i*i<=mx;i++){
		if(arr[i] ==0){
			for(int j=i*i;j<=mx;j+=i){
				arr[j] = 1;
			}
		}
	}
}

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	memset(arr,0,sizeof(arr));
	go();
//	for(int i=0;i<50;i++){
//		cout<<i<<" : "<<arr[i]<<'\n';
//	}
	while(true){
		cin>>n;
		if(n==0) return 0;
		bool check = false;
		for(int i=3;i<=n/2;i++){
			if(arr[i]==0&&arr[n-i]==0){
				a = i,b = n-i;
//				cout<<i<<'\n';
				check = true;
				cout<<n<<" = "<<a<<" + "<<b<<'\n';
				break;
			}
		}
		if(check==false) cout<<"Goldbach's conjecture is wrong.\n";
	}
}
		