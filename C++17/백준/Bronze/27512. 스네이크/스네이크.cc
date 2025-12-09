#include<bits/stdc++.h>
using namespace std;
long long n,m,a,b,d,e,cnt,ret,temp;
char c;
map<char,int>mp = {{'R',0},{'B',0}};
int arr[] = {10,8,6,5,4,3,2,1,0};
string s;
vector<long long>v;
int main(){
	cin>>n>>m;
	if(n%2==0||m%2==0){
		cout<<n*m;
	}else cout<<n*m-1;
	
}