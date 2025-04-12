# Software Development Final Exam Backend

This is the backend for my final exam at Keyin! It's Java Maven based, and uses SpringBoot with a mySQL database.
You could just use postman or something to make requests to it, but it's more fun with it's frontend sister component, found here:
https://github.com/Grispys/FINAL-EXAM-frontend

It has three routes after api/trees:
  - previous-trees
      - returns every tree in the database
  - most-recent
      - returns the most recent tree in the database
  - process-numbers
      - accepts an array of integers from the frontend, inserts it sequentially into a binary search tree, and sends it to the database
