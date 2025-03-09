package incubation.oops;


class AbstractStringBuilder {
    char[] value;  // Stores characters
    int count;     // Tracks number of characters used
    //value = new char[16]; // Default size is 16
}

/*
public synchronized StringBuffer append(String str) {
    super.append(str);
    return this;
}
*/
//int newCapacity = (oldCapacity * 2) + 2; // (old capacity * 2) + 2

//StringBuilder sb = new StringBuilder(5); // Initial capacity = 5
//sb.append("Hello");  // Uses all capacity
//sb.append(" Java");  // Capacity exceeded → expands to (5*2)+2 = 12

//System.out.println(sb.capacity());  // Output: 34 (Expanded)



