#include<bits/stdc++.h>
using namespace std;
int n;
string s,ret;
int main(){
	cin>>s;
	for(auto i:s){
		if(i<97&&i>64){
			ret+=i;
		}
	}
	cout<<ret;
}