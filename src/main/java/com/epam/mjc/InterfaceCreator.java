package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
      Operation<Integer> operation = (List<Integer> args) -> {
          List<Integer> result = new ArrayList<>();
          for (Integer arg: args) {
              result.add(arg/divider);
          };
          return result;
      };
      return operation;
    }
}
