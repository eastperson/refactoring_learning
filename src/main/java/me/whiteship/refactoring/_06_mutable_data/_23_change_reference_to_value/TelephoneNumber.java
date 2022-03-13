package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

import java.util.Objects;

public class TelephoneNumber {

    private final String areaCode;

    private final String number;

    // final 값은 초기화를 해줘야 한다.
    public TelephoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String areaCode() {
        return areaCode;
    }

    // 같은 값을 가지고 있는 객체라면 같은 객체임을 확인할 수 있도록 만들어줘야 한다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneNumber that = (TelephoneNumber) o;
        return Objects.equals(areaCode, that.areaCode) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }

    public String number() {
        return number;
    }
}
