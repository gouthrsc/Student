/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Scott
 */
public class PartTimeStudent extends Student{

        private int numCourses;
        
    public PartTimeStudent(int numCourses) {
        this.numCourses = numCourses;
    }


    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
}
