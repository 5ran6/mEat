package meat.mountedwings.org.helper;

public class StringSerializer {
    public StringSerializer() {
        super();

    }


    public String[] phone(String number) {
//     double[] phone_number = new double[3];
//     double country_code;
//     double area_code;
//     double phone;
        String[] phoneNumArr = {number.substring(0, 3),
                number.substring(3, 6),
                number.substring(6)};

        return phoneNumArr;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
