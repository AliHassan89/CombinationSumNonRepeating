/**

 Given a collection of candidate numbers (C) and a target number (T), find all unique combinations
 in C where the candidate numbers sums to T.

 Each number in C may only be used once in the combination.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 A solution set is:
 [
 [1, 7],
 [1, 2, 5],
 [2, 6],
 [1, 1, 6]
 ]


 */

package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> results = new ArrayList<>();
    combinationSum2(candidates, target, results, new ArrayList<Integer>(), 0);

    return results;
  }

  private void combinationSum2(int[] candidates, int target, List<List<Integer>> results, List<Integer> result, int start)
  {
    if(target > 0){
      for(int i = start; i < candidates.length && target >= candidates[i];){
        result.add(candidates[i]);
        combinationSum2(candidates, target - candidates[i], results, result, ++i);
        result.remove(result.size() - 1);
      }
    }
    else if(target == 0 && !results.contains(result)){
      results.add(new ArrayList<Integer>(result));
    }
  }
}
