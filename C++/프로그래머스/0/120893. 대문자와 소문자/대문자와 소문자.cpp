#include <string>
#include <vector>

using namespace std;

string solution(string my_string) {
    
    string answer = "";
    for(auto i:my_string){
        if((int)i<97){
            answer+=(char)(i+(97-65));
        }else{
            answer+=(char)(i-(97-65));
        }
    }
    return answer;
}