#include<bits/stdc++.h>
using namespace std;
string k;
long long l;

int main(){
	cin>>k>>l;
	
	int arr[l+4];
	memset(arr,0,sizeof(arr));
	for(int i=2;i*i<=l;i++){
		if(arr[i]==0){
			for(int j=i*i;j<=l;j+=i){
				arr[j] = 1;
			}
		}
	}
	for(int i=2;i<l;i++){
		if(arr[i] ==0){
			int mod =0;
			for(auto c:k){
				mod = (mod*10 +c-'0')%i;
			}if(mod==0){
				cout<<"BAD "<<i;
				return 0;
			}
		}
	}cout<<"GOOD";
}