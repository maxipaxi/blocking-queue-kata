# blocking-queue-kata
This kata is about working with -- and testing -- threaded programs. 

## The task
The first task is to get the basic functionality of a bounded queue working.

Then everywhere this can throw an exception we instead need to block and wait until the action becomes legal.

<details>
  <summary>Hint 1:</summary>
  Use semaphores for the blocking part.
</details>

<details>
  <summary>Hint 2:</summary>
  Use 2 semaphores: 
  * One for blocking when full
  * One for blocking when empty
</details>