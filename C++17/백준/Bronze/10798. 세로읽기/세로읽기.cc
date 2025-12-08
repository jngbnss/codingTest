#include<bits/stdc++.h>
using namespace std;
int a,b;
map<int,int>mp,mp1;
string s,ret;
char arr[20][20];

int main(){
	for(int i=0;i<5;i++){
		cin>>s;
		for(int j=0;j<s.size();j++){
			arr[i][j] = s[j];
		}
	}
	
	for(int i=0;i<15;i++){
		for(int j=0;j<5;j++){
			if(arr[j][i]){
				ret+=arr[j][i];
			}
		}
	}
	cout<<ret;
		
}