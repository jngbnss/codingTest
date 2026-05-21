#include <string>
#include <vector>

using namespace std;

int solution(int order) {
    int answer = 0;
    string s = to_string(order);
    for(auto i:s){
        if(i=='3'||i=='6'||i=='9') answer++;
    }
    return answer;
}