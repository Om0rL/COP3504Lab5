#include <iostream>
#include <string>
#include "StringData.h"



int main() {
    std::vector<std::string> data;
    data = getStringData();
    std::cout<< data[1] << std::endl;
    return 0;
}
