This is the folder for the Fawry Quantum Bookstore Assignment

Assumptions taken into consideration
-Cannot add ebook or demo book if already exist a book with the same ISBN as there would be no stock therefore it does not make sense to add it again (demo book cannot be added again because it has no stock attribute)
-Add a paper book with an existing ISBN will add the book stock by 1
-Created Remove method to remove any outdated books according to an input threshold; ie: input 7 will remove any book that's 7 years old or older.
-Created an extra method to show all the inventory list at a time. "ISBN Stock" Stock =0 given for demo or ebooks.
-Shipping or emails related books did not implement the logic but had the buying method detect them.

-The App file is used to test all the methods
