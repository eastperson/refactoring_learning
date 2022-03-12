package me.whiteship.refactoring._01_smell_mysterious_name._03_rename_field;

// record 를 사용해서 정의하면 정의한 파라미터로 생성자를 만들어주고
// getter, setter, equals and hash code를 만들어준다.
public record StudyReview(String reviewer, String review) {
}
