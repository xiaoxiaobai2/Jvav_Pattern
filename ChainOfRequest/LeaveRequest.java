package ChainOfRequest;


/**
 * 请假类（模板）
 */
public class LeaveRequest {
    private String empName;
    private int day;//请假天数
    private String reason;

    public LeaveRequest(String empName, int day, String reason) {
        this.empName = empName;
        this.day = day;
        this.reason = reason;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
