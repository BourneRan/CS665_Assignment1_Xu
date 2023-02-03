## CS665

### Description of Java implementation:
This implementation create 3 Java class which are Vending.java, Vending Coffee.java and VendingTea.java.

Considering the flexibility, I spilt two class to vend tea or coffee in order to edit it easily.

Among them, Vending.java is the superclass of VendingTea.java and VendingCoffee.java.

Vending.java is like the main User Interface for the vending machine. You can choose the type of the beverage you want in this class.

VendingTea.java's function is just like its name. When you choose to buy tea in the main interface, it will work.

The situation in VendingCoffee.java is similar for buying coffee. The difference is that the addsugartea function is just for VendingCoffee.
(I suppose no one add sugar or milk when drinking tea)



### How you add or remove in future new drink types?
Create a new class then extend by the superclass Vending.java

The advantage is that you can define functions whatever you want. 

It is reasonable when considering the difference of each beverage.

### What patterns do you use in your design?
Pattern B.

### How you avoided duplicated code?
Use inheritance to avoid a lot of "if else (switch)".

### How is the simplicity and understandability of your implementation?
The user interface is friendly which when you type wrongly, it will not end. But it can retype, which is similar to the real vending machine.

And the usability improved.