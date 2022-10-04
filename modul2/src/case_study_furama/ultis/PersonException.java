package case_study_furama.ultis;

public class PersonException extends Exception {
    public PersonException(String message) {
        super(message);
    }
    public static void nameCheck(String name) throws PersonException {
        String[] arrName = name.trim().split(" ");
        for (String s : arrName) {
            if (!s.matches("[A-ZĐ][a-záàảạãăắằặẵâấầẫậẩéèẻẽẹêếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịùúủũụưứửữựỵỷỹýỳ]{2,}")) {
                throw new PersonException("Tên không khớp chuẩn tiếng Việt, xin nhập lại");
            }
        }
        System.out.println("Nhập dữ liệu thành công");
    }

    public static void dayBirthCheck(String dayBirth) throws PersonException {
        if(!dayBirth.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")){
            throw new PersonException("Ngày/Tháng/Năm ko hợp lệ, mời nhập lại");
        }
        System.out.println("Nhập dữ liệu thành công");

    }

    public static void genderCheck(String gender) throws PersonException {
        if(!gender.matches("(Nam|Nữ|nam|nữ|)")){
            throw new PersonException("Sai giới tính , mời nhập lại");
        }
        System.out.println("Nhập dữ liệu thành công");
    }

    public  static void idCardCheck(String idCard) throws PersonException {
        if(!idCard.matches("[0-9]{12}|[0-9]{9}")){
            throw new PersonException("Sai định dạng CMND ,CCCD mời nhập lại ");
        }
        System.out.println("Nhập dữ liệu thành công");
    }

    public static void phoneCheck(String phone) throws PersonException {
        if(!phone.matches("0[1-9][0-9]{8}")){
            throw new PersonException("Sai định dạng ,mời nhập lại");
        }
        System.out.println("Nhập thành công");

    }

    public  static void emailCheck(String email) throws PersonException {
        if(!email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$")){
            throw new PersonException("Sai định dạng email");
        }
        System.out.println("Nhập thành công");
    }
}
