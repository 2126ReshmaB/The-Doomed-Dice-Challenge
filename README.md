# The-Doomed-Dice-Challenge

## 1 . The output of Combinations.java

Logic : 
      The Combinations of two dice (DieA and DieB) when rolling is

      Die A has 6 faces (spots) numbered 1 through 6.
      Die B has 6 faces (spots) numbered 1 through 6.
      
      Mathematically, the total number of combinations  
      C is calculated as: = Number of outcomes for Die A × Number of outcomes for Die B
      C=Number of outcomes for Die A × Number of outcomes for Die B
      C = 6 X 6
      C = 36 combinations.


![Screenshot (238)](https://github.com/2126ReshmaB/The-Doomed-Dice-Challenge/assets/118461173/880c800e-c109-40df-bf1d-0cfa6a5ad1c6)

## 2 . The output of Distrubution.java

> Logic : 
> The total distribution of two dice is calculated by checking the fequencies of each sum
>> (1,1) (1,2) (1,3) (1,4) (1,5) (1,6) <br/>
>> (2,1) (2,2) (2,3) (2,4) (2,5) (2,6) <br/>
>> (3,1) (3,2) (3,3) (3,4) (3,5) (3,6) <br/>
>> (4,1) (4,2) (4,3) (4,4) (4,5) (4,6) <br/> 
>> (5,1) (5,2) (5,3) (5,4) (5,5) (5,6)<br/>
>> (6,1) (6,2) (6,3) (6,4) (6,5) (6,6)<br/>
> Here, the combinations<br/>
>      (1,1) => 2 <br/>
>      (1,2) (2,1) => 3<br/>
>      (1,3) (2,2) (3,1) => 4<br/>
>      similarly the freqency of all pairs are calculated using HashMap.


![Screenshot (239)](https://github.com/2126ReshmaB/The-Doomed-Dice-Challenge/assets/118461173/ad8d2d36-7259-46de-b6cb-c97eb3501ae3)

## 3 . The output of Probability.java
Logic :
>The Probabilty of each distribution can be calculated using
>>       p(A) = n(A) / n(s) 
>>       here, s = 36(total combinations)
>>       p(sum = 2) = 2 / 36
>>       p(sum = 3) = 3 / 36
       .......
![Screenshot (240)](https://github.com/2126ReshmaB/The-Doomed-Dice-Challenge/assets/118461173/9a7ecd5c-dba1-41ce-9ae9-aa181f99ab64)

## 4 . The output of Loki.java
Logic :
+ Calculate the original probabilities for each sum.
+ Determine the possible combinations of spots on the new dice that would yield the same probabilities for each sum.
+ Reattach the spots accordingly.


![Screenshot (269)](https://github.com/2126ReshmaB/The-Doomed-Dice-Challenge/assets/118461173/c2929ad0-6395-44c8-a97b-7c737207fc5b)

