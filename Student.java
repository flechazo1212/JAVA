
class Student{
    private String name;
    private double score;

    // constructor
    public Student(String name, double score){
        this.name = name;
        this.score = score;
   }
    // setter, getter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getScore(){
        return score;
    }

    public void setScore(double score){
        this.score = score;
    }

    // print name and score 
    public void printStudent(){
        System.out.print("name: " + name + " score: " + score);
   }
}


