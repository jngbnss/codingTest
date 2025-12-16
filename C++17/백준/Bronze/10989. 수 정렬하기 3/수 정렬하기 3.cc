#include<bits/stdc++.h>
using namespace std;
long long n;
vector<int>v(10001,0);
int x;

int main(){
	ios::sync_with_stdio(false);
cin.tie(nullptr);

	cin>>n;
	for(int i=0;i<n;i++){
		cin>>x;
		v[x]++;
	}
	for(int i=0;i<10001;i++){
		while(v[i]>0){
			cout<<i<<"\n";
			v[i]--;
		}
	}
}