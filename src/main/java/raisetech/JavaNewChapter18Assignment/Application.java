package raisetech.JavaNewChapter18Assignment;

import java.util.Map;
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

  // schoolをインスタンス化
  School school = new School();

  @GetMapping("/studentInfo")
  public String getStudentInfo() {
    StringBuilder studentInfo = new StringBuilder(); //可変長の文字列

    for (Map.Entry<Integer, StudentInfo> entry : school.getEntrySet()) {
      studentInfo.append(entry.getKey()).append("番 ").append(entry.getValue().getName())
          .append("：").append(entry.getValue().getAge()).append("歳　");
    }
    return studentInfo.toString(); //getStudentInfoがString型なので、Stringに変換
  }

  @PostMapping("/updateStudentInfo")
  public void updateStudentInfo(int id, String newName, String newAge) {
    school.updateStudentInfo(id, newName, newAge);
  }
}
