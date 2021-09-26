class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int compareTo(Person otherPerson) {
       int comparisonResult;
        if (Integer.valueOf(getName().compareTo(otherPerson.getName())) == 0) {
          return  comparisonResult = 0;
        } else if (Integer.valueOf(getName().compareTo(otherPerson.getName())) >= 1) {
           return comparisonResult = 1;
        } else if (Integer.valueOf(getName().compareTo(otherPerson.getName())) <= 1) {
           return comparisonResult = -1;
        } else
            return Integer.compare(getAge(), otherPerson.getAge());
    }
}