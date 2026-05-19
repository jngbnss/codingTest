#include <string>
#include <vector>

using namespace std;

int solution(string my_string) {
    int answer = 0;
    for(auto i: my_string){
        if(i-'0'>=0&&i-'0'<10){
            answer+=i-'0';
        }
    }
    return answer;
}