#include<bits/stdc++.h>
using namespace std;
const int mx = 104;
int n,m;
char arr[mx][mx];
int visited[mx][mx];
string s;

int main(){
	cin>>n>>m;
	
	memset(visited,-1,sizeof(visited));
	for(int i=0;i<n;i++){
		cin>>s;
		for(int j=0;j<m;j++){
			arr[i][j] = s[j];
			if(arr[i][j] =='c') visited[i][j]=0;
		}
	}
	
	for(int i=0;i<n;i++){
		int cnt =0;
		bool check = false;
		for(int j=0;j<m;j++){
			
			if(check&&visited[i][j]==-1){
				visited[i][j]=cnt++;
			}
			else if(visited[i][j]==0){
				cnt=0;
				cnt++;
				check = true;
			}
			cout<<visited[i][j]<<' ';
		}cnt = 0;
		cout<<'\n';
	}
	
}
	