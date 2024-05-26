package raisetech.JavaNewChapter18Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class School {

  Map<Integer, StudentInfo> students = new HashMap<>();

  public School() {
    students.put(1, new StudentInfo("Taro", "18"));
    students.put(2, new StudentInfo("Jiro", "17"));
    students.put(3, new StudentInfo("Saburo", "16"));
  }

  public Set<Entry<Integer, StudentInfo>> getEntrySet() {
    return students.entrySet();
  }

  public void updateStudentInfo(int id, String newName, String newAge) {
    StudentInfo student = students.get(id);
    if (student != null) {
      student.setName(newName);
      student.setAge(newAge);
    }
  }
}
