#include<iostream>
#include<vector>
#include<cmath>
using namespace std;
int n;
int visited[25];
int arr[25][25];
vector<int>v;
int ret = 1e9;

void go(int idx,int cnt){
	if(cnt==n/2){
		int start = 0;
		int link = 0;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(visited[i]==1&&visited[j]==1){
					start+=arr[i][j];
				}else if(visited[i]==0&&visited[j]==0){
					link+=arr[i][j];
				}
			}
		}
		int gap = abs(start-link);
		ret = min(ret,gap);
		return;
	}
	for(int i=idx;i<n;i++){
		if(!visited[i]){
			visited[i] =1;
			go(i+1,cnt+1);
			visited[i] =0;
		}
	}
}
					

int main(){
	cin>>n;
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			int temp ;
			cin>>temp;
			arr[i][j] = temp;
		}
	}
	
	go(0,0); //idx, cnt;
	cout<<ret;
}