package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();
        for (Integer value: sourceList ) {
            if ((value %2) == 0){
                while((value%2) == 0){
                    resultSet.add(value);
                    value=value/2;
                    if((value%2) != 0){
                        resultSet.add(value);
                    }
                }
            }else{
                resultSet.add(value);
                resultSet.add(value*2);
            }
        }
        return resultSet;
    }
}
