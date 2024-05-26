package raisetech.JavaNewChapter18Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  StudentInfo studentInfo = new StudentInfo("Taro", "25");

  @GetMapping("/studentInfo")
  public String getStudentInfo() {
    return studentInfo.getName() + "　" + studentInfo.getAge() + "歳";
  }

  @PostMapping("/studentInfo")
  public void setStudentInfo(String newName, String newAge) {
    studentInfo.setName(newName);
    studentInfo.setAge(newAge);
  }
}
