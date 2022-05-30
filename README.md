# sort-algorithms
 I have 2 files where I did Merge Sort in one file and SJSort in the other file.
 
 The Merge sort algorithm is as followed:
 In merge() I used a local work array with (hi - lo + 1) elements.
 
 The SJ sort algorithm is as followed:
 The SJSort algorithm required for me to do the following (n log2 n /2) times: randomly generate two positions i and j within the array. 
 If the values at these positions are out of order (the left one is bigger than the right one), they are swapped.
 After this, the array will be more sorted than it was before. Then you use insertion sort to finish up, because it is fast for mostly sorted data.
