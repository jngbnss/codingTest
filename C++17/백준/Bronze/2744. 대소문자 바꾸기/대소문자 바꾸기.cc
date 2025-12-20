#include<bits/stdc++.h>
using namespace std;
long long a,b;

int main(){
	string s;
	cin>>s;
	for(auto i:s){
		if(i<96){
			cout<<(char)(i+(97-65));
		}else cout<<(char)(i-(97-65));
	}
}