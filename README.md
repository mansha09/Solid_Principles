# SOLID PRINCIPLES PROJECT 

## Description
This Project uses => Single Responsibility Principle (SRP)
                  => Open/Closed Principle (OCP)
                  => Interface Segregation Principle (ISP)

Example = Library management System
1. Management of books - one can borrow or return a book and also librarian can make extensions for borrowed books.
2. 2. Discount Management - Different users will recieve different discounts
   3. Notification System - Users will Also recieve notifications 


                  ****** More Explanation *********

     1. Single Responsibility Principle (SRP)**
- **Definition**: A class should have only one reason to change, meaning it should have one responsibility.
- **Implementation**:
  - **Violated**: The management of books, borrowing, and notifications is performed by a single class, Library.
  - **Solved**: The responsibilities are divided into three classes, as shown below:
   - Library: manages the book-related operations.
   - BorrowService: manages everything related to borrowing books.
   - NotificationService: is responsible for sending notifications.
 
**2. Open/Closed Principle (OCP)**
- **Definition**: Classes should be open for extension but closed for modification.
- **Implementation**:
  - **Violated**: There is a class DiscountCalculator which uses conditional logic to handle regular and premium users.
  - **Solved**: Introduced an interface called Discount. Further, it had separate implementations like: 
    - RegularDiscount
    - PremiumDiscount
   

**3. Interface Segregation Principle (ISP)**
- **Definition**: A client should not be forced to implement interfaces that it does not use.
- **Implementation**:
  - **Violated**: One LibraryActions interface forcing users to implement methods irrelevant to their roles
  - **Solved**: The interface was divided into:
    - Borrower: Handles the operations for borrowing and returning books
    - Librarian: Handles the operations for approvals of extensions.
