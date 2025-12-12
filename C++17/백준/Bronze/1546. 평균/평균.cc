#include<bits/stdc++.h>
using namespace std;
double n,mx,temp;
vector<double>v,v1;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>temp;
		v.push_back(temp);
		mx = max(mx,temp);
	}
	for(auto i:v){
		temp = (i/mx)*100;
		v1.push_back(temp);
	}
	temp = 0;
	
	for(auto i:v1){
		temp+=i;
	}
	cout<<temp/n;
}