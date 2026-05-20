#include <string>
#include <vector>

using namespace std;

bool solution(int x) {
    bool answer = false;
    int temp = x;
    int n =0;
    while(temp>0){
        n +=temp%10;
        temp/=10;
    }
    if(n==0) answer =false;
    else if(x%n==0) answer = true;
    return answer;
}