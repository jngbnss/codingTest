#include<bits/stdc++.h>
using namespace std;
int n,m,ret,cnt,a,b;
int arr[10];

int main(){
//	for(int i=0;i<4;i++){
//		cin>>a>>b;
	while(cin>>a>>b){
		ret = b-a+1;
		cnt =0;
		for(int i=a;i<=b;i++){
				int temp =i;
				memset(arr,0,sizeof(arr));
				while(temp>0){
					arr[temp%10]++;
					if(arr[temp%10]==2){
						cnt++;
//						cout<<i<<' ';
						break;
					}
					temp/=10;
				
			}
//			cout<<cnt<<'\n';
		}cout<<ret-cnt<<'\n';
	}
}
				