#include<bits/stdc++.h>
using namespace std;
int n;
string s;
int main(){
	while(true){
		cin>>s;
		if(s=="end"){
			break;
		}
		if(s=="animal"){
			cout<<"Panthera tigris"<<'\n';
		}
		if(s=="flower"){
			cout<<"Forsythia koreana"<<'\n';
		}
		if(s=="tree"){
			cout<<"Pinus densiflora"<<'\n';
		}
	}
}