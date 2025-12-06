#include<bits/stdc++.h>
using namespace std;
int h,temp;
vector<int>a,d,m,v;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	for(int i=0;i<8;i++){
		cin>>temp;
		v.push_back(temp);
	}
	m=v;
	sort(v.begin(),v.end());
	
	a = v;
	reverse(v.begin(),v.end());
	d = v;
	
	if(a==m){
		cout<<"ascending";
		return 0;
	}else if(d==m){
		cout<<"descending";
		return 0;
	}else{
		cout<<"mixed";
	}
	
}