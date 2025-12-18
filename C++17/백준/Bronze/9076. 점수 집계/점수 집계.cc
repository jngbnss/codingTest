#include<bits/stdc++.h>
using namespace std;
int n;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		vector<int>v;
		for(int j=0;j<5;j++){
			int temp;
			cin>>temp;
			v.push_back(temp);
		}
		sort(v.begin(),v.end());
		if(v[3]-v[1]>3){
			cout<<"KIN\n";
		}else{
			cout<<v[1]+v[2]+v[3]<<'\n';
		}
	}
}
			