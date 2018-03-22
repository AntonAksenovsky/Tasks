public enum rank {
    ENGINEER("инженер"),
    SENIOR_ENGINEER("старший инженер"),
    LEADING_ENGINEER("ведущий инженер"),
    PROGRAMMER("программист"),
    SENIOR_PROGRAMMER("старший программист"),
    TESTER("тестировщик"),
    SENIOR_TESTER("старший тестировщик"),
    DIRECTOR("директор");

    rank(String name){

    }

    public String getName() {
        return name;
    }

    private String name;

}