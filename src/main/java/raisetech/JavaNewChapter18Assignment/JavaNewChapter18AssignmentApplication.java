package raisetech.JavaNewChapter18Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaNewChapter18AssignmentApplication {

  public static void main(String[] args) {
    SpringApplication.run(JavaNewChapter18AssignmentApplication.class, args);
  }

  StudentInfo studentinfo = new StudentInfo("Taro", "25");

  @GetMapping("/studentInfo")
  public String getStudentInfo() {
    return studentinfo.getName() + "　" + studentinfo.getAge() + "歳";
  }

  @PostMapping("/studentInfo")
  public void setStudentInfo(String newName, String newAge) {
    studentinfo.setName(newName);
    studentinfo.setAge(newAge);
  }
}
