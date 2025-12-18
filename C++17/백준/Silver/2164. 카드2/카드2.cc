#include<bits/stdc++.h>
using namespace std;
int n;
queue<int>q;

int main(){
	cin>>n;
	for(int i=1;i<=n;i++){
		q.push(i);
	}
	
	while(q.size()){
		if(q.size()==1){
			cout<<q.front();
		}
		int x =q.front();
//		cout<<x<<' ';
		q.pop();
		int y = q.front();
		q.pop();
		q.push(y);
	}
}