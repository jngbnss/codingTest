#include<bits/stdc++.h>
using namespace std;
int n;
string s,ret,temp;
vector<int>v;
int arr[26];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	cin>>n;
	cin>>s;
	int pos = s.find("*");
	string front;
	front = s.substr(0,pos);
	string back = s.substr(pos+1);
	int bsize = back.size();

	for(int i=0;i<n;i++){
		cin>>temp;
		bool check = false; // if correct true
		// front check
		if(temp.size()>=front.size()+back.size()&&temp.substr(0,pos) == front){
			int newStart = temp.size()-back.size();
			//cout<<temp[newStart]<<'\n';
			if(back == temp.substr(newStart)) check = true;
		}
		if(check) cout<<"DA\n";
		else cout<<"NE\n";
	}
}

