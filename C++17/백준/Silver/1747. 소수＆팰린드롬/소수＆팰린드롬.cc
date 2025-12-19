#include<bits/stdc++.h>
using namespace std;
int n;
int arr[1003004];

void go(){
	arr[0] = arr[1] = 1;
	for(int i=2;i*i<=1003000;i++){
		if(arr[i]==0){
			for(int j=i*i;j<=1003000;j+=i){
				arr[j] = 1;
			}
		}
	}
}
bool check(int i){
	string s = to_string(i);
	string s1 =s;
	reverse(s1.begin(),s1.end());
	if(s1==s) return true;
	else return false;
}

int main(){
	cin>>n;
	
	go();
	for(int i=n;;i++){
		if(arr[i]==0&&check(i)){
			cout<<i;
			return 0;
		}
	}
}