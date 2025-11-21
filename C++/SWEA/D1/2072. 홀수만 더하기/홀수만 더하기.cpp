#include<bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	int cnt = 1;
	while(t--){
		int sum = 0;
		int temp;
		for(int i=0;i<10;i++){
			cin>>temp;
			if(temp%2!=0){
				sum+=temp;
			}
		}
		cout<<"#"<<cnt<<' '<<sum<<'\n';
		cnt++;
	}
}
			
			