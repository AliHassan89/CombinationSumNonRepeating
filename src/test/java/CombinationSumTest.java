package test.java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.ArrayList;
import java.util.List;
import main.java.CombinationSum;
import org.junit.Test;

public class CombinationSumTest {

  private static final CombinationSum combinationSum = new CombinationSum();

  @Test
  public void checkForEmptyInputArray(){
    //given
    int[] arr = {};
    int target = 1;

    //when
    List<List<Integer>> results = combinationSum.combinationSum2(arr, target);

    //then
    assertThat(results.size(), equalTo(0));
  }

  @Test
  public void checkWhenTargetCannotBeAchievedUsingArrayValues(){
    //given
    int[] arr = {3,6,8};
    int target = 1;

    //when
    List<List<Integer>> results = combinationSum.combinationSum2(arr, target);

    //then
    assertThat(results.size(), equalTo(0));
  }

  @Test
  public void checkForCorrectInput(){
    //given
    int[] arr = {10, 1, 2, 7, 6, 1, 5};
    int target = 8;

    List<Integer> result_1 = new ArrayList<>();
    result_1.add(1);
    result_1.add(1);
    result_1.add(6);

    List<Integer> result_2 = new ArrayList<>();
    result_2.add(1);
    result_2.add(2);
    result_2.add(5);

    List<Integer> result_3 = new ArrayList<>();
    result_3.add(1);
    result_3.add(7);

    List<Integer> result_4 = new ArrayList<>();
    result_4.add(2);
    result_4.add(6);

    //when
    List<List<Integer>> results = combinationSum.combinationSum2(arr, target);

    //then
    assertThat(results.size(), equalTo(4));
    assertThat(results.get(0), equalTo(result_1));
    assertThat(results.get(1), equalTo(result_2));
    assertThat(results.get(2), equalTo(result_3));
    assertThat(results.get(3), equalTo(result_4));
  }
}
