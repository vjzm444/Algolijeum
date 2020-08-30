/*
제목 : Student.java
만든날짜 : 2020-08-18
만든이 : 송현주
코멘트 : 1번 학생이름 저장 및 검색
*/
package lesson;

public class Student {
  private String name;
  private String no;

  public  Student(String name, String no){
      super();
      this.name = name;
      this.no = no;
  }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
