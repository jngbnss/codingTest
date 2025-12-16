#include<bits/stdc++.h>
using namespace std;
int n;
string s;
char arr[100][100];

string go(int y,int x,int s){
	if(s==1) return string(1,arr[y][x]);
	
	string ret ="";
	char c=arr[y][x];
	
	for(int i=y;i<y+s;i++){
		for(int j=x;j<x+s;j++){
			if(c!=arr[i][j]){
				ret+="(";
				ret+=go(y,x,s/2);
				ret+=go(y,x+s/2,s/2);
				ret+=go(y+s/2,x,s/2);
				ret+=go(y+s/2,x+s/2,s/2);
				ret+=")";
				return ret;
			}
		}
	}
			
	
	return string(1,arr[y][x]);
}
	
	
	
	
int main(){
	cin>>n;
	
	for(int i=0;i<n;i++){
		cin>>s;
		for(int j=0;j<n;j++){
			arr[i][j] = s[j];
		}
	}
	cout<<go(0,0,n);
}