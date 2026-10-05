public class Student implements Comparable<Student>{

    public int age;
    public String name;
    public int weight;

    // Constructor
    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for weight
    public int getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Student other) {
        //return this.age - other.age;// sort in asc order
        // this method is called for current object 
        //we will define our sorting logic here 

        //sort basis of age 
        if(this.age == other.age){
            return this.name.compareTo(other.name);//sort basis of name 
        }

       return other.age - this.age;// sort in desc order
    }

    // toString()
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}