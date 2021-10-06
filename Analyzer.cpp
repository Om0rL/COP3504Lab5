#include <iostream>
<<<<<<< HEAD
#include <string>
#include "StringData.h"



int main() {
    std::vector<std::string> data;
    data = getStringData();
    std::cout<< data[1] << std::endl;
    return 0;
}
=======
#include "StringData.h"
#include <vector>


int linearSearch(std::vector<std::string> dataSet, std::string element);
int binarySearch(std::vector<std::string> dataSet, std::string element);


int main() {
    long begin;
    long time_taken;
    int result;

    std::vector<std::string> data = getStringData();
    begin = systemTimeNanoseconds();
    linearSearch(data, "aaaaa");
    time_taken = systemTimeNanoseconds() - begin;
    std::cout << time_taken;
    std::cout << "\n";

    begin = systemTimeNanoseconds();
    binarySearch(data, "aaaaa");
    time_taken = systemTimeNanoseconds() - begin;
    std::cout << time_taken;
    std::cout << "\n";

    begin = systemTimeNanoseconds();
    linearSearch(data, "mzzzz");
    time_taken = systemTimeNanoseconds() - begin;
    std::cout << time_taken;
    std::cout << "\n";

    begin = systemTimeNanoseconds();
    binarySearch(data, "mzzzz");
    time_taken = systemTimeNanoseconds() - begin;
    std::cout << time_taken;
    std::cout << "\n";

    begin = systemTimeNanoseconds();
    linearSearch(data, "not_here");
    time_taken = systemTimeNanoseconds() - begin;
    std::cout << time_taken;
    std::cout << "\n";

    begin = systemTimeNanoseconds();
    binarySearch(data, "not_here");
    time_taken = systemTimeNanoseconds() - begin;
    std::cout << time_taken;
    std::cout << "\n";
    return 0;
}

int linearSearch(std::vector<std::string> dataSet, std::string element)
{
    for(int i = 0; i < dataSet.size(); i++)
    {
        if(dataSet.at(i) == element)
        {
            return i;
        }
    }
    return -1;
}

int binarySearch(std::vector<std::string> dataSet, std::string element)
{
    int lower_bound = 0;
    int higher_bound = dataSet.size() - 1;
    int middle;

    while (lower_bound <= higher_bound)
    {
        middle = (lower_bound + higher_bound) / 2;
        if(dataSet.at(middle).compare(element) > 0)
        {
            higher_bound = middle - 1;
        }
        else if(dataSet.at(middle).compare(element) < 0)
        {
            lower_bound = middle + 1;
        }
        else
        {
            return middle;
        }
    }
    return -1;
}
>>>>>>> 2e3ea052307430a04bf4378ddb5d4d8addeae6b7
