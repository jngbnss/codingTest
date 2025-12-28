#include<bits/stdc++.h>
using namespace std;
int n,m;
int arr[55][55],visited[55][55];
vector<pair<int,int>>chickenList,homeList;
vector<vector<pair<int,int>>>mSizeListedUpChickenHouses;
vector<pair<int,int>>temp;

void combi(int start,vector<pair<int,int>>temp){
	if(temp.size()==m){
		mSizeListedUpChickenHouses.push_back(temp);
		return;
	}
	for(int i=start+1;i<chickenList.size();i++){
		temp.push_back(chickenList[i]);
		combi(i,temp);
		temp.pop_back();
	}
	return ;
}
	

int main(){
	cin>>n>>m;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			cin>>arr[i][j];
			if(arr[i][j] == 1) homeList.push_back({i,j});
			if(arr[i][j] == 2) chickenList.push_back({i,j});
		}
	}
	
	//일단 치킨집들을 싹 모아볼까?
	combi(-1,temp);
	int ret = 1e9;// 최종적으로 가장 짧은 거리
	for(auto i:mSizeListedUpChickenHouses){
		
		int listupDistance =0;
		for(auto k: homeList){
		
			int tempDist = 1e9;
			for(auto j:i){
//			for(auto k: homeList){
				tempDist =min(tempDist, abs(j.first-k.first)
				+abs(j.second-k.second));
			}listupDistance +=tempDist;;
		}
		ret = min(ret,listupDistance);
	}
	cout<<ret;
}
				
	