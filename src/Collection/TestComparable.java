package Collection;

import java.util.ArrayList;
import java.util.Collections;

    class Student implements Comparable<Student>{
        int scholarNo;
        String name;
        int marks;
        Student(int scholarNo,String name,int marks){
            this.scholarNo=scholarNo;
            this.name=name;
            this.marks=marks;
        }

        public int compareTo(Student st){
            if(marks==st.marks) {
                return nameComparison(st);
            }else if(marks>st.marks)
                return 1;
            else
                return -1;
        }

        public int nameComparison(Student st){
          if (name.compareTo(st.name)==0){
              if(scholarNo > st.scholarNo){
                  return -1;
              }
          }
            return name.compareTo(st.name);
        }
    }

    class TestComparable{
        public static void main(String args[]){
            ArrayList<Student> al=new ArrayList<Student>();
            al.add(new Student(102,"Vijay",23));
            al.add(new Student(106,"Ajay",27));
            al.add(new Student(111,"Ajay",27));
            al.add(new Student(101,"Sita",21));
            al.add(new Student(105,"Rama",21));
            al.add(new Student(109,"Rama",21));

            Collections.sort(al);
            for(Student st:al){
                System.out.println("ScholarNo : "+st.scholarNo+ ", Name : "+
                        st.name+", Marks : "+st.marks);
            }
        }
    }


