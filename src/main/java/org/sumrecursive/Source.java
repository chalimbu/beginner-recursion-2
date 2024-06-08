package org.sumrecursive;

import java.util.List;

class Source {
    public static int sumNumbersRecursive(List<Integer> numbers) {
        // todo
        if(numbers.size()==0){
            return 0;
        }
        int sum=numbers.get(0)+sumNumbersRecursive(numbers.subList(1,numbers.size()));
        return sum;
    }

    public static void run() {
        // this function behaves as `main()` for the 'run' command
        // you may sandbox in this function , but should not remove it
        int result=Source.sumNumbersRecursive(List.of(5, 2, 9, 10));
        System.out.println(result);
    }
}
