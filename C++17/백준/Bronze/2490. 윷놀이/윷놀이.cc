
#include<bits/stdc++.h>
using namespace std;
int n,ret;
char arr[5]={'D','C','B','A','E'};
int main(){
	for(int i=0;i<3;i++){
		ret = 0;
		for(int j=0;j<4;j++){
			cin>>n;
			ret+=n;
		}
		
		cout<<arr[ret]<<'\n';
	}
}