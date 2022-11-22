# Variables

**Variables**: Name data storage.

- Strongly type
- Use only letters and numbers
- First character cannot be a number
- Camel case
- Can be declared final

```
int total;
int grade4;
```

Invalidly named variable.
<br>~~int 2much;~~

---

### Camel case example

```
int intSum;
int studentCount;
int studentTeacherRation;
int level2Count;
```

### Ways to declare a variables

```
int myVar;
myVar = 50;
```

### Prints out a variable

```
System.out.println(myVar);
int anotherVar = 100;
System.out.println(anotherVar);
```

### Assign variables to other variables

```
myVar = anotherVar;
System.out.println(myVar);
```

#### Variables can be declared <mark>FINAL</mark> and to prevent changing.

- Value does not need to be initially set but cannot be changed after set.
- Avoids errors from accidental changes

```
final int maxStudents = 25;
final int someVariable;
int someOtherVariable = 100;
someVariable = someOtherVariable;
System.out.println(someOtherVariable);
```
