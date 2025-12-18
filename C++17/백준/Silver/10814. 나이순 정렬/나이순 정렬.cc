#include<bits/stdc++.h>
using namespace std;
bool cmp(pair<int,string>a,pair<int,string>b){
	return a.first<b.first;
}
int main(){
	int n;
	cin>>n;
	vector<pair<int,string>>v;
	
	for(int i=0;i<n;i++){
		int age;
		string name;
		cin>>age>>name;
		v.push_back({age,name});
	}
	
	stable_sort(v.begin(),v.end(),cmp);
	for(auto i:v){
		cout<<i.first<<' '<<i.second<<'\n';
	}
}