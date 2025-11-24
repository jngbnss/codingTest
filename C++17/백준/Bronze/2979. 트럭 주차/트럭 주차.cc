#include<bits/stdc++.h>
using namespace std;
int a,b,c,ret,s,e,mx;
int arr[104];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>a>>b>>c;
	for(int i=0;i<3;i++){
		cin>>s>>e;
		mx = max(mx,e);
		for(int i=s;i<e;i++){
			arr[i]++;
		}
	}
	for(int i=0;i<mx;i++){
		if(arr[i]==3){
			ret+=c*3;
		}else if(arr[i]==2){
			ret+=b*2;
		}else if(arr[i] ==1){
			ret+=a;
		}
	}
	cout<<ret;
}