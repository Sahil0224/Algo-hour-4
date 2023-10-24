# AH-4

## Challenge

Write a method, fiveSort, that takes in an ArrayList of numbers as an argument. The method should rearrange elements of the ArrayList such that all 5s appear at the end. Your method should perform this operation in-place by mutating the original ArrayList. The method should return the ArrayList.

Elements that are not 5 can appear in any order in the output, as long as all 5s are at the end of the array.

## Test Cases

```java
List<Integer> array = new ArrayList<>(List.of(12, 5, 1, 5, 12, 7));
Source.fiveSort(array);
// -> [12, 7, 1, 12, 5, 5]
```

```java
List<Integer> array = new ArrayList<>(List.of(5, 2, 5, 6, 5, 1, 10, 2, 5, 5));
Source.fiveSort(array);
// -> [2, 2, 10, 6, 1, 5, 5, 5, 5, 5] 
```


