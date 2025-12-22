#include<bits/stdc++.h>
using namespace std;
int n,temp;
vector<int>v,v1;

int main(){
	cin>>n;
	
	for(int i=0;i<n;i++){
		cin>>temp;
		v.push_back(temp);
		
	}
	for(int i=0;i<n-1;i++){
		cin>>temp;
		v1.push_back(temp);
		
	}
	if(n==1){
		 cout<<"권병장님, 중대장님이 찾으십니다";
		return 0;
	}
	int mx =0;
	bool check = true;
	for(int i=0;i<n-1;i++){
		if(mx<v[i]){
			cout << "엄마 나 전역 늦어질 것 같아";
            return 0;
        }
        mx = max(mx,v[i]+v1[i]);
    }
	if(mx>=v[n-1]) cout<<"권병장님, 중대장님이 찾으십니다";
	else cout<<"엄마 나 전역 늦어질 것 같아";
}