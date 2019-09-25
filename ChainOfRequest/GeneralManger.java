package ChainOfRequest;

/**
 * 总经理
 */
public class GeneralManger extends Leader {

    public GeneralManger(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handRequest(LeaveRequest leaveRequest) {
       if (leaveRequest.getDay()<30){
           System.out.println(leaveRequest.getEmpName()+"请假"+leaveRequest.getDay()+"天"+"，原因："+leaveRequest.getReason());
           System.out.println("总经理"+this.leaderName+"予以批准");
       }else {
           System.out.println("总经理"+this.leaderName+"不予以批准"+"原因：请假时间过长");
       }
    }
}
