# Creational Design Patterns

# What are creational design patterns?

```JAVA
public static void main(String[] args) {
  var tracy = new Person(
    "Tracy", 
    null, 
    "Westbay", 
    LocalDate.of(1995, 1, 1), 
    "tracy@example.com", 
    null
  );
  addPersonToLeadTracker(tracy);
  
  var jerome = new Person(
    "Jerome", 
    "Henry", 
    "Donaldson", 
    LocalDate.of(1996, 2, 10), 
    null, 
    "1234567890"
  );
  addPersonToLeadTracker(jerome);
}

private static void addPersonToLeadTracker(Person person) {
  System.out.println("A new lead was added to the lead tracker: \n" + person)
}
```

When we first start writing programs, it's quite common to put a lot of logic in the class. But as applications grow, this becomes less practical. Creational design patterns are a set of patterns that help you to manage this complexity.

__Example:__

As an example, say that I start creating an application to keep track of invoices for a store. In the beginning, I might just create a class called invoice, and I'd keep all my logic in that class. 

```JAVA
class Invoice {
  ...
}
```

Then over time, I would add new classes that use my invoice class. So in lots of places in the code, I would have the words "new Invoice()" 

```JAVA
class NewClass1 {
  Invoice invoice = new Invoice()
}

class NewClass2 {
  Invoice invoice = new Invoice()
}

class NewClass3 {
  Invoice invoice = new Invoice()
}

class NewClass4 {
  Invoice invoice = new Invoice()
}
...
```

Then one day I might need to change how invoice objects are created. For example, I might want to change the constructor, or I might want to have different configurations for different types of invoice. This is tricky because now all my code is tightly coupled to this invoice class and how new invoice objects are created. So I have to change it everywhere. And that starts a domino effect of changes that need to be made. 

Creational design patterns provide various techniques for avoiding problems like this one. 

There are two main themes that are common to most creational design patterns:
1. Encapsulate knowledge about which concrete class the system should use. 
2. Conceal how objects are created and put together. 

Abstracting this information makes the code much more flexible. The system is much less constrained by what gets created, how it gets created, and when it gets created.