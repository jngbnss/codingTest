#include <iostream>
#include <vector>

using namespace std;
int n,s,temp,ret;
vector<int>v;

void go(int idx,int subSum){
	if(idx==n){
		if(subSum==s){
			ret++;
		}
		return;
	}
	go(idx+1,subSum+v[idx]);
	go(idx+1,subSum);
}

int main(){
	cin>>n>>s;
	for(int i=0;i<n;i++){
		cin>>temp;
		v.push_back(temp);
	}
	
	go(0,0); // idx, subSum
	if(s==0){
		ret--;
	}
	cout<<ret;
}

