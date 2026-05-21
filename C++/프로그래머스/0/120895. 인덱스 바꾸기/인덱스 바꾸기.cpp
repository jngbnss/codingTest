#include <string>
#include <vector>

using namespace std;

string solution(string my_string, int num1, int num2) {
    string answer = "";
    char a = my_string[num1];
    char b = my_string[num2];
    for(int i=0;i<my_string.size();i++){
        if(i==num1){
            answer+=b;
        }else if(i==num2){
            answer+=a;
        }else{
            answer+=my_string[i];
        }
    }
    return answer;
}