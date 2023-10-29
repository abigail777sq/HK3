package com.example.demo.Application;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.CourseAssessmentDetails;
import com.example.demo.domain.CourseAssessmentDetailsService;
import com.example.demo.domain.ProfessorService;

@RestController
@RequestMapping("/CoursesAssessmentDetails")
public class CourseAssessmentDetailsController {
    @Autowired
    CourseAssessmentDetailsService courseAssessmentDetailsService;
    @Autowired
    ProfessorService professorService;
       @GetMapping
    public ResponseEntity<List<CourseAssessmentDetails>> getAllCourses() {
        return new ResponseEntity<>(courseAssessmentDetailsService.findAllCourseAssessment(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CourseAssessmentDetails> getByid(@PathVariable Long id) {
        Optional<CourseAssessmentDetails> courses = courseAssessmentDetailsService.findByCourseAssessmentId(id);
        return new ResponseEntity<>(courses.get(), HttpStatus.OK);
    }
    @PostMapping
    public CourseAssessmentDetails createCourseAssessmentDetails(@RequestBody CourseAssessmentDetails courseAssessmentDetails) {
        return courseAssessmentDetailsService.saveCourseAssessment(courseAssessmentDetails);
    }
    @DeleteMapping("/{id}")
    public void deleteCourseAssessmentDetails(@PathVariable Long id){
            courseAssessmentDetailsService.deleteCourseAssessmentDetails(id);
             new ResponseEntity<>(HttpStatus.OK);
        
    }
}
