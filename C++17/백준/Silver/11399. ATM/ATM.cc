#include<bits/stdc++.h>
using namespace std;
int n,ret3,ret5,sum;
vector<int>v;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		int temp;
		cin>>temp;
		v.push_back(temp);
	}
	sort(v.begin(),v.end());
	int ret=0;
	for(auto i:v){
		ret+=i;
//		cout<<ret<<'\n';
		sum+=ret;
	}
	cout<<sum;
	// 1 2 3 3 4
	// 1 3 6 9 13
}
	