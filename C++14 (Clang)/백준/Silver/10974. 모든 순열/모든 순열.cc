#include<iostream>
#include<vector>

using namespace std;

int n,arr[9],visited[9];

void go(int idx){
	if(idx==n){
		for(int i=0;i<n;i++){
			cout<<arr[i]<<' ';
		}cout<<'\n';
		return;
	}
	
	for(int i=1;i<=n;i++){
		if(!visited[i]){
			visited[i] = 1;
			arr[idx] = i;
			go(idx+1);
			visited[i] = false;
		}
	}
}

int main(){
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cin>>n;
	go(0);
}