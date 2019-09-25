package ChainOfRequest;

/**
 * 主任
 */
public class Director extends Leader {

    public Director(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handRequest(LeaveRequest leaveRequest) {
       if (leaveRequest.getDay()<3){
           System.out.println(leaveRequest.getEmpName()+"请假"+leaveRequest.getDay()+"天"+"，原因："+leaveRequest.getReason());
           System.out.println("主任"+this.leaderName+"予以批准");
       }else {
           this.getNextLeader().handRequest(leaveRequest);
       }
    }
}
