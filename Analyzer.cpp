#include <iostream>
#include "StringData.h"
#include <vector>


int linearSearch(std::vector<std::string> dataSet, std::string element);
int binarySearch(std::vector<std::string> dataSet, std::string element);


int main() {
    long begin;
    long end;
    int result;

    std::vector<std::string> data = getStringData();

    linearSearch(data, "not_here");

    binarySearch(data, "not_here");

    linearSearch(data, "mzzzz");

    binarySearch(data, "mzzzz");

    linearSearch(data, "aaaaa");

    binarySearch(data, "aaaaa");

    return 0;
}

int linearSearch(std::vector<std::string> dataSet, std::string element){
    begin = systemTimeNanoseconds();
    for(int i = 0; i < dataSet.size(); i++){
        if(dataSet.at(i) == element){
            end = systemTimeNanoseconds();
            std::cout << "Element found at " << i << "\n" << "Time used: " << begin - end << "\n\n";
            return i;
        }
    }
    std::cout << "Element not found." << "\n" << "Time used: " << begin - end << "\n\n";
    return -1;
}

int binarySearch(std::vector<std::string> dataSet, std::string element){
    int StartIndex = 0;
    int EndIndex = dataSet.size() - 1;
    int MiddleIndex;

    while (StartIndex <= EndIndex){
        middle = (StartIndex + EndIndex) / 2;
        if(dataSet.at(MiddleIndex).compare(element) > 0){
            EndIndex = MiddleIndex - 1;
        }
        else if(dataSet.at(MiddleIndex).compare(element) < 0){
            StartIndex = MiddleIndex + 1;
        }
        else{
            std::cout << "Element found at " << i << "\n" << "Time used: " << begin - end << "\n\n";
            return MiddleIndex;
        }
    }
    std::cout << "Element not found." << "\n" << "Time used: " << begin - end << "\n\n";
    return -1;
}
