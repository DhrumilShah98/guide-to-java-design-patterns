# The Builder Pattern

## Avoid Complex Constructors
As classes grow in size, one common problem is that you end up with large constructors where you have to pass in lots of different parameters. 

Let's take an example of a class that represents a person. A person can have lots of different attributes. For example, they can have a first name, last name, date of birth, email address, and so on. Some of the attributes could be mandatory and others could be optional. So, for example, let's say a person has to have a first name, a last name, and a date of birth, but they don't have to have a middle name or an email address and so on. 

So one time when I'm creating a person object, I might want to create one with a name, a date of birth, and a middle name. But another time, I might want to create one with just the first name, last name, and an email address. And another time, I might want first name and last name, date of birth, middle name, and email. 

So there are lots of possible combinations I could have. Let's assume that a person object is immutable. This means that once I've set these fields when I create the person objects, I can't come back and change them later. So how might the constructor of a person object look in Java code? 

```JAVA
public Person(String firstName,
              String middleName,
              String lastName,
              LocalDate dateOfBirth,
              String emailAddress,
              String address,
              String phoneNumber,
              int idNumber) {
              ...
}
```

It might look something like this with a long list of things that I need to pass into the constructor, and for the optional ones that I don't want, I'd have to pass in null. There are a few problems with this. It's quite messy and it's easy to get things in the wrong order.

If we look at an example of how this code looks when the constructor is called, it's almost impossible to know what things are being passed in, and it would be really easy to pass the wrong parameter in the wrong place. 

```JAVA
  Person jerome = new Person(
    "Jerome",
    null,
    "Donaldson",
    LocalDate.of(1990, 1, 1),
    null,
    null,
    "1234567890",
    null
  );
```

So what's the alternative? 

One other option is to create different constructors for all the different combinations, but this isn't practical either. You'd end up with loads of different constructors, one for each combination, and that would be really hard to read. It's also might not be possible if some of the arguments have the same types. Java won't know the difference between two different constructors that pass in three different strings, for example. 


The solution to this problem is the __builder__ pattern. In this pattern, you have a separate class that's used to construct the object using just the fields that you want, and this class is called the builder. In the traditional pattern, there's an interface for the builder and then a concrete implementation. 

```
Director -> Builder
                |
                V
          ConcreteBuilder -> Product
                             (class Person)
```

The Product is the class that would otherwise have the big constructor. So in this example, it would be the Person class. And the Director is the class that uses the Builder to create the object. So, for example, the class where you'd be creating a new Person object. 

```
Director -> ConcreteBuilder -> Product
                             (class Person)
```

In Java, is normally possible to simplify this pattern so you only have the concrete builder without the interface.