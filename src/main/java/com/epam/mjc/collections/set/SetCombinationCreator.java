package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();
        for (String value: firstSet) {
            if (secondSet.contains(value)&&!(thirdSet.contains(value))){
                resultSet.add(value);
            } else if(secondSet.contains(value)){
                thirdSet.remove(value);
            }
        }
        resultSet.addAll(thirdSet);
        return resultSet;
    }
}
