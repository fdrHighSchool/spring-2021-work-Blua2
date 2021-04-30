public class stepTracker {
    private int ActiveDays;
    private int tSteps;
    private int mSteps;
    private int Days;
   
    public StepTracker(int def){
        tSteps = 0;
        Days = 0;
        ActiveDays = 0;
        mSteps = def;
    }

    public int activeDays(){
        return ActiveDays;
    }

    public void addDailySteps(int steps){
        tsteps += steps;
        Days++;
        ActiveDays = (steps > mSteps) ? ActiveDays++ : ActiveDays;
    }

    public double averageSteps(){
        if(Days == 0){
            return 0.0;
        }
        else{
            return (double) tSteps/Days;
        }
    }
}