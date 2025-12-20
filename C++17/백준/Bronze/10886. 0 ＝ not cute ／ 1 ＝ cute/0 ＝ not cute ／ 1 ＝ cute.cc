#include<bits/stdc++.h>
using namespace std;
int n,temp;
int arr[2];

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>temp;
		arr[temp]++;
	}
	if(arr[0]>arr[1]) cout<<"Junhee is not cute!";
	else cout<<"Junhee is cute!";
}