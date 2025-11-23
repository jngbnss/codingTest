#include <string>
#include <vector>

using namespace std;

int solution(vector<int> arr1, vector<int> arr2) {
    int answer = 0;
    if(arr1.size()>arr2.size()) answer = 1;
    else if(arr1.size()<arr2.size()) answer = -1;
    else{
        int a = 0;
        for(auto i:arr1){
            a+=i;
        }
        int b = 0;
        for(auto i:arr2){
            b+=i;
        }
        if(a>b) answer = 1;
        else if(a<b) answer = -1;
        else answer =0;
    }
    return answer;
}