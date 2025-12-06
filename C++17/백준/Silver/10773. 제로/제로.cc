#include<bits/stdc++.h>
using namespace std;
long long n,m,k,sum,cnt,temp,mx=-4001,mn=4001;
vector<int>ret;
deque<int>v;
map<int,int>mp;
stack<int>stk;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	
	for(int i=0;i<n;i++){
		cin>>temp;
		
		if(temp!=0){
			stk.push(temp);
			
		}
		else stk.pop();
	}
	
	
	while(stk.size()){
		sum+=stk.top();
		stk.pop();
	}
	cout<<sum;
		
}
