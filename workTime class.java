package WorkPermission;

import java.util.Objects;

public class WorkTime {

    private String id;
    private String journeyPlanManager;
    private String ManagerId;
    private String date;
    private String startTime;
    private String endTime;
    private String timeLeft;
    private String timeArrived;

    public workTime(String id, String journeyPlanManager, String managerId, String date,
                    String startTime, String endTime, String timeLeft, String timeArrived) {
        this.id = id;
        this.journeyPlanManager = journeyPlanManager;
        ManagerId = managerId;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.timeLeft = timeLeft;
        this.timeArrived = timeArrived;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJourneyPlanManager() {
        return journeyPlanManager;
    }

    public void setJourneyPlanManager(String journeyPlanManager) {
        this.journeyPlanManager = journeyPlanManager;
    }

    public String getManagerId() {
        return ManagerId;
    }

    public void setManagerId(String managerId) {
        ManagerId = managerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
    }

    public String getTimeArrived() {
        return timeArrived;
    }

    public void setTimeArrived(String timeArrived) {
        this.timeArrived = timeArrived;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        workTime workTime = (workTime) o;
        return Objects.equals(id, workTime.id) && Objects.equals(ManagerId, workTime.ManagerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ManagerId);
    }

    @Override
    public String toString() {
        return "workTime{" +
                "id='" + id + '\'' +
                ", journeyPlanManager='" + journeyPlanManager + '\'' +
                ", ManagerId='" + ManagerId + '\'' +
                ", date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", timeLeft='" + timeLeft + '\'' +
                ", timeArrived='" + timeArrived + '\'' +
                '}';
    }
}
