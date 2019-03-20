# utils
My personal library of Java utilities

### ImmutableTriple
I really needed to return 3 objects of different types at once, and I didn't want to
merely make a parent object for this scenario, so I created this generic class based
on a StackOverflow post on the topic.  
  
Here's a psuedocode example:

```$java
ImmutableTriple<String, Integer, CustomThing> returnThreeThings(Gizmo gizmo, Labratory lab) {
    // stuff happens...
    return new ImmutableTriple<>(theString, theInt, theCustomThing);    
}

String myString = returnThreeThings.getFirst();
Integer myInteger = returnThreeThings.getSecond();
CustomThing myCustomThing = returnThreeThings.getThird();
```

As the name implies, once this object is created, it cannot be changed.