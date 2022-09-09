package org.devshred.mapstruct.dummy;

import java.util.Objects;

public class DummyEntity {
    private Long id;
    private String field01;
    private String field02;
    private String field03;
    private String field04;
    private String field05;
    private String field06;
    private String field07;
    private String field08;
    private String field09;
    private String field10;
    private String field11;
    private String field12;
    private String field13;
    private String field14;
    private String field15;
    private String field16;
    private String field17;
    private String field18;
    private String field19;
    private String field20;

    public DummyEntity() {}

    public DummyEntity(Long id, String field01, String field02, String field03, String field04, String field05,
            String field06, String field07, String field08, String field09, String field10, String field11,
            String field12, String field13, String field14, String field15, String field16, String field17,
            String field18, String field19, String field20) {
        this.id = id;
        this.field01 = field01;
        this.field02 = field02;
        this.field03 = field03;
        this.field04 = field04;
        this.field05 = field05;
        this.field06 = field06;
        this.field07 = field07;
        this.field08 = field08;
        this.field09 = field09;
        this.field10 = field10;
        this.field11 = field11;
        this.field12 = field12;
        this.field13 = field13;
        this.field14 = field14;
        this.field15 = field15;
        this.field16 = field16;
        this.field17 = field17;
        this.field18 = field18;
        this.field19 = field19;
        this.field20 = field20;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getField01() {
        return field01;
    }

    public void setField01(String field01) {
        this.field01 = field01;
    }

    public String getField02() {
        return field02;
    }

    public void setField02(String field02) {
        this.field02 = field02;
    }

    public String getField03() {
        return field03;
    }

    public void setField03(String field03) {
        this.field03 = field03;
    }

    public String getField04() {
        return field04;
    }

    public void setField04(String field04) {
        this.field04 = field04;
    }

    public String getField05() {
        return field05;
    }

    public void setField05(String field05) {
        this.field05 = field05;
    }

    public String getField06() {
        return field06;
    }

    public void setField06(String field06) {
        this.field06 = field06;
    }

    public String getField07() {
        return field07;
    }

    public void setField07(String field07) {
        this.field07 = field07;
    }

    public String getField08() {
        return field08;
    }

    public void setField08(String field08) {
        this.field08 = field08;
    }

    public String getField09() {
        return field09;
    }

    public void setField09(String field09) {
        this.field09 = field09;
    }

    public String getField10() {
        return field10;
    }

    public void setField10(String field10) {
        this.field10 = field10;
    }

    public String getField11() {
        return field11;
    }

    public void setField11(String field11) {
        this.field11 = field11;
    }

    public String getField12() {
        return field12;
    }

    public void setField12(String field12) {
        this.field12 = field12;
    }

    public String getField13() {
        return field13;
    }

    public void setField13(String field13) {
        this.field13 = field13;
    }

    public String getField14() {
        return field14;
    }

    public void setField14(String field14) {
        this.field14 = field14;
    }

    public String getField15() {
        return field15;
    }

    public void setField15(String field15) {
        this.field15 = field15;
    }

    public String getField16() {
        return field16;
    }

    public void setField16(String field16) {
        this.field16 = field16;
    }

    public String getField17() {
        return field17;
    }

    public void setField17(String field17) {
        this.field17 = field17;
    }

    public String getField18() {
        return field18;
    }

    public void setField18(String field18) {
        this.field18 = field18;
    }

    public String getField19() {
        return field19;
    }

    public void setField19(String field19) {
        this.field19 = field19;
    }

    public String getField20() {
        return field20;
    }

    public void setField20(String field20) {
        this.field20 = field20;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        DummyEntity that = (DummyEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(field01, that.field01)
                && Objects.equals(field02, that.field02) && Objects.equals(field03, that.field03)
                && Objects.equals(field04, that.field04) && Objects.equals(field05, that.field05)
                && Objects.equals(field06, that.field06) && Objects.equals(field07, that.field07)
                && Objects.equals(field08, that.field08) && Objects.equals(field09, that.field09)
                && Objects.equals(field10, that.field10) && Objects.equals(field11, that.field11)
                && Objects.equals(field12, that.field12) && Objects.equals(field13, that.field13)
                && Objects.equals(field14, that.field14) && Objects.equals(field15, that.field15)
                && Objects.equals(field16, that.field16) && Objects.equals(field17, that.field17)
                && Objects.equals(field18, that.field18) && Objects.equals(field19, that.field19)
                && Objects.equals(field20, that.field20);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field01, field02, field03, field04, field05, field06, field07, field08, field09,
                field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DummyEntity{");
        sb.append("id=").append(id);
        sb.append(", field01='").append(field01).append('\'');
        sb.append(", field02='").append(field02).append('\'');
        sb.append(", field03='").append(field03).append('\'');
        sb.append(", field04='").append(field04).append('\'');
        sb.append(", field05='").append(field05).append('\'');
        sb.append(", field06='").append(field06).append('\'');
        sb.append(", field07='").append(field07).append('\'');
        sb.append(", field08='").append(field08).append('\'');
        sb.append(", field09='").append(field09).append('\'');
        sb.append(", field10='").append(field10).append('\'');
        sb.append(", field11='").append(field11).append('\'');
        sb.append(", field12='").append(field12).append('\'');
        sb.append(", field13='").append(field13).append('\'');
        sb.append(", field14='").append(field14).append('\'');
        sb.append(", field15='").append(field15).append('\'');
        sb.append(", field16='").append(field16).append('\'');
        sb.append(", field17='").append(field17).append('\'');
        sb.append(", field18='").append(field18).append('\'');
        sb.append(", field19='").append(field19).append('\'');
        sb.append(", field20='").append(field20).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
