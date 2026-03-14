#include<iostream> 
using namespace std;
int n;
int main(){
	cin>>n;
	if(n<=10000){
		cout<<"Accepted";
	}else{
		cout<<"Time limit exceeded";
	}
}