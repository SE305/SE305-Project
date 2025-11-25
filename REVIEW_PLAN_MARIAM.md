# My Code Review Plan - Library System

**My Name:** Mariam Ali  
**Reviewing:** Hussain Ali's code  
**Date:** [Today's date]
**Repo:** [your-repo-link]

## What I Want to Achieve
I'm going to carefully review Hussain's library management system code to:
- Make sure everything works correctly
- Find any hidden bugs or problems
- Help make the code cleaner and easier to understand
- Check if the tests actually test what they should
- Give helpful suggestions for improvement

## Files I'll Check
Here are all the files I need to look at:
- `Book.java` - The book information class
- `Library.java` - Where all the library operations happen
- `Main.java` - The user interface part
- `BookTest.java` - Tests for the Book class
- `LibraryTest.java` - Tests for the Library class
- `MainTest.java` - Tests for the main program

## What I'm Looking For

### 1. Code Quality
- Is the code easy to read and understand?
- Are variable names clear (like `bookTitle` instead of `bt`)?
- Is the formatting consistent?
- Are there any repeated code sections?

### 2. Does It Work Properly?
- Can you really add books without duplicates?
- Do all the menu options work?
- What happens with weird inputs?
- Does the library actually manage books correctly?

### 3. Error Handling
- What happens if I type text instead of numbers?
- Does the program crash easily?
- Are error messages helpful?
- Can the program handle mistakes gracefully?

### 4. Testing
- Do the tests actually catch problems?
- Are the tests reliable?
- Do they test important cases?
- What happens if tests fail?

### 5. Overall Design
- Is the code organized well?
- Does each class have one clear job?
- Could we easily add new features later?

## Main Things I'm Worried About

### Important Problems to Fix
1. **Main.java** - If I type "abc" instead of a number, the program crashes
2. **BookTest.java** - The tests use `assert` which might not even run
3. **LibraryTest.java** - There are duplicate import lines

### Could Be Better
1. **Library.java** - Finding books might be slow with many books
2. Error messages could be clearer
3. Some edge cases might not be tested

### Small Stuff
- Code formatting
- Adding helpful comments
- Variable names

## My Plan

### Today
- Get the code and make sure it runs
- Understand how everything works together
- Take initial notes

### Tomorrow  
- Go through each file line by line
- Write down what I find
- Test different scenarios

### Day After
- Run all the tests multiple times
- Try to break the program with weird inputs
- Make sure everything works as expected

### Final Day
- Organize all my findings
- Create GitHub issues for Hussain
- Record my review video

## What I'll Deliver
1. GitHub issues with clear problems and solutions
2. A video showing:
   - Me going through the code
   - Demonstrating any issues I find
   - Explaining my suggestions
3. Follow-up to see Hussain's changes
4. This complete plan and notes

## How I'll Know I Did a Good Review
- Found real problems that need fixing
- Gave clear suggestions that Hussain can actually use
- We worked well together
- The code got better because of my review
- I learned something new about code review
