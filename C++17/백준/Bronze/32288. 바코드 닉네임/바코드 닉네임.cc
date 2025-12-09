#include<bits/stdc++.h>
using namespace std;
long long n,m,a,b,d,e,cnt,ret,temp;
char c;
map<char,int>mp = {{'R',0},{'B',0}};
int arr[] = {10,8,6,5,4,3,2,1,0};
string s;
vector<long long>v;
int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>c;
		if(c<97) cout<<(char)(c+(97-65));
		else cout<<(char)(c-(97-65));
	}
	
}
