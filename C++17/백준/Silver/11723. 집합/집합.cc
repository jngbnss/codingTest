#include<bits/stdc++.h>
using namespace std;
int n,x;
map<int,int>mp;
string s;

void go(int x){
	mp[x] = 1;
}
void go1(int x){
	mp[x] = 0;
}
void go2(int x){
	if(mp[x] ==1) cout<<1<<'\n';
	else cout<<0<<'\n';
}
void go3(int x){
	if(mp[x] ==1) mp[x] =  0;
	else mp[x] =1;
}
void go4(){
	for(int i=0;i<=20;i++){
		mp[i] = 1;
	}
}
void go5(){
	for(int i=0;i<=20;i++){
		mp[i] = 0;
	}
}
int main(){
	ios_base::sync_with_stdio(0);
	cin.tie(0);cout.tie(0);
	cin>>n;
	while(n--){
		cin>>s;
		
		if(s=="add"){
			cin>>x;
			go(x);
		}
		else if(s=="remove"){
			cin>>x;
			go1(x);
		}
		else if(s=="check"){
			cin>>x;
			go2(x);
		}
		else if(s=="toggle"){
			cin>>x;
			go3(x);
		}
		else if(s=="all"){
//			cin>>x;
			go4();
		}
		else go5();
	}
}