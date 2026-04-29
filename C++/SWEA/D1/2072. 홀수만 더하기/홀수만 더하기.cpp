#include<iostream>
using namespace std;
int t,n,ret;

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    cin>>t;
    int idx = 1;
    while(t--){
        ret = 0;
        for(int i=0;i<10;i++){
            int n;
            cin>>n;
            if(n%2!=0){
                ret+=n;
            }
        }
        cout<<"#"<<idx++<<" "<<ret<<'\n';

    }
}