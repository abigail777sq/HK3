package com.example.demo.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.infraestructure.CourseAssessmentDetailsRepository;


@Service
public class CourseAssessmentDetailsService {
  @Autowired 
  private CourseAssessmentDetailsRepository courseAssessmentDetailsRepository; 
  //save 
  public CourseAssessmentDetails saveCourseAssessment(CourseAssessmentDetails courseAssessmentDetails){
    return courseAssessmentDetailsRepository.save(courseAssessmentDetails);
  }   
  // find
  public List<CourseAssessmentDetails> findAllCourseAssessment(){
    return courseAssessmentDetailsRepository.findAll();

  }
  //find by id
  public Optional<CourseAssessmentDetails> findByCourseAssessmentId(Long courseAssessmentId){
return courseAssessmentDetailsRepository.findById(courseAssessmentId);  
}

  //patchear CourseAssessmentDetails
  public Optional<CourseAssessmentDetails> patchSong(Long id, CourseAssessmentDetails CourseAssessmentDetails) {
    Optional<CourseAssessmentDetails> optionalCourseAssessmentDetails = courseAssessmentDetailsRepository.findById(id);
    if (optionalCourseAssessmentDetails.isPresent()) {
        CourseAssessmentDetails existingCourseAssessmentDetails = optionalCourseAssessmentDetails.get();
        if (CourseAssessmentDetails.getScore() != null) {
            existingCourseAssessmentDetails.setScore(CourseAssessmentDetails.getScore());
        }
        if (CourseAssessmentDetails.getSection() != null) {
            existingCourseAssessmentDetails.setSection(CourseAssessmentDetails.getSection());
        }
        if (CourseAssessmentDetails.getStudent() != null) {
            existingCourseAssessmentDetails.setStudent(CourseAssessmentDetails.getStudent());
        }
        if (CourseAssessmentDetails.getProfessor() != null) {
            existingCourseAssessmentDetails.setProfessor(CourseAssessmentDetails.getProfessor());
        }
        if (CourseAssessmentDetails.getCourseAssessment()!= null) {
            existingCourseAssessmentDetails.setCourseAssessment(CourseAssessmentDetails.getCourseAssessment());
        }
        if (CourseAssessmentDetails.getSectionGroup()!= null) {
            existingCourseAssessmentDetails.setSectionGroup(CourseAssessmentDetails.getSectionGroup());
        }
        
        courseAssessmentDetailsRepository.save(existingCourseAssessmentDetails);
        }
        return optionalCourseAssessmentDetails;

    }

//put 
public CourseAssessmentDetails updateCourse(Long id, CourseAssessmentDetails course) {
    Optional<CourseAssessmentDetails> existingCourse = courseAssessmentDetailsRepository.findById(id);
    if (existingCourse.isPresent()) {
        course.setId(id);
        return courseAssessmentDetailsRepository.save(course);
    }
    return null;
}

    //delete

    public void deleteCourseAssessmentDetails(Long id) {
         courseAssessmentDetailsRepository.deleteById(id) ;
    }

}
