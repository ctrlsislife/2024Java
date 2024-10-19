package sector02_field;

import java.sql.SQLOutput;

public class Field_04_FieldInitValueMain {
    public static void main(String[] args) {

        // 자동 초기화
        Field_03_FieldInitValue fiv = new Field_03_FieldInitValue();

        System.out.println("ByteField: " + fiv.byteField);
        System.out.println("shortField: " + fiv.shortField);
        System.out.println("intField: " + fiv.intField);
        System.out.println("longField: " + fiv.longField);
        System.out.println("booleanField: " + fiv.booleanField);
        System.out.println("charField: " + fiv.charField);
        System.out.println("floatField: " + fiv.floatField);
        System.out.println("doubleField: " + fiv.doubleField);
        System.out.println("intArrayField: " + fiv.intArrayField);
        System.out.println("referenceFIeld: " + fiv.referenceField);
    }
}
