#include<bits/stdc++.h>
using namespace std;
int n,ret,cnt;
char arr[104][104];
string s;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>s;
		for(int j=0;j<n;j++){
			arr[i][j] = s[j];
		}
	}
	
	for(int i=0;i<n;i++){
		cnt =0;
		for(int j=0;j<n;j++){
			if(arr[i][j]=='.'){
				cnt++;
			}else if(arr[i][j]=='X'){
				if(cnt>=2){
					ret++;
				}
				cnt=0;
			}
		}
		if(cnt>=2) ret++;
	}
	cout<<ret<<' ';
	
	ret =0;
	
	for(int j=0;j<n;j++){
		cnt =0;
		for(int i=0;i<n;i++){
			if(arr[i][j]=='.'){
				cnt++;
			}else if(arr[i][j]=='X'){
				if(cnt>=2){
					ret++;
				}
				cnt =0;
			}
		}
		if(cnt>=2) ret++;
	}
	cout<<ret<<' ';
	
	
}
				