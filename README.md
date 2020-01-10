# blocking-queue-kata
This kata is about working with -- and testing -- threaded programs. 

## The task
The first task is to get the basic functionality of a bounded queue working.

Then identify all the places where this can fail or throw an exception (like taking something from an empty queue). In these places we instead need to lock the thread and wait until the action becomes legal.

<details>
  <summary>Hint 1:</summary>
Use a semaphore for the blocking part.
</details>

<details>
  <summary>Hint 2:</summary>
Use 2 semaphores: 

* One for blocking when full
* One for blocking when empty

</details>
