#include<bits/stdc++.h>
using namespace std;
map<string,string>mp;

int main(){
	mp["animal"]="Panthera tigris";
	mp["flower"]="Forsythia koreana";
	mp["tree"]="Pinus densiflora";
	string s;
	while(true){
		cin>>s;
		if(s=="end") return 0;
		cout<<mp[s]<<'\n';
	}
}