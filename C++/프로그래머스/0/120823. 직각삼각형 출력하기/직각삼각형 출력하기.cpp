#include <iostream>
#include <string>
using namespace std;

int main(void) {
    int n;
    cin >> n;
    for(int i=0;i<n;i++){
        string temp ="";
        for(int j=0;j<=i;j++){
            temp+='*';
        }cout<<temp<<'\n';
    }
    return 0;
}