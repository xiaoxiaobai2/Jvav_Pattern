package ChainOfRequest;

/**
 * 经理
 */
public class Manger extends Leader {

    public Manger(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handRequest(LeaveRequest leaveRequest) {
       if (leaveRequest.getDay()<10){
           System.out.println(leaveRequest.getEmpName()+"请假"+leaveRequest.getDay()+"天"+"，原因："+leaveRequest.getReason());
           System.out.println("经理"+this.leaderName+"予以批准");
       }else {
           this.getNextLeader().handRequest(leaveRequest);
       }
    }
}
