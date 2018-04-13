package com.myapp.data.dao.realization;

import com.myapp.data.dao.interfaces.StudentsDao;
import com.myapp.data.entities.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class StudentsDaoJPA implements StudentsDao {

    @PersistenceContext
    private EntityManager em;

    public Student addStudent(Student student) {
        em.persist(student);
        return student;
    }

    public Student getStudentById(int studentId) {
        return em.find(Student.class, studentId);
    }

    public void saveStudent(Student student){
        em.merge(student);
    }

    public List<Student> getAllStudents() {
        List<Student> students = null;
        try{
            Query query = em.createNamedQuery(Student.getAllStudents);
            students = query.getResultList();
        }catch(Exception ex){
            System.err.println("Error in StudentsDaoJPA: "+ex);
        }
        return students;
    }

    public Student getStudentByPIB(String pib) {
        Student students = null;
        try{
            Query query = em.createNamedQuery(Student.getStudentByPib);
            query.setParameter("pib", pib);
            students = (Student)query.getSingleResult();
        }catch(Exception ex){
            System.err.println("Error in StudentsDaoJPA: "+ex);
        }
        return students;
    }

    public List<Student> getAllStudentsByCourse(int course) {
        List<Student> students = null;
        try{
            Query query = em.createNamedQuery(Student.getStudentsByCourse);
            query.setParameter("course", course);
            students = query.getResultList();
        }catch(Exception ex){
            System.err.println("Error in StudentsDaoJPA: "+ex);
        }
        return students;
    }
}

