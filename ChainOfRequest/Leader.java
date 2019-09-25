package ChainOfRequest;

public abstract class Leader {
    protected String leaderName;
    private Leader nextLeader;
    protected LeaveRequest leaveRequest;

    public Leader(String leaderName) {
        this.leaderName = leaderName;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handRequest(LeaveRequest leaveRequest);
}
