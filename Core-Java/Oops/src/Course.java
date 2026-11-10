public class Course {
    String name ;
    int duration;
    String role ;
    Course(String name , int duration ){
        this.name = name;
        this.duration = duration;

    }
    void learn(){
        System.out.println(" Leaning a new skill"+ name );
    }
    void reason(){
        System.out.println("Learning for placement for role  "+ role );
    }

    static void main(String[] args) {
        Course c1 = new Course("sppring boot " , 23);
        c1.learn();
    }
}
