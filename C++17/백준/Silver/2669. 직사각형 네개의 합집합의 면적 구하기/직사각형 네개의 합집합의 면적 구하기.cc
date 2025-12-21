#include<bits/stdc++.h>
using namespace std;
int a,b,c,d,mx;
int arr[104][104];

int main(){
	int temp =4;
	while(temp--){
		cin>>a>>b>>c>>d;
		mx = max(mx,d);
		mx = max(mx,b);
		for(int i=b;i<d;i++){
			for(int j=a;j<c;j++){
				arr[i][j] = 1;
			}
		}
	}
	mx+=4;
	int cnt  =0;
	for(int i=0;i<100;i++){
		for(int j=0;j<100;j++){
	//		cout<<arr[i][j]<<' ';
			if(arr[i][j] ==1) cnt++;
		}//cout<<'\n';
	}
	cout<<cnt;
}