#include<bits/stdc++.h>
using namespace std;
int n,x,y,ret,sum,l,a,b,c,d;
string s;
vector<int>v,v1;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	while(true){
		int age,weight;
		cin>>s>>age>>weight;
		if(s=="#"&&age==0&&weight==0) return 0;
		if(age>17||weight>=80){
			cout<<s<<' '<<"Senior"<<'\n';
		}else cout<<s<<' '<<"Junior"<<'\n';
	}
		
}